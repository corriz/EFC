/**
 * 
 */
package cz.uhk.efc.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author corri
 *
 */

@Entity
@Table(name = "RIDICI")
public class Drivers implements Serializable {
	
	private static final long serialVersionUID = -7206099558342858789L;

	@Id
	@Column (name = "ridic_id")
	@GeneratedValue
	private int id;
		
	private String firstname;
	private String lastname;
	private String own_number;
	
	@OneToMany
	@Column (name = "pobocka_id")
	private Set<BranchOffice> branchOffice;

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

	public Set<BranchOffice> getBranchOffice() {
		return branchOffice;
	}

	public void setBranchOffice(Set<BranchOffice> branchOffice) {
		this.branchOffice = branchOffice;
	}

	
	
	
	
}
