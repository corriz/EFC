package cz.uhk.efc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
/**
 *  Trida pro definici vozidla
 * @author corri
 *
 */
@Entity
public class Cars implements Serializable{

	private static final long serialVersionUID = 3076061232294727883L;
	/**
	 * Primary key
	 */
	@Id
	@GeneratedValue
	private int id;
	/**
	 * SPZ auta
	 */
	@Column(unique = true)
	private String spz;
	/**
	 * Udaje o tom jake palivo toto auto pouziva
	 */
	@ManyToOne
	@JoinColumn(name = "fuel_id")
	private Fuel fuel;
	/**
	 * Model automobilu 
	 */
	private String model;
	/**
	 * Znacka automobilu 
	 */
	private String made;
	/**
	 * Many to Many
	 * Jeden ridic muze ridit vice aut, jedno auto muze ridit vice ridicu 
	 */
	@ManyToOne
	@JoinColumn(name="driver_id")
	Drivers driver;
	
	/**
	 * One to many
	 */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "car")
	private List<Refueling> refuelings = new ArrayList<Refueling>();
	
	/**
	 * One to many
	 */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "car")
	private List<Costs> costs = new ArrayList<Costs>();
	/**
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return
	 */
	public String getSpz() {
		return spz;
	}
	/**
	 * @param spz
	 */
	public void setSpz(String spz) {
		this.spz = spz;
	}
	/**
	 * @return
	 */
	public Fuel getFuel() {
		return fuel;
	}
	/**
	 * @param fuel
	 */
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	/**
	 * @return
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return
	 */
	public String getMade() {
		return made;
	}
	/**
	 * @param made
	 */
	public void setMade(String made) {
		this.made = made;
	}
	
	public Drivers getDriver() {
		return driver;
	}
	public void setDriver(Drivers driver) {
		this.driver = driver;
	}
	public List<Refueling> getRefuelings() {
		return refuelings;
	}
	public void setRefuelings(List<Refueling> refuelings) {
		this.refuelings = refuelings;
	}
	public List<Costs> getCosts() {
		return costs;
	}
	public void setCosts(List<Costs> costs) {
		this.costs = costs;
	}
	
}
