/**
 * 
 */
package cz.uhk.efc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.dao.CostsDao;
import cz.uhk.efc.model.Costs;

/**
 * @author corri
 *
 */
@Repository
public class CostsDaoImpl implements CostsDao {

	@Autowired
	SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Costs get(int id) {
		return (Costs) getCurrentSession().get(Costs.class, id);
	}

	@Override
	public void save(Costs cost) {
		getCurrentSession().merge(cost);
	}

	@Override
	public void delete(Costs cost) {
		getCurrentSession().delete(cost);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Costs> findAll() {
		return getCurrentSession().createQuery("FROM Costs ORDER BY id").list();
	}

}
