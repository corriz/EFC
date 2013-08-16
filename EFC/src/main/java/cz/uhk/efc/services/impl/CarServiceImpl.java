/**
 * 
 */
package cz.uhk.efc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.uhk.efc.common.AbstractService;
import cz.uhk.efc.common.IOperations;
import cz.uhk.efc.dao.CarsDao;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Cars;
import cz.uhk.efc.services.CarService;

/**
 * @author corri
 *
 */
@Service
public class CarServiceImpl extends AbstractService<Cars> implements CarService {

	@Autowired
	private CarsDao carsDao;
	
	@Override
	public ProjectGrid<Cars> findAll() {
		return new ProjectGrid<Cars>(getDao().takeAll());
	}

	@Override
	protected IOperations<Cars> getDao() {
		return carsDao;
	}

	

}
