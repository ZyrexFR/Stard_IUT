/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCarte;

import Metier.Carte.Carte;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class TestCarte {
    
    @Test
    /**
     * @author Kevin Lamblin
     */
    public void TestGetCarte(){
        Carte c = Carte.getCarte();
        
        assertNotEquals(null, c);
    }
    
}
