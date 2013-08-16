/**
 * 
 */
package cz.uhk.efc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.uhk.efc.dao.FuelDao;
import cz.uhk.efc.dao.IOperations;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Fuel;
import cz.uhk.efc.services.FuelService;

/**
 * @author corri
 *
 */
@Service("fuelService")
public class FuelServiceImpl extends AbstractService<Fuel> implements FuelService {

	@Autowired
	private FuelDao fuelDao;
	
	//API
	/**
	 * 
	 * @return Map <Id, Clazz>
	 */
	@Override
	public ProjectGrid<Fuel> findAll(){
		return new ProjectGrid<Fuel>(fuelDao.takeAll());
	}
	
	
	@Override
	protected IOperations<Fuel> getDao() {
		return fuelDao;
	}
	
}
