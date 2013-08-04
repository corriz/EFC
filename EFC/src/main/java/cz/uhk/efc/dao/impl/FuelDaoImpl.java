/**
 * 
 */
package cz.uhk.efc.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cz.uhk.efc.dao.FuelDao;
import cz.uhk.efc.model.Fuel;

/**
 * @author corri
 *
 */
public class FuelDaoImpl implements FuelDao {

	@Autowired
	SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.FuelDao#get(int)
	 */
	@Override
	public Fuel get(int id) {
		return (Fuel) sessionFactory.getCurrentSession().get(Fuel.class, id);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.FuelDao#save(cz.uhk.efc.model.Fuel)
	 */
	@Override
	public void save(Fuel fuel) {
		sessionFactory.getCurrentSession().merge(fuel);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.FuelDao#delete(cz.uhk.efc.model.Fuel)
	 */
	@Override
	public void delete(Fuel fuel) {
		sessionFactory.getCurrentSession().delete(fuel);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.FuelDao#findAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Fuel> findAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM fuel ORDER BY id").list();
	}

}
