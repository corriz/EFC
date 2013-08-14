package cz.uhk.efc.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Costs;
import cz.uhk.efc.services.CostsService;

@Service
@Transactional
public class CostsServiceImpl implements CostsService {

	@Override
	public Costs get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Costs cost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Costs cost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(ProjectGrid<Costs> costGrid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAll(ProjectGrid<Costs> costGrid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectGrid<Costs> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
