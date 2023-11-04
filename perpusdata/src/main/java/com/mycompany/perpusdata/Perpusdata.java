/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpusdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Perpusdata {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello Dita!");
        LoginClass tes = new LoginClass();
        String username = null;
        String password = null;
        tes.input();
        tes.login(username, password);
    }
}
