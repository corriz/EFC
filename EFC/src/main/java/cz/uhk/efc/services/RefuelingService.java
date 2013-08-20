package cz.uhk.efc.services;

import cz.uhk.efc.common.IOperations;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Refueling;

public interface RefuelingService extends IOperations<Refueling> {

	ProjectGrid<Refueling> findAll();
	
}
