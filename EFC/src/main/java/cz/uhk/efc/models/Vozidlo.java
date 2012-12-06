package cz.uhk.efc.models;

public class Vozidlo {

	// trida pro definici vozidla
	
	private int id; // Primary Key; bude potreba?
	private String spz; // Unique
	private Palivo palivo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpz() {
		return spz;
	}
	public void setSpz(String spz) {
		this.spz = spz;
	}
	public Palivo getPalivo() {
		return palivo;
	}
	public void setPalivo(Palivo palivo) {
		this.palivo = palivo;
	}
	public long getTachometrStart() {
		return tachometrStart;
	}
	public void setTachometrStart(long tachometrStart) {
		this.tachometrStart = tachometrStart;
	}
	private long tachometrStart; // pocatecni stav tachometru
	
}
