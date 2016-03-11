/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import presentation.FrmMain;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
/**
 *
 * @author jonathanraillard
 */
public class InsertEmp {
    
    
    private static void inserer(int id, Connection con, Employe emp){
        int noEmp = id;
        String nom = emp.getNom();
        String pre = emp.getPrenom();
        SimpleDateFormat stf = new SimpleDateFormat("yyyy-MM-dd");
        String date = stf.format(emp.getDate());
        int noFon = emp.getNoFonc();
        int noDep = emp.getNoDepartement();
        
        try{
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO `Employe`(`NoEmpl`, `NomEmpl`, `PrenomEmpl`, `NoFonc`, `DateEmpl`, `NoDept`) VALUES ('"+
                    noEmp+"','"+nom+"','"+pre+"','"+noFon+"','"+date+"','"+noDep+"')");            
            stmt.close();
        }
        catch(SQLException e){System.err.println("Erreur SQL : " + e.getMessage());}
    }
    
    public static int nouvelleIdEmp(Connection con){
        int no = -1;
        try{
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT MAX(NoEmpl) FROM Employe");
           rs.next();
           no = rs.getInt(1)+1;
           stmt.close();
        } catch (Exception e){System.out.println(e.getMessage());}
        return no;
    }
  
    public static void con(Employe Empl) throws Exception{
        Connection con = mysql.Outils.connect("EmplDept"); System.out.println("Base de données MySQL \"EmplDept\"");  
        inserer(nouvelleIdEmp(con),con, Empl);
        con.close();
    }
}
