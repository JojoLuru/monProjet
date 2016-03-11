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
public class Lieu {
    private int noLieu;
    private String nomLieu;
    
    public Lieu(int noLieu, String nomLieu){
        this.noLieu = noLieu;
        this.nomLieu = nomLieu;
    }

    public String toString() {
        return nomLieu;
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
        final Lieu other = (Lieu) obj;
        if (this.noLieu != other.noLieu) {
            return false;
        }
        return true;
    }
    
    
    
}
