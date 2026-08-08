import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/learning_app","root","your_password");

            String query = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                response.getWriter().println("Login Successful 🎉");
            } else {
                response.getWriter().println("Invalid credentials");
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

