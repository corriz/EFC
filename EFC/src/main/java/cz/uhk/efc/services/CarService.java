/**
 * 
 */
package cz.uhk.efc.services;

import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Cars;
/**
 * @author corri
 *
 */
public interface CarService {
	/**
	 * Vybere jednoho ridice
	 * @param id
	 * @return
	 */
	Cars get(int id); 
	
	/**
	 * Ulozi jednoho ridice
	 * @param driversCommand
	 */
	void save(Cars car);
	
	/**
	 * Jednoduche mazani ridice
	 * @param driver
	 */
	void delete(Cars car);
	
	
	/**
	 * Ulozi vsechny ridice
	 * @param driversGrid
	 */
	void saveAll(ProjectGrid<?> driversGrid);
	
	/**
	 * Update all drivers
	 * @param driversGrid
	 */
	void updateAll(ProjectGrid<?> driversGrid);
	
	/**
	 * Najdi vsechny
	 * @return
	 */
	ProjectGrid<?> findAll();
}
