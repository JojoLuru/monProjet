/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author jonathanraillard
 */
public class Outils {
   public static Connection connect (String nomBase) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
       Properties prop = new Properties();
       prop.put("user", "root"); prop.put("password","root");prop.put("charSet","UTF-");
       return DriverManager.getConnection("jdbc:mysql://localhost:8889/" + nomBase, prop);
   } 
}
