package org.example;

import org.springframework.stereotype.Repository;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


@Repository
public class LoginDAO {

    public String Validate(String uname, String pass) {

        Connection con = null;
        String password = null;
        String result = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/userdb",
                    "root",
                    "@Suraj1995#"
            );

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
                    "SELECT password FROM user_details WHERE username='" + uname + "'"
            );

            if (rs.next()) {
                password = rs.getString(1);
            }

            if (password != null && password.equals(pass)) {
                result = "Success";
            } else {
                result = "Fail";
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (con != null) con.close(); } catch (Exception ignored) {}
        }

        return result;
    }

    public String userRegistration(String name, String branch, String contact,
                                   String email, String userName, String passWord) {

        Connection con = null;
        String result = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/userdb",
                    "root",
                    "@Suraj1995#"
            );

            Statement st = con.createStatement();
            int i = st.executeUpdate(
                    "INSERT INTO user_details(name,branch,contact,email,username,password) VALUES('"
                            + name + "','" + branch + "','" + contact + "','" + email + "','"
                            + userName + "','" + passWord + "')"
            );

            if (i > 0) {
                result = userName;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}




