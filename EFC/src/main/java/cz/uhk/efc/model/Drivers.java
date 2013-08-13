/**
 * 
 */
package cz.uhk.efc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * All driver
 * @author corri
 *
 */

@Entity
public class Drivers implements Serializable {
	
	private static final long serialVersionUID = -7206099558342858789L;

	@Id
	@GeneratedValue
	private int id;
	
	@NotEmpty
	private String firstname;
	@NotEmpty
	private String lastname;
	
	private String own_number;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "driver")
	private List<Cars> cars = new ArrayList<Cars>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "driver")
	private List<Refueling> refueling = new ArrayList<Refueling>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getOwn_number() {
		return own_number;
	}

	public void setOwn_number(String own_number) {
		this.own_number = own_number;
	}

	public List<Cars> getCars() {
		return cars;
	}

	public void setCars(List<Cars> cars) {
		this.cars = cars;
	}
}
