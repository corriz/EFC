/**
 * 
 */
package cz.uhk.efc.services;

import cz.uhk.efc.factory.DriversCommand;
import cz.uhk.efc.factory.DriversGrid;
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
	void save(DriversCommand driversCommand);
	
	/**
	 * Jednoduche mazani ridice
	 * @param driver
	 */
	void delete(Drivers driver);
	
	
	/**
	 * Ulozi vsechny ridice
	 * @param driversGrid
	 */
	void saveAll(DriversGrid driversGrid);
	
	/**
	 * Update all drivers
	 * @param driversGrid
	 */
	void updateAll(DriversGrid driversGrid);
	
	/**
	 * Najdi vsechny
	 * @return
	 */
	DriversGrid findAll();
}
