/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author carlos.chiquillo
 */
public class JavaApplication1 {

    private static final String stringConnection = "jdbc:mysql://localhost:3306/youtube?" +
                "user=root&password=root&autoReconnect=true" +
                "&useSSL=false&allowPublicKeyRetrieval=true";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(stringConnection);
            System.out.print("Connected");
            Statement stt =  con.createStatement();
            String Fname = "Jane";
            String Lname = "Brown";
            String insert = "INSERT INTO user (Fname, Lname) VALUES('"+Fname+"','"+Lname+"')";
            String query = "select * from user";
            stt.executeQuery(query);
            stt.executeUpdate(insert);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
