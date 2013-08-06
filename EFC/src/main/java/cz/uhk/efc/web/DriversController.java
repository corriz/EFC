/**
 * 
 */
package cz.uhk.efc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cz.uhk.efc.services.DriversService;

/**
 * @author corri
 *
 */
@Controller
public class DriversController {

	private static final Logger logger = LoggerFactory.getLogger(DriversController.class);
	
	private DriversService driversService;

	@Autowired
	public DriversController(DriversService drivers) {
		this.driversService = drivers;
	}
	
	@RequestMapping("/drivers/default/")
	public ModelMap vetsHandler() {
		logger.info("Show all Drivers in database");
		return new ModelMap(driversService.findAll());
	} 
	
	
}
