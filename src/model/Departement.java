/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jonathanraillard
 */


public class Departement {
    private int noDept;
    private String nom;
    private int noLieu;
    
    public Departement(int noDept, String nom, int noLieu){
        this.noDept = noDept;
        this.nom = nom;
        this.noLieu = noLieu;
    }

    public int getNoDept() {
        return noDept;
    }

    public String getNom() {
        return nom;
    }

    public int getNoLieu() {
        return noLieu;
    }

    public String toString() {
        return nom;
    }

    public int hashCode() {
        int hash = 5;
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
        final Departement other = (Departement) obj;
        if (this.noDept != other.noDept) {
            return false;
        }
        return true;
    }
    
    
    
    
}
