/**
 * 
 */
package cz.uhk.efc.factory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import cz.uhk.efc.model.Drivers;
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
/*
public class ProjectGrid <T> {
	
	@Valid
	private Map<Integer, DriversCommand> map;
	
	public ProjectGrid() {

	}
	
	public ProjectGrid(List<T> list){
		map = new LinkedHashMap<Integer, DriversCommand>();
		if(list instanceof DriversCommand){
			for(T driver : list){
				map.put(((Drivers) driver).getId(), new DriversCommand((Drivers) driver));
			}
		}
		
	}
	
	

	public Map<Integer, DriversCommand> getDriversMap() {
		return map;
	}

	public void setDriversMap(Map<Integer, DriversCommand> driversMap) {
		this.map = driversMap;
	}

	public List<Drivers> getDrivers() {
		List<Drivers> drivers = new ArrayList<Drivers>();
		for (DriversCommand driversCommand : map.values()) {
			drivers.add(driversCommand.toDriver());
		}
		return drivers;
	}
	
}*/
