import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SignupServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/learning_app","root","your_password");

            String query = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, user);
            ps.setString(2, pass);

            ps.executeUpdate();

            response.getWriter().println("Signup Successful!");

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
