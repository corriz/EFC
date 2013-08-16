package cz.uhk.efc.services;

import cz.uhk.efc.common.IOperations;
import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Costs;

public interface CostsService extends IOperations<Costs> {
	ProjectGrid<Costs> findAll();
}
