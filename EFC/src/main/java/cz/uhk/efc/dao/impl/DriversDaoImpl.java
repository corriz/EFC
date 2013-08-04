package cz.uhk.efc.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cz.uhk.efc.dao.DriversDao;
import cz.uhk.efc.model.Drivers;

public class DriversDaoImpl implements DriversDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Drivers get(int id) {
		return (Drivers) sessionFactory.getCurrentSession().get(Drivers.class, id); 
	}

	@Override
	public void save(Drivers driver) {
		sessionFactory.getCurrentSession().merge(driver);
	}

	@Override
	public void delete(Drivers driver) {
		sessionFactory.getCurrentSession().delete(driver);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Drivers> findAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM drivers ORDER BY id").list();
	}

}
