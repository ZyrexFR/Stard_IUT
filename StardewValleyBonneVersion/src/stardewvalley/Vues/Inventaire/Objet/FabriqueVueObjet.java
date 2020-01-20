/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Inventaire.Objet;

import stardewvalley.Metier.Personnages.Inventaire.Objets.Mais;
import stardewvalley.Metier.Personnages.Inventaire.Objets.Objet;

/**
 *
 * @author telli
 */
public class FabriqueVueObjet {
    
    public static VueObjet create(Objet o){
        VueObjet vue = null;
        
        switch(o.getType()){
            case "mais":
                vue = new VueMais(o);
            break;
            case "panais":
                vue = new VuePanais(o);
            break;
        }
        return vue;
    }
    
}