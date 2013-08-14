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
	void delete(Cars driver);
	
	
	/**
	 * Ulozi vsechny ridice
	 * @param driversGrid
	 */
	void saveAll(ProjectGrid<Cars> carsGrid);
	
	/**
	 * Update all drivers
	 * @param driversGrid
	 */
	void updateAll(ProjectGrid<Cars> carsGrid);
	
	/**
	 * Najdi vsechny
	 * @return
	 */
	ProjectGrid<Cars> findAll();
}
