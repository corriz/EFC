package cz.uhk.efc.dao;

import java.util.List;

import cz.uhk.efc.model.Refueling;

public interface RefuelingDao {

	Refueling get(int id);
	void save(Refueling refuel);
	void delete(Refueling refuel);
	List<Refueling> findAll();
}
