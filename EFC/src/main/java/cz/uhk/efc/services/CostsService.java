package cz.uhk.efc.services;

import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Costs;

public interface CostsService {
	Costs get(int id); 

	void save(Costs cost);

	void delete(Costs cost);

	void saveAll(ProjectGrid<Costs> costGrid);

	void updateAll(ProjectGrid<Costs> costGrid);

	ProjectGrid<Costs> findAll();
}
