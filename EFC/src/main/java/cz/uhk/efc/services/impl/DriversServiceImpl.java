/**
 * 
 */
package cz.uhk.efc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.uhk.efc.common.AbstractService;
import cz.uhk.efc.common.IOperations;
import cz.uhk.efc.dao.DriversDao;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Drivers;
import cz.uhk.efc.services.DriversService;

/**
 * @author corri
 *
 */
@Service
public class DriversServiceImpl extends AbstractService<Drivers> implements DriversService {
	
	@Autowired
	DriversDao driversDao;

	@Override
	public ProjectGrid<Drivers> findAll() {
		return new ProjectGrid<Drivers>(getDao().takeAll());
	}

	@Override
	protected IOperations<Drivers> getDao() {
		return driversDao;
	}

	
}
