/**
 * 
 */
package cz.uhk.efc.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.efc.common.AbstractHibernateDAO;
import cz.uhk.efc.dao.CostsDao;
import cz.uhk.efc.model.Costs;

/**
 * @author corri
 *
 */
@Repository
public class CostsDaoImpl extends AbstractHibernateDAO<Costs> implements CostsDao {

	@Autowired
	SessionFactory sessionFactory;

	public CostsDaoImpl() {
		super();
		setClazz(Costs.class);
	}
}
