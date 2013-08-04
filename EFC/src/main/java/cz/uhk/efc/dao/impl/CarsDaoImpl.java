package cz.uhk.efc.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cz.uhk.efc.dao.CarsDao;
import cz.uhk.efc.model.Cars;

public class CarsDaoImpl implements CarsDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Cars get(int id) {
		return (Cars) sessionFactory.getCurrentSession().get(Cars.class, id);
	}

	@Override
	public void save(Cars car) {
		sessionFactory.getCurrentSession().merge(car);
	}

	@Override
	public void delete(Cars car) {
		sessionFactory.getCurrentSession().delete(car);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cars> findAll() {
		return sessionFactory.getCurrentSession().createSQLQuery("FROM cars ORDER BY id").list();
	}

}
