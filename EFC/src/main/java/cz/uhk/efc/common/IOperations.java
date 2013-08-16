package cz.uhk.efc.common;

import java.io.Serializable;
import java.util.List;

public interface IOperations<T extends Serializable> {
	
	/**
	 * @param id
	 * @return
	 */
	public T findOne(final int id);

    /**
     * @return
     */
    public List<T> takeAll();

    /**
     * @param entity
     */
    public void create(final T entity);

    /**
     * @param entity
     * @return
     */
    public T update(final T entity);

    /**
     * @param entity
     */
    public void delete(final T entity);

    /**
     * @param entityId
     */
    public void deleteById(final int entityId);


}
