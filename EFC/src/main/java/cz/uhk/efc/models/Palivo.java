package cz.uhk.efc.models;

public class Palivo {
	// trida pro definici ruznych paliv
	
	
	private int id; // nevim zda je potreba, ale predpokladam, ze to bude Primary Key
	private String nazev;
	private String jednotka; // pro nas to asi vzdy bude 'l' jako litr;
	
	public String getJednotka() {
		return jednotka;
	}
	public void setJednotka(String jednotka) {
		this.jednotka = jednotka;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
}
