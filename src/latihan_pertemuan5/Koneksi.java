/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_pertemuan5;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mumu
 */
public class Koneksi {
public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/latihan_p5";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            return conn;

        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
            return null;
        }
    }
}