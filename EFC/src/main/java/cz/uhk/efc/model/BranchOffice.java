/**
 * 
 */
package cz.uhk.efc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author corri
 *
 */
@Entity
@Table(name="POBOCKA")
public class BranchOffice implements Serializable {

	private static final long serialVersionUID = -3143555479652655877L;
	
	@Id
	@Column (name = "pobocka_id")
	@GeneratedValue
	int id;
}
