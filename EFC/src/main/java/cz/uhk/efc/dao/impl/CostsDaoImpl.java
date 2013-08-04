/**
 * 
 */
package cz.uhk.efc.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cz.uhk.efc.dao.CostsDao;
import cz.uhk.efc.model.Costs;

/**
 * @author corri
 *
 */
public class CostsDaoImpl implements CostsDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Costs get(int id) {
		return (Costs) sessionFactory.getCurrentSession().get(Costs.class, id);
	}

	@Override
	public void save(Costs cost) {
		sessionFactory.getCurrentSession().merge(cost);
	}

	@Override
	public void delete(Costs cost) {
		sessionFactory.getCurrentSession().delete(cost);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Costs> findAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM costs ORDER BY id").list();
	}

}
