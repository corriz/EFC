package cz.uhk.shop.domain;

/**
 * Fasada eShopu - centralni trida aplikacni logiky
 * @author kozelto1
 *
 */
public class ShopManager {
	private Katalog katalog;
	
	public Katalog getKatalog() {
		return katalog;
	}
	public void setKatalog(Katalog katalog) {
		this.katalog = katalog;
	}
	
}
