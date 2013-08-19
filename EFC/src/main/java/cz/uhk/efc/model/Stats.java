/**
 * 
 */
package cz.uhk.efc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import cz.uhk.efc.factory.IModelItem;

/**
 * @author corri
 * Statistiky za jedlotlive polozky
 *
 */
@Entity
public class Stats implements IModelItem,  Serializable {

	private static final long serialVersionUID = 5526280713933211505L;
	@Id
	@GeneratedValue
	private int id;
	/**
	 * Datum provedeni
	 */
	private Date date;
	/**
	 * Aktualni stav ujetych km
	 */
	private double kilometers;
	
	@OneToOne(mappedBy = "stat")
	@PrimaryKeyJoinColumn
	private Costs costs;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "stat")
	private List<Refueling> refuelings = new ArrayList<Refueling>();
	/**
	 * Cena
	 */
	private double price;
	
	/**
	 * Vraci DB id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 * 
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Datum udaloti
	 * @return 
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * Datum udalosti
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * Aktualni stav kilometru
	 * @return
	 */
	public double getKilometers() {
		return kilometers;
	}
	/**
	 * Aktualni stav kilometru
	 * @param kilometers
	 */
	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}
	/**
	 * Celkova cena za polozku, cena za litr se pocita z aktualniho cerpani
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * Celkova cena za polozku, cena za litr se pocita z aktualniho cerpani
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	public List<Refueling> getRefuelings() {
		return refuelings;
	}
	
	public void setRefuelings(List<Refueling> refuelings) {
		this.refuelings = refuelings;
	}
	
	public Costs getCosts() {
		return costs;
	}
	public void setCosts(Costs costs) {
		this.costs = costs;
	}
}
