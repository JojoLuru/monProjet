/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author jonathanraillard
 */
public class Listage {
    public static ArrayList listEmp = new ArrayList();
    public static ArrayList lstDepartement = new ArrayList();
    public static ArrayList lstFonction = new ArrayList();
    public static ArrayList lstLieu = new ArrayList();

    private static void lister(Connection con){
        try{
            Statement stmtEmp = con.createStatement();
            Statement stmtDept = con.createStatement();
            Statement stmtFunct = con.createStatement();
            Statement stmtLieu = con.createStatement();
        
            ResultSet rsEmp = stmtEmp.executeQuery("SELECT * FROM Employe ORDER BY NomEmpl");
            
            while(rsEmp.next()){
                Employe Emp = new Employe(Integer.parseInt(rsEmp.getString("NoEmpl")), rsEmp.getString("NomEmpl"),rsEmp.getString("PrenomEmpl"),rsEmp.getDate("DateEmpl"),Integer.parseInt(rsEmp.getString("NoFonc")) ,Integer.parseInt(rsEmp.getString("NoDept")));
                int indEmp = listEmp.indexOf(Emp);
                if(indEmp == -1){
                    listEmp.add(Emp);
                }                       
            }
            
            ResultSet rsDept = stmtDept.executeQuery("SELECT * FROM Departement WHERE NoDept");
            while(rsDept.next()){
                int noLieu = Integer.parseInt(rsDept.getString("NoLieu"));
                Departement Dept = new Departement(Integer.parseInt(rsDept.getString("NoDept")), rsDept.getString("NomDept"), noLieu);
                int indDep = lstDepartement.indexOf(Dept);
                if(indDep == -1){
                    lstDepartement.add(Dept);
                }   
            } 
            
            ResultSet rsFonct = stmtFunct.executeQuery("SELECT * FROM Fonction WHERE NoFonc ");
            while(rsFonct.next()){
                Fonction Fonc = new Fonction(Integer.parseInt(rsFonct.getString("NoFonc")), rsFonct.getString("NomFonc"));
                int ind = lstFonction.indexOf(Fonc);
                if(ind == -1){
                    lstFonction.add(Fonc);
                }
            }
                
            ResultSet rsLieu = stmtLieu.executeQuery("SELECT * FROM Lieu");
            while(rsLieu.next()){
                Lieu Li = new Lieu(Integer.parseInt(rsLieu.getString("NoLieu")),rsLieu.getString("NomLieu"));
                int ind = lstLieu.indexOf(Li);
                if(ind==-1){
                    lstLieu.add(Li);
                }
            }    
            stmtDept.close(); stmtFunct.close(); stmtLieu.close(); stmtEmp.close();
        } 
        catch (SQLException e) {System.err.println("Erreur SQL : " + e.getMessage());}
    } //lister
    
    
    public static void importation() throws Exception{
        Connection con = mysql.Outils.connect("EmplDept"); System.out.println("Base de données MySQL \"EmplDept\"");  
        lister(con);
        con.close();
    }
    
    
}
