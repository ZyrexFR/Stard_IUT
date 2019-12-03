/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte.Cases;

import Metier.Carte.Coordonnee;
import Metier.Objet.ObjetPlace;


/**
 *
 * @author Kevin Lamblin 
 */
public abstract class Case {
    
    private Coordonnee position;
    private ObjetPlace objetCorrespondant;
    private TypeCase type;
    
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
    public abstract TypeCase getCaseType();
    
    /**
     * @author Kevin Lamblin
     * @param t TypeCase
     */
    public void setTypeCase(TypeCase t){
        type = t;
    }
            

}