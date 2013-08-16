/**
 * 
 */
package cz.uhk.efc.services.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cz.uhk.efc.dao.IOperations;


/**
 * @author roman
 *
 */
@Transactional
public abstract class AbstractService<T extends Serializable> implements IOperations<T> {

	@Override
	public T findOne(int id) {
		return getDao().findOne(id);
	}

	@Override
	public List<T> takeAll() {
		return getDao().takeAll();
	}

	@Override
	public void create(T entity) {
		getDao().create(entity);
	}

	@Override
	public T update(T entity) {
		return getDao().update(entity);
	}

	@Override
	public void delete(T entity) {
		getDao().delete(entity);
	}

	@Override
	public void deleteById(int entityId) {
		getDao().deleteById(entityId);
	}
	
	protected abstract IOperations<T> getDao();
	
}
