/**
 * 
 */
package cz.uhk.efc.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Fuel;
import cz.uhk.efc.services.FuelService;

/**
 * @author corri
 *
 */
@Service
@Transactional
public class FuelServiceImpl implements FuelService {

	@Override
	public Fuel get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Fuel fuel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Fuel fuel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(ProjectGrid<Fuel> fuelGrid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAll(ProjectGrid<Fuel> fuelGrid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectGrid<Fuel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
