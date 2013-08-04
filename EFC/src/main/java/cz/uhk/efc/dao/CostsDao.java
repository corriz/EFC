/**
 * 
 */
package cz.uhk.efc.dao;

import java.util.List;

import cz.uhk.efc.model.Costs;

/**
 * @author corri
 *
 */
public interface CostsDao {
	Costs get(int id);
	void save(Costs cost);
	void delete(Costs cost);
	List<Costs> findAll();
}
