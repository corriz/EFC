/**
 * 
 */
package cz.uhk.efc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.dao.FuelDao;
import cz.uhk.efc.model.Fuel;

/**
 * @author corri
 *
 */
@Repository
public class FuelDaoImpl implements FuelDao {

	@Autowired
	SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.FuelDao#get(int)
	 */
	@Override
	public Fuel get(int id) {
		return (Fuel) getCurrentSession().get(Fuel.class, id);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.FuelDao#save(cz.uhk.efc.model.Fuel)
	 */
	@Override
	public void save(Fuel fuel) {
		getCurrentSession().merge(fuel);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.FuelDao#delete(cz.uhk.efc.model.Fuel)
	 */
	@Override
	public void delete(Fuel fuel) {
		getCurrentSession().delete(fuel);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.FuelDao#findAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Fuel> findAll() {
		return getCurrentSession().createQuery("FROM Fuel ORDER BY id").list();
	}

}
