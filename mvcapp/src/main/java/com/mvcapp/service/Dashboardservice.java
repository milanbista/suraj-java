package com.mvcapp.service;

import com.mvcapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class Dashboardservice {

    @Autowired
    private DataSource dataSource;

    public User dashboard(String username){

        try {
            Connection connection = dataSource.getConnection();

            PreparedStatement statement =  connection.prepareStatement("select * from user where username = ?");
            statement.setString(1, username);
            ResultSet result =  statement.executeQuery();
            result.next();
            String id =  result.getString("id");
            String name = result.getString("name");
            String dbUsername = result.getString("username");
            String password = result.getString("password");
            String address = result.getString("address");


            User user = new User(id, name, dbUsername, password, address);
            return user;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
