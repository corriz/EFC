/**
 * 
 */
package cz.uhk.efc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.uhk.efc.dao.DriversDao;
import cz.uhk.efc.factory.ProjectGrid;
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
	public void save(Drivers drivers) {
		driversDao.save(drivers);
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
	public void saveAll(ProjectGrid<?> driversGrid) {
		for(Drivers driver : driversGrid){
			driversDao.save(driver);
		}
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.services.DriversService#updateAll(cz.uhk.efc.factory.DriversGrid)
	 */
	@Override
	public void updateAll(ProjectGrid<?> driversGrid) {
		ProjectGrid<Drivers> allDrivers = findAll();
		allDrivers.getDriversMap().putAll(driversGrid.getDriversMap());
		driversGrid.setDriversMap(allDrivers.getDriversMap());
	}

	@Override
	public ProjectGrid<Drivers> findAll() {
		return new ProjectGrid<Drivers>(driversDao.findAll());
	}

}
