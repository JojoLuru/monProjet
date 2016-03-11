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
public class Fonction {
    
    private int noFonction;
    private String nomFonction;
    
    //constructeur
    public Fonction(int noFonction, String nomFonction){
        this.noFonction = noFonction;
        this.nomFonction = nomFonction;
    }

    public String getNomFonction() {
        return nomFonction;
    }

    public int getNoFonction() {
        return noFonction;
    }

    public String toString() {
        return nomFonction;
    }

    public int hashCode() {
        int hash = 7;
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
        final Fonction other = (Fonction) obj;
        if (this.noFonction != other.noFonction) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
