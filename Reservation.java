package com.example.hotel.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Integer reservationId;

    @Column(name = "guest_name")
    private String guestName;

    @Column(name = "room_number")
    private Integer roomNumber;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "reservation_date")
    private LocalDateTime reservationDate;

    // Automatically assigns the system timestamp right before saving to MySQL
    @PrePersist
    public void setReservationDate() {
        reservationDate = LocalDateTime.now();
    }

    // Default No-Argument Constructor (Required by JPA)
    public Reservation() {
    }

    // Getters and Setters
    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }
}