/**
 * 
 */
package cz.uhk.efc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.dao.StatsDao;
import cz.uhk.efc.model.Stats;

/**
 * @author corri
 *
 */
@Repository
public class StatsDaoImpl implements StatsDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.StatsDao#get(int)
	 */
	@Override
	public Stats get(int id) {
		return (Stats) getCurrentSession().get(Stats.class, id);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.StatsDao#save(cz.uhk.efc.model.Stats)
	 */
	@Override
	public void save(Stats stat) {
		getCurrentSession().merge(stat);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.StatsDao#delete(cz.uhk.efc.model.Stats)
	 */
	@Override
	public void delete(Stats stat) {
		getCurrentSession().delete(stat);
	}

	/* (non-Javadoc)
	 * @see cz.uhk.efc.dao.StatsDao#findAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Stats> findAll() {
		return getCurrentSession().createQuery("FROM stats ORDER BY id").list();
	}

}
