/**
 * 
 */
package cz.uhk.efc.services;

import cz.uhk.efc.common.IOperations;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Drivers;

/**
 * @author corri
 *
 */
public interface DriversService extends IOperations<Drivers> {
	
	ProjectGrid<Drivers> findAll();
}
