package cz.uhk.efc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.dao.CarsDao;
import cz.uhk.efc.model.Cars;

@Repository
public class CarsDaoImpl implements CarsDao {

	@Autowired
	SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Cars get(int id) {
		return (Cars) getCurrentSession().get(Cars.class, id);
	}

	@Override
	public void save(Cars car) {
		getCurrentSession().merge(car);
	}

	@Override
	public void delete(Cars car) {
		getCurrentSession().delete(car);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cars> findAll() {
		return getCurrentSession().createSQLQuery("FROM Cars ORDER BY id").list();
	}

}
