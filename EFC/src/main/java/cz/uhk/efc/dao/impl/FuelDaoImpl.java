/**
 * 
 */
package cz.uhk.efc.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.common.AbstractHibernateDAO;
import cz.uhk.efc.dao.FuelDao;
import cz.uhk.efc.model.Fuel;

/**
 * @author corri
 * 
 */
@Repository
public class FuelDaoImpl extends AbstractHibernateDAO<Fuel> implements FuelDao {

	@Autowired
	private SessionFactory sessionFactory;

	public FuelDaoImpl() {
		super();
		setClazz(Fuel.class);
	}

	
}
