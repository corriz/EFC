/**
 * 
 */
package cz.uhk.efc.services;

import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Fuel;

/**
 * @author corri
 *
 */
public interface FuelService {

	Fuel get(int id); 

	void save(Fuel fuel);

	void delete(Fuel fuel);

	void saveAll(ProjectGrid<Fuel> fuelGrid);

	void updateAll(ProjectGrid<Fuel> fuelGrid);

	ProjectGrid<Fuel> findAll();
}
