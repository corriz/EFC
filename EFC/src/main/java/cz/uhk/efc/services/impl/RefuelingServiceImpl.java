package cz.uhk.efc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.uhk.efc.common.AbstractService;
import cz.uhk.efc.common.IOperations;
import cz.uhk.efc.dao.RefuelingDao;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Refueling;
import cz.uhk.efc.services.RefuelingService;

@Service
public class RefuelingServiceImpl extends AbstractService<Refueling> implements RefuelingService {

	@Autowired
	private RefuelingDao refuelingDao;
	
	@Override
	public ProjectGrid<Refueling> findAll() {
		return new ProjectGrid<Refueling>(getDao().takeAll());
	}

	@Override
	protected IOperations<Refueling> getDao() {
		return refuelingDao;
	}
}
