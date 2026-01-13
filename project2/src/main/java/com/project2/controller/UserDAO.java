//package com.mvc.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class UserDAO {
//
////    @Autowired
////    JdbcTemplate jdbc;
//
//    public boolean validate(String username, String password) {
//
//        String sql = "SELECT COUNT(*) FROM users WHERE username=? AND password=?";
//        Integer count = jdbc.queryForObject(sql, Integer.class, username, password);
//        return count != null && count > 0;
//    }
//}
