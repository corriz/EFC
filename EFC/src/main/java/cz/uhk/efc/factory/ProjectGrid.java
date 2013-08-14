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
public class ProjectGrid <T extends Serializable> {


	@Valid
	private Map<Integer, Drivers> driversMap;
	
	public ProjectGrid() {

	}
	
	public ProjectGrid(List<T> list){
		map = new LinkedHashMap<Integer, Drivers>();
		if(list instanceof Drivers){
			for(T driver : list){
				map.put(((Drivers) driver).getId(), (Drivers) driver);
			}
		}
		
	}
	
	
	public Map<Integer, Drivers> getDriversMap() {
		return driversMap;
	}

	public void setDriversMap(Map<Integer, Drivers> driversMap) {
		this.driversMap = driversMap;
	}
}
