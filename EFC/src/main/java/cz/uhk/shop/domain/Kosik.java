package cz.uhk.shop.domain;

import java.util.*;

/**
 * Rozhrani nakupniho kosiku
 * @author kozelto1
 */
public interface Kosik {
	/**
	 * Updatuje nebo pridava polozku v zadanem mnozstvi v kosiku
	 * @param p polozka zbozi
	 * @param cnt mnozstvi, 0 ... odstrani
	 */
	public void update(Polozka p, int cnt);
	/**
	 * Odstranuje polozku z kosiku
	 * @param p
	 */
	public void odstran(Polozka p);
	/**
	 * Vysype cely obsah kosiku
	 */
	public void vysyp();
	/**
	 * Vraci mapu vsech polozek v kosiku Polozka -> pocet ks
	 * @return
	 */
	public List<PolozkaKosiku> getPolozky();
	
	/**
	 * Vypocita a vrati cenu bez DPH celkem za kosik
	 * @return cena
	 */
	public double getCenaCelkem();
	/**
	 * Vypocita a vrati cenu s DPH celkem za kosik
	 * @return cena
	 */
	public double getCenaSDphCelkem();
}
