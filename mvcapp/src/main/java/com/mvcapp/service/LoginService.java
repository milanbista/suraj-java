package com.mvcapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class LoginService {

    @Autowired
    private DataSource dataSource;

    public boolean login(String username, String password){
        try {
            Connection connection =  dataSource.getConnection();
            PreparedStatement stmt =  connection.prepareStatement("select * from user where username=? and password = ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet result = stmt.executeQuery();

            while (result.next()){
                if(result.getString("username").equals(username) &&
                result.getString("password").equals(password)){
                    return true;
                }
                else {
                    return  false;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
