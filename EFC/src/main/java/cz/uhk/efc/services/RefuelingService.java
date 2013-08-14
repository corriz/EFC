package cz.uhk.efc.services;

import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Refueling;

public interface RefuelingService {
	Refueling get(int id); 

	void save(Refueling refueling);

	void delete(Refueling refueling);

	void saveAll(ProjectGrid<Refueling> refuelingGrid);

	void updateAll(ProjectGrid<Refueling> refuelingGrid);

	ProjectGrid<Refueling> findAll();
}
