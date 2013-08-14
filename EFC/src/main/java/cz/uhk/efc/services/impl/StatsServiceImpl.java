package cz.uhk.efc.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Stats;
import cz.uhk.efc.services.StatsService;

@Service
@Transactional
public class StatsServiceImpl implements StatsService {

	@Override
	public Stats get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Stats stats) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Stats stats) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(ProjectGrid<Stats> statsGrid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAll(ProjectGrid<Stats> statsGrid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectGrid<Stats> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
