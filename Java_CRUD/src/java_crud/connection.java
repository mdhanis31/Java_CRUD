/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lk09Nu24Uty
 */
public class connection {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            String jdsbcDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(jdsbcDriver);
            
            String url = "jdbc:mysql://localhost:3306/mahasiswa";
            String user = "root";
            String pass = "";
            
            System.out.println("'Membangun Koneksi ke Database'"+url
                    +"'dengan user'"+user);
            conn =DriverManager.getConnection(url,user,pass);
            System.out.println("Success");
        } catch (ClassNotFoundException | SQLException e) {
        }
        finally{
            try {
                if (conn != null) {
                    System.out.println("Menutup koneksi database");
                    conn.close();
                }
            } catch (SQLException e) {
            }
        }
    }
}
