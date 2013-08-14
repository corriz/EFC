package cz.uhk.efc.services;

import cz.uhk.efc.factory.ProjectGrid;
import cz.uhk.efc.model.Stats;

public interface StatsService {
	Stats get(int id); 

	void save(Stats stats);

	void delete(Stats stats);

	void saveAll(ProjectGrid<Stats> statsGrid);

	void updateAll(ProjectGrid<Stats> statsGrid);

	ProjectGrid<Stats> findAll();
}
