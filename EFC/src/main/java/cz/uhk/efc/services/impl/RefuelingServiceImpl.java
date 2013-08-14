package cz.uhk.efc.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Refueling;
import cz.uhk.efc.services.RefuelingService;

@Service
@Transactional
public class RefuelingServiceImpl implements RefuelingService {

	@Override
	public Refueling get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Refueling refueling) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Refueling refueling) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(ProjectGrid<Refueling> refuelingGrid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAll(ProjectGrid<Refueling> refuelingGrid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectGrid<Refueling> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
