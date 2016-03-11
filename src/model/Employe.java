/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Date;
/**
 *
 * @author jonathanraillard
 */
public class Employe {
    protected int noEmpl;
    protected String nom;
    protected String prenom;
    protected Date date;
    protected int noFonc;
    protected int noDepartement;
    
    //construteur
    public Employe(int noEmpl, String nom, String prenom, Date date, int noFonc, int noDepartement){
        this.noEmpl = noEmpl;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.noFonc = noFonc;
        this.noDepartement = noDepartement;
    }
    
    public Employe(String nom, String prenom, Date date, int noFonc, int noDepartement){
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.noFonc = noFonc;
        this.noDepartement = noDepartement;
    }

    public int getNoEmpl() {
        return noEmpl;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDate() {
        return date;
    }

    public int getNoFonc() {
        return noFonc;
    }

    public int getNoDepartement() {
        return noDepartement;
    }

    public int hashCode() {
        int hash = 3;
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        if (this.noEmpl != other.noEmpl) {
            return false;
        }
        return true;
    }
     
    //toString
    public String toString (){
        return this.nom + " " + this.prenom;
    }
    
}
