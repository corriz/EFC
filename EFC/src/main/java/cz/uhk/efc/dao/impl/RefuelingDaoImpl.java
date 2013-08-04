/**
 * 
 */
package cz.uhk.efc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.dao.RefuelingDao;
import cz.uhk.efc.model.Refueling;

/**
 * @author corri
 *
 */
@Repository
public class RefuelingDaoImpl implements RefuelingDao {

	@Autowired
	SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.RefuelingDao#get(int)
	 */
	@Override
	public Refueling get(int id) {
		return (Refueling) getCurrentSession().get(Refueling.class, id);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.RefuelingDao#save(cz.uhk.efc.model.Refueling)
	 */
	@Override
	public void save(Refueling refuel) {
		getCurrentSession().merge(refuel);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.RefuelingDao#delete(cz.uhk.efc.model.Refueling)
	 */
	@Override
	public void delete(Refueling refuel) {
		getCurrentSession().delete(refuel);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.RefuelingDao#findAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Refueling> findAll() {
		return getCurrentSession().createQuery("FROM refueling ORDER BY id").list();
	}

}
