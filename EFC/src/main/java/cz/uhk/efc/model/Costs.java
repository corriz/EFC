/**
 * 
 */
package cz.uhk.efc.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import cz.uhk.efc.factory.IModelItem;


/**
 * Registruje vsechny vydaje za auto jako je servis, vymena oleje, stk, opravy ap....
 * @author corri
 *
 */
@Entity
public class Costs implements IModelItem,  Serializable {

	private static final long serialVersionUID = 4834389339091409971L;
	/**
	 * Primary key
	 */
	@Id
	@GeneratedValue
	private int id;
	/**
	 * Nazev vydaje
	 */
	private String name;
	
	/**
	 * Poznamka
	 */
	private String text;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stat_id")
	private Stats stat;
	
	@ManyToOne
	@JoinColumn(name = "car_id")
	private Cars car;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	public Stats getStat() {
		return stat;
	}

	public void setStat(Stats stat) {
		this.stat = stat;
	}

	public Cars getCar() {
		return car;
	}

	public void setCar(Cars car) {
		this.car = car;
	}
}
