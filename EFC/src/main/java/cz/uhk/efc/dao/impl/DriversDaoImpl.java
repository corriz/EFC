package cz.uhk.efc.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.common.AbstractHibernateDAO;
import cz.uhk.efc.dao.DriversDao;
import cz.uhk.efc.model.Drivers;

@Repository
public class DriversDaoImpl extends AbstractHibernateDAO<Drivers> implements DriversDao {

	@Autowired
	private SessionFactory sessionFactory;

	public DriversDaoImpl() {
		super();
		setClazz(Drivers.class);
	}
}
