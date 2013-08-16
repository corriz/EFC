package cz.uhk.efc.services;

import cz.uhk.efc.common.IOperations;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Stats;

public interface StatsService extends IOperations<Stats>{
	
	ProjectGrid<Stats> findAll();
	
}
