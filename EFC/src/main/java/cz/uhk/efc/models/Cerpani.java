package cz.uhk.efc.models;

import java.util.Date;

public class Cerpani {
	
	// trida predstavujici samotne cerpani
	
	private int id; // Primary Key; bude poreba?
	private Vozidlo vozidlo; // to ktere cerpalo
	//palivo je v definici vozidla
	private long tachometrStav; // aktulani stav tachometru pri cerpani
	private Date datumCerpani; //kdy se cerpalo
	private float mnozstvi; // pocet cerpanych litru
	private double jednotkovaCena; // cena za litr, muzeme zamenit za celkovou cenu a potom se bude dat cena za litr vypocitat
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Vozidlo getVozidlo() {
		return vozidlo;
	}
	public void setVozidlo(Vozidlo vozidlo) {
		this.vozidlo = vozidlo;
	}
	public long getTachometrStav() {
		return tachometrStav;
	}
	public void setTachometrStav(long tachometrStav) {
		this.tachometrStav = tachometrStav;
	}
	public Date getDatumCerpani() {
		return datumCerpani;
	}
	public void setDatumCerpani(Date datumCerpani) {
		this.datumCerpani = datumCerpani;
	}
	public float getMnozstvi() {
		return mnozstvi;
	}
	public void setMnozstvi(float mnozstvi) {
		this.mnozstvi = mnozstvi;
	}
	public double getJednotkovaCena() {
		return jednotkovaCena;
	}
	public void setJednotkovaCena(double jednotkovaCena) {
		this.jednotkovaCena = jednotkovaCena;
	}
	
	
}
