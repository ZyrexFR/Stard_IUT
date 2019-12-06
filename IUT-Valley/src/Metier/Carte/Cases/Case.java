/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte.Cases;

import Metier.Carte.Coordonnee;
import Metier.Objet.ObjetPlace;
import java.util.Objects;


/**
 *
 * @author Kevin Lamblin 
 */
public abstract class Case {
    
    private Coordonnee position;
    private ObjetPlace objetCorrespondant;
    
    /**
     * @author Kevin Lamblin
     * @param c Coordonnee
     */
    public Case(Coordonnee c){
        position = c;
    }
    
    /**
     * @author Kevin LAmblin
     * Appel la fonction interagir de l'objet placé sur la case
     */
    public void InteragirObjet(){
        objetCorrespondant.Interagir();
    }
    
    /**
     * @author Kevin Lamblin
     * Interraction en fonction du type de case
     */
    public abstract void InteragirCase();
    
    /**
     * @author Kevin Lamblin
     * Renvoie la valeur de objetCorrespondant
     * @return ObjetPlace
     */
    public ObjetPlace getObjetCorrespondant(){
        return objetCorrespondant;
    }
    
    /**
     * @author Kevin Lamblin
     * Definit la valeur de objetCorrespondant
     * @param o 
     */
    public void setObjetCorrespondant(ObjetPlace o){
        objetCorrespondant = o;
    }
    
    /**
     * @author Kevin
     * @return 
     */
    public Coordonnee getCoordonnee(){
        return position;
    }
    
    /**
     * @author Kevin Lamblin
     * @return TypeCase
     */
    public abstract String getCaseType();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.position);
        hash = 41 * hash + Objects.hashCode(this.objetCorrespondant);
        return hash;
    }

    @Override
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
        final Case other = (Case) obj;
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        if (!Objects.equals(this.objetCorrespondant, other.objetCorrespondant)) {
            return false;
        }
        return true;
    }
    
            

}
