
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos.chiquillo
 */
public class Login {
    public static boolean validate(String name, String email, String pass){
        boolean status = false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            
            
            //Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/qiTscBj5AK", "user=qiTscBj5AK","password=2oOMqQzESD");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?" +
                "user=root&password=root&autoReconnect=true" +
                "&useSSL=false&allowPublicKeyRetrieval=true");
            Statement stt = con.createStatement();
            String query = "select * from users where name='name' and email='email' and pass='pass'";
            status = stt.execute(query);
//            PreparedStatement ps = con.prepareStatement("select * from users where name=? and email=? and pass=?");
//            ps.setString(1, name);
//            ps.setString(2, email);
//            ps.setString(3, pass);
//            
//            ResultSet rs = ps.executeQuery();
//            status = rs.next();
            
           
            
            System.out.println("connecto");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
        return status;
    }
}
