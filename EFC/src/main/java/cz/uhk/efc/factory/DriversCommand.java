/**
 * 
 */
package cz.uhk.efc.factory;

import cz.uhk.efc.model.Drivers;

/**
 * @author corri
 *
 */
public class DriversCommand extends Drivers {

	private static final long serialVersionUID = -8549140273112421461L;
	
	private boolean selected = false;

	public DriversCommand() {
		
	}
	
	/**
	 * @param driver
	 */
	public DriversCommand(Drivers driver){
		setId(driver.getId());
		setFirstname(driver.getFirstname());
		setLastname(driver.getLastname());
		setOwn_number(driver.getOwn_number());
		setCars(driver.getCars());
	}
	
	public Drivers toDriver(){
		Drivers driver = new Drivers();
		driver.setId(getId());
		driver.setFirstname(getFirstname());
		driver.setLastname(getLastname());
		driver.setOwn_number(getOwn_number());
		driver.setCars(getCars());
		return driver;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
	
}
