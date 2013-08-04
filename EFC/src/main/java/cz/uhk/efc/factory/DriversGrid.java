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
public class DriversGrid {
	
	@Valid
	private Map<Integer, DriversCommand> driversMap;
	
	public DriversGrid() {

	}
	
	public DriversGrid(List<Drivers> driversList){
		driversMap = new LinkedHashMap<Integer, DriversCommand>();
		for(Drivers driver : driversList){
			driversMap.put(driver.getId(), new DriversCommand(driver));
		}
	}
	
	

	public Map<Integer, DriversCommand> getDriversMap() {
		return driversMap;
	}

	public void setDriversMap(Map<Integer, DriversCommand> driversMap) {
		this.driversMap = driversMap;
	}

	public List<Drivers> getDrivers() {
		List<Drivers> drivers = new ArrayList<Drivers>();
		for (DriversCommand driversCommand : driversMap.values()) {
			drivers.add(driversCommand.toDriver());
		}
		return drivers;
	}
	
}
