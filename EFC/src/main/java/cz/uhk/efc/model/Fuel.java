package cz.uhk.efc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fuel implements IModelItem, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8431223905744534380L;

	/**
	 * Primary key
	 */
	@Id
	@GeneratedValue
	private int id;
	
	/**
	 * Jestli je to diesl, natural, plyn  
	 */
	private String name;
	/**
	 * Pro nas to asi vzdy bude 'l' jako litr;
	 */
	private String unit;
	
	/**
	 * One to many 
	 */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fuel")
	private List<Cars> cars = new ArrayList<Cars>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public List<Cars> getCars() {
		return cars;
	}
	public void setCars(List<Cars> cars) {
		this.cars = cars;
	}
	
}
