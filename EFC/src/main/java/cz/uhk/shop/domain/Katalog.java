/*
 * Katalog.java
 *
 * Created on 7. b�ezen 2007, 14:11
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
     * Vraci seznam polo�ek katalogu
     * @return seznam
     */
    public List<Polozka> getPolozky();
    /**
     * P�id�v� polo�ku do katalogu
     * @param p
     */
    public void pridej(Polozka p);
    /**
     * Odstra�uje instanci polo�ky
     * @param p
     */
    public void odstran(Polozka p);
    /**
     * Odstra�uje polo�ku dle id
     * @param p
     */
    public void odstran(int id);
    /**
     * Vrac� polo�ku dle zadan�ho id
     * @param id
     * @return
     */
    public Polozka getById(int id);
	    
}
