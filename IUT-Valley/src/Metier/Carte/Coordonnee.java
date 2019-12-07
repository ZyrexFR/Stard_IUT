/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte;

/**
 * Correspond à des coordonnée sur la carte
 * @author Kevin Lamblin
 */
public class Coordonnee {
    
    //Valeur de la coordonnée
    private int x; //Largeur
    private int y; //Longueur
    
    /**
     * @author Kevin Lamblin
     * @param x int
     * @param y int
     */
    public Coordonnee(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * @author Kevin Lamblin
     * @return int
     */
    public int getX(){
        return x;
    }
    
    /**
     * @author Kevin Lamblin
     * @param x int
     */
    public void setX(int x){
        this.x = x;
    }
    
    /**
     * @auhor Kevin Lamblin
     * @return int 
     */
    public int getY(){
        return y;
    }
    
    /**
     * @author Kevin Lamblin
     * @param y int
     */
    public void setY(int y){
        this.y = y;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.x;
        hash = 67 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = true;
        if (getClass() != obj.getClass() || obj.equals(null)) {
            res = false;
        }
        final Coordonnee other = (Coordonnee) obj;
        if (this.x != other.x || this.y != other.y) {
            res = false;
        }
        return res;
    }
}
