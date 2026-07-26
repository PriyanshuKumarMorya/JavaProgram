package HotelMangementSystemTask3;

import java.sql.*;
import java.util.Scanner;

public class HotelManagementSystem {

    private static final String URL = "jdbc:mysql://localhost:3306/hotels";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Shikha@123";


    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            while (true) {

                System.out.println("\n HOTEL RESERVATION SYSTEM ");
                System.out.println("1. Search Available Rooms");
                System.out.println("2. Book Room");
                System.out.println("3. View Reservation Details");
                System.out.println("4. Cancel Reservation");
                System.out.println("5. Make Payment");
                System.out.println("6. View All Reservations");
                System.out.println("0. Exit");
                System.out.print("Choose option: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> searchRooms(connection, scanner);
                    case 2 -> bookRoom(connection, scanner);
                    case 3 -> viewBooking(connection, scanner);
                    case 4 -> cancelReservation(connection, scanner);
                    case 5 -> makePayment(connection, scanner);
                    case 6 -> viewAll(connection);
                    case 0 -> {
                        exit();
                        return;
                    }
                    default -> System.out.println("Invalid choice");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SEARCH Room
    private static void searchRooms(Connection con, Scanner sc) throws SQLException {

        System.out.println("\nRoom Types:");
        System.out.println("1. Standard");
        System.out.println("2. Deluxe");
        System.out.println("3. Suite");
        System.out.print("Choose: ");

        String type = switch (sc.nextInt()) {
            case 1 -> "Standard";
            case 2 -> "Deluxe";
            case 3 -> "Suite";
            default -> {
                System.out.println("Invalid type");
                yield "";
            }
        };

        if (type.isEmpty()) return;

        String sql = "SELECT * FROM rooms WHERE room_type=? AND available=TRUE";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, type);

        ResultSet rs = ps.executeQuery();

        System.out.println("\nAvailable Rooms:");
        while (rs.next()) {
            System.out.println("Room: " + rs.getInt("room_number") +
                    " | Type: " + rs.getString("room_type") +
                    " | Price: ₹" + rs.getDouble("price"));
        }
    }

    // BOOK Room
    private static void bookRoom(Connection con, Scanner sc) throws SQLException {

        System.out.print("Guest Name: ");
        String name = sc.next();
        sc.nextLine();

        System.out.print("Room Number: ");
        int roomNo = sc.nextInt();

        System.out.print("Contact: ");
        String contact = sc.next();

        // get room info
        String roomSql = "SELECT * FROM rooms WHERE room_number=? AND available=TRUE";
        PreparedStatement rp = con.prepareStatement(roomSql);
        rp.setInt(1, roomNo);

        ResultSet rs = rp.executeQuery();

        if (!rs.next()) {
            System.out.println("Room not available!");
            return;
        }

        String type = rs.getString("room_type");
        double price = rs.getDouble("price");

        // insert reservation
        String sql = "INSERT INTO reservations (guest_name, room_number, room_type, contact_number, amount, payment_status) VALUES (?,?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ps.setInt(2, roomNo);
        ps.setString(3, type);
        ps.setString(4, contact);
        ps.setDouble(5, price);
        ps.setString(6, "PENDING");

        ps.executeUpdate();

        // update room
        PreparedStatement up = con.prepareStatement("UPDATE rooms SET available=FALSE WHERE room_number=?");
        up.setInt(1, roomNo);
        up.executeUpdate();

        System.out.println("Booking successful!");
    }

    // View Booking
    private static void viewBooking(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Reservation ID: ");
        int id = sc.nextInt();

        String sql = "SELECT * FROM reservations WHERE reservation_id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("\nBooking Details ");
            System.out.println("ID: " + rs.getInt("reservation_id"));
            System.out.println("Name: " + rs.getString("guest_name"));
            System.out.println("Room: " + rs.getInt("room_number"));
            System.out.println("Type: " + rs.getString("room_type"));
            System.out.println("Amount: ₹" + rs.getDouble("amount"));
            System.out.println("Status: " + rs.getString("payment_status"));
        } else {
            System.out.println("Not found!");
        }
    }

    // cancel
    private static void cancelReservation(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Reservation ID: ");
        int id = sc.nextInt();

        PreparedStatement ps = con.prepareStatement("SELECT room_number FROM reservations WHERE reservation_id=?");
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (!rs.next()) {
            System.out.println("Reservation not found!");
            return;
        }

        int roomNo = rs.getInt("room_number");

        PreparedStatement del = con.prepareStatement("DELETE FROM reservations WHERE reservation_id=?");
        del.setInt(1, id);
        del.executeUpdate();

        PreparedStatement up = con.prepareStatement("UPDATE rooms SET available=TRUE WHERE room_number=?");
        up.setInt(1, roomNo);
        up.executeUpdate();

        System.out.println("Reservation cancelled!");
    }

    // Payment process
    private static void makePayment(Connection con, Scanner sc) throws SQLException {

        System.out.print("Reservation ID: ");
        int id = sc.nextInt();

        PreparedStatement ps = con.prepareStatement("SELECT amount FROM reservations WHERE reservation_id=?");
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            double amount = rs.getDouble("amount");

            System.out.println("Processing payment of ₹" + amount);
            Payment.process(amount);

            PreparedStatement up = con.prepareStatement(
                    "UPDATE reservations SET payment_status='PAID' WHERE reservation_id=?"
            );
            up.setInt(1, id);
            up.executeUpdate();

            System.out.println("Payment successful!");
        } else {
            System.out.println("Reservation not found!");
        }
    }

    // viewAll
    private static void viewAll(Connection con) throws SQLException {

        String sql = "SELECT * FROM reservations";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        System.out.println("\n All Reservations ");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("reservation_id") + " | " +
                            rs.getString("guest_name") + " | Room " +
                            rs.getInt("room_number") + " | " +
                            rs.getString("room_type") + " | ₹" +
                            rs.getDouble("amount") + " | " +
                            rs.getString("payment_status")
            );
        }
    }

    // Exit the hotel
    private static void exit() {
        System.out.print("Exiting");
        for (int i = 0; i < 5; i++) {
            try { Thread.sleep(300); } catch (Exception ignored) {}
            System.out.print(".");
        }
        System.out.println("\nGoodbye!");
    }

    // INNER class: payment
    static class Payment {
        static void process(double amount) {
            try {
                Thread.sleep(1500);
            } catch (Exception ignored) {}
            System.out.println("Payment of ₹" + amount + " completed.");
        }
    }

    // INNER CLASS: room
    static class Room {
        int roomNumber;
        String type;
        double price;
        boolean available;
    }

    // ineer room: RESERVATION
    static class Reservation {
        int id;
        String name;
        int roomNumber;
        String type;
        double amount;
        String status;
    }

    // Inner Class: Service
    static class HotelService {
        Connection con;

        HotelService(Connection con) {
            this.con = con;
        }
    }
}