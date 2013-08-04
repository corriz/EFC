/**
 * 
 */
package cz.uhk.efc.dao;

import java.util.List;

import cz.uhk.efc.model.Drivers;

/**
 * @author corri
 *
 */
public interface DriversDao {

	Drivers get(int id);
	void save(Drivers driver);
	void delete(Drivers driver);
	List<Drivers> findAll();
}
