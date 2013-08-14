/**
 * 
 */
package cz.uhk.efc.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.uhk.efc.factory.DriversCommand;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Cars;
import cz.uhk.efc.services.CarService;

/**
 * @author corri
 *
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {

	@Override
	public Cars get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(DriversCommand driversCommand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cars driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(ProjectGrid<?> driversGrid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAll(ProjectGrid<?> driversGrid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectGrid<Cars> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
