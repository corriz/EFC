/**
 * 
 */
package cz.uhk.efc.services;

import cz.uhk.efc.factory.DriversCommand;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Drivers;

/**
 * @author corri
 *
 */
/**
 * @author corri
 *
 */
public interface DriversService {
	
	/**
	 * Vybere jednoho ridice
	 * @param id
	 * @return
	 */
	Drivers get(int id); 
	
	/**
	 * Ulozi jednoho ridice
	 * @param driversCommand
	 */
	void save(Drivers drivers);
	
	/**
	 * Jednoduche mazani ridice
	 * @param driver
	 */
	void delete(Drivers driver);
	
	
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
	ProjectGrid<Drivers> findAll();
}
