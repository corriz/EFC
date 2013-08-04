package cz.uhk.efc.dao;

import java.util.List;

import cz.uhk.efc.model.Fuel;

public interface FuelDao {

	Fuel get(int id);
	void save(Fuel fuel);
	void delete(Fuel fuel);
	List<Fuel> findAll();
}
