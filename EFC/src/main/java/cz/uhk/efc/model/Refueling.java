/**
 * 
 */
package cz.uhk.efc.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import cz.uhk.efc.factory.IModelItem;

/**
 * Trida predstavujici samotne cerpani
 * 
 * @author corri
 * 
 */
@Entity
public class Refueling implements IModelItem,  Serializable {

	private static final long serialVersionUID = 4518351960899574550L;

	/**
	 * Primary Key; 
	 */
	@Id
	@GeneratedValue
	private int id;

	/**
	 * To ktere cerpalo palivo je v definici vozidla 
	 */
	@ManyToOne
	@JoinColumn(name = "car_id")
	private Cars car;
	
	/**
	 * Pocet cerpanych litru
	 */
	private float amount;
	
	/**
	 * Pridelene statistiky k tomuto vydaji, kilometry + datum + cena celkem 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stat_id")
	private Stats stat;
	
	@ManyToOne
	@JoinColumn(name = "driver_id")
	private Drivers driver;
	
	public Drivers getDriver() {
		return driver;
	}
	public void setDriver(Drivers driver) {
		this.driver = driver;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cars getCar() {
		return car;
	}
	public void setCar(Cars car) {
		this.car = car;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Stats getStat() {
		return stat;
	}
	public void setStat(Stats stat) {
		this.stat = stat;
	}
	
}
