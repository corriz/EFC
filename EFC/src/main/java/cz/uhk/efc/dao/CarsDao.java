/**
 * 
 */
package cz.uhk.efc.dao;

import java.util.List;

import cz.uhk.efc.model.Cars;

/**
 * @author corri
 *
 */
public interface CarsDao {
	
	Cars get(int id);
	void save(Cars car);
	void delete(Cars car);
	List<Cars> findAll();
}
