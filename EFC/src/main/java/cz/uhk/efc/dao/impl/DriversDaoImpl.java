package cz.uhk.efc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.dao.DriversDao;
import cz.uhk.efc.model.Drivers;

@Repository
public class DriversDaoImpl implements DriversDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Drivers get(int id) {
		return (Drivers) getCurrentSession().get(Drivers.class, id); 
	}

	@Override
	public void save(Drivers driver) {
		getCurrentSession().merge(driver);
	}

	@Override
	public void delete(Drivers driver) {
		getCurrentSession().delete(driver);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Drivers> findAll() {
		return getCurrentSession().createQuery("FROM drivers ORDER BY id").list();
	}

}
