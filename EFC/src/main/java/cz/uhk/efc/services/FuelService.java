/**
 * 
 */
package cz.uhk.efc.services;

import cz.uhk.efc.common.IOperations;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Fuel;

/**
 * @author corri
 *
 */
public interface FuelService extends IOperations<Fuel> {

	ProjectGrid<Fuel> findAll();
	
}