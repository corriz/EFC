/**
 * 
 */
package cz.uhk.efc.factory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import cz.uhk.efc.model.IModelItem;

/**
 * @author corri
 *
 */
public class ProjectGrid <T extends IModelItem> {
	
	@Valid
	private Map<Integer, T> map;
	
	public ProjectGrid() {

	}
	
	public ProjectGrid(List<T> list){
		map = new LinkedHashMap<Integer, T>();
		for(T item : list){
			map.put(item.getId(), item);
		}
		
	}

	public Map<Integer, T> getItemsMap() {
		return map;
	}

	public void setItemsMap(Map<Integer, T> itemsMap) {
		this.map = itemsMap;
	}

	public List<T> getItems() {
		List<T> list = new ArrayList<T>();
		for (T item : map.values()) {
			list.add(item);
		}
		return list;
	}
	
}