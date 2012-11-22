/*
 * Katalog.java
 *
 * Created on 7. bøezen 2007, 14:11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package cz.uhk.shop.domain;

import cz.uhk.shop.domain.Polozka;
import java.util.List;

/**
 * Rozhrani pro spravu katalogu polozek
 * @author kozelto1
 */
public interface Katalog {
    
    /**
     * Vraci seznam položek katalogu
     * @return seznam
     */
    public List<Polozka> getPolozky();
    /**
     * Pøidává položku do katalogu
     * @param p
     */
    public void pridej(Polozka p);
    /**
     * Odstraòuje instanci položky
     * @param p
     */
    public void odstran(Polozka p);
    /**
     * Odstraòuje položku dle id
     * @param p
     */
    public void odstran(int id);
    /**
     * Vrací položku dle zadaného id
     * @param id
     * @return
     */
    public Polozka getById(int id);
	    
}
