/**
 * 
 */
package cz.uhk.efc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.uhk.efc.dao.DriversDao;
import cz.uhk.efc.factory.DriversCommand;
import cz.uhk.efc.factory.DriversGrid;
import cz.uhk.efc.model.Drivers;
import cz.uhk.efc.services.DriversService;

/**
 * @author corri
 *
 */
@Service
@Transactional
public class DriversServiceImpl implements DriversService {
	
	@Autowired
	DriversDao driversDao;

	/* (non-Javadoc)
	 * @see cz.uhk.efc.services.DriversService#get(int)
	 */
	@Override
	public Drivers get(int id) {
		return driversDao.get(id);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.services.DriversService#save(cz.uhk.efc.factory.DriversCommand)
	 */
	@Override
	public void save(DriversCommand driversCommand) {
		driversDao.save(driversCommand.toDriver());
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.services.DriversService#delete(cz.uhk.efc.model.Drivers)
	 */
	@Override
	public void delete(Drivers driver) {
		driversDao.delete(driver);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.services.DriversService#saveAll(cz.uhk.efc.factory.DriversGrid)
	 */
	@Override
	public void saveAll(DriversGrid driversGrid) {
		for(Drivers driver : driversGrid.getDrivers()){
			driversDao.save(driver);
		}
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.services.DriversService#updateAll(cz.uhk.efc.factory.DriversGrid)
	 */
	@Override
	public void updateAll(DriversGrid driversGrid) {
		DriversGrid allDrivers = findAll();
		allDrivers.getDriversMap().putAll(driversGrid.getDriversMap());
		driversGrid.setDriversMap(allDrivers.getDriversMap());
	}

	@Override
	public DriversGrid findAll() {
		return new DriversGrid(driversDao.findAll());
	}

}
