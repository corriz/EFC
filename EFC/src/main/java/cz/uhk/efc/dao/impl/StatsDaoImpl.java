/**
 * 
 */
package cz.uhk.efc.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.common.AbstractHibernateDAO;
import cz.uhk.efc.dao.StatsDao;
import cz.uhk.efc.model.Stats;

/**
 * @author corri
 *
 */
@Repository
public class StatsDaoImpl extends AbstractHibernateDAO<Stats>  implements StatsDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public StatsDaoImpl() {
		super();
		setClazz(Stats.class);
	}
}
