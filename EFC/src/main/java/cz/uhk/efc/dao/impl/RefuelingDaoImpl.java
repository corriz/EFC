/**
 * 
 */
package cz.uhk.efc.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.common.AbstractHibernateDAO;
import cz.uhk.efc.dao.RefuelingDao;
import cz.uhk.efc.model.Refueling;

/**
 * @author corri
 *
 */
@Repository
public class RefuelingDaoImpl extends AbstractHibernateDAO<Refueling> implements RefuelingDao {

	@Autowired
	SessionFactory sessionFactory;

	public RefuelingDaoImpl() {
		super();
		setClazz(Refueling.class);
	}
	
}
