/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author jonathanraillard
 */
public class DeleteEmp {
    private static void effacer(Connection con, int id){
        try{
            PreparedStatement stmtEff = con.prepareStatement("DELETE FROM Employe WHERE NoEmpl = " + id);
            stmtEff.executeUpdate();
            stmtEff.close();
        }
        catch( SQLException e){System.err.println("Erreur SQL : " + e.getMessage());}
    }
    
    public static void con(int id) throws Exception{
        Connection con = mysql.Outils.connect("EmplDept"); System.out.println("Base de données MySQL \"EmplDept\"");  
        effacer(con, id);
        con.close();
    }
}
