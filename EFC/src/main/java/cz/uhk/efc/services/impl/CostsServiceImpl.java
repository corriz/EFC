package cz.uhk.efc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.uhk.efc.common.AbstractService;
import cz.uhk.efc.common.IOperations;
import cz.uhk.efc.dao.CostsDao;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Costs;
import cz.uhk.efc.services.CostsService;

@Service
public class CostsServiceImpl extends AbstractService<Costs> implements CostsService {
	
	@Autowired
	private CostsDao costsDao;

	@Override
	public ProjectGrid<Costs> findAll() {
		return new ProjectGrid<Costs>(getDao().takeAll());
	}

	@Override
	protected IOperations<Costs> getDao() {
		return costsDao;
	}
}
