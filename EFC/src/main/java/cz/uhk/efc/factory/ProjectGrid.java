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

/**
 * @author corri
 *
 */
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
	
}
