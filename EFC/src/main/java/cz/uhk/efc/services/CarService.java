/**
 * 
 */
package cz.uhk.efc.services;

import cz.uhk.efc.common.IOperations;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Cars;
/**
 * @author corri
 *
 */
public interface CarService extends IOperations<Cars> {
	ProjectGrid<Cars> findAll();
}
