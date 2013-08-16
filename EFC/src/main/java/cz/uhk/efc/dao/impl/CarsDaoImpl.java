package cz.uhk.efc.dao.impl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.common.AbstractHibernateDAO;
import cz.uhk.efc.dao.CarsDao;
import cz.uhk.efc.model.Cars;

@Repository
public class CarsDaoImpl extends AbstractHibernateDAO<Cars> implements CarsDao {

	@Autowired
	SessionFactory sessionFactory;

	public CarsDaoImpl() {
		super();
		setClazz(Cars.class);
	}
}
