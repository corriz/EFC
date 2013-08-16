package cz.uhk.efc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.uhk.efc.common.AbstractService;
import cz.uhk.efc.common.IOperations;
import cz.uhk.efc.dao.StatsDao;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Stats;
import cz.uhk.efc.services.StatsService;

@Service
public class StatsServiceImpl extends AbstractService<Stats> implements StatsService {

	@Autowired
	private StatsDao statsDao;
	
	@Override
	public ProjectGrid<Stats> findAll() {
		return new ProjectGrid<Stats>();
	}

	@Override
	protected IOperations<Stats> getDao() {
		return statsDao;
	}

}
