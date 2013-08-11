/**
 * 
 */
package cz.uhk.efc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cz.uhk.efc.services.DriversService;

/**
 * @author corri
 *
 */
@Controller
@RequestMapping("/drivers")
public class DriversController {

	private static final Logger logger = LoggerFactory.getLogger(DriversController.class);
	
	private DriversService driversService;

	@Autowired
	public DriversController(DriversService drivers) {
		this.driversService = drivers;
	}
	
	//TODO dodelat přehled 
	@RequestMapping("/")
	public String renderOverView(Model model) {
		logger.info("Show complet overview for Drivers");
		model.addAttribute("drivers", driversService.findAll());
		return "/drivers/default";
	} 
	
	//TODO dodelat zobrazeni tabulky ridicu
	@RequestMapping("/list/")
	public String renderList(Model model) {
		logger.info("Show all Drivers in database");
		model.addAttribute("drivers", driversService.findAll());
		return "/drivers/list";
	} 
	
	//TODO dodelat pridani + formular
	@RequestMapping("/add/")
	public String renderAdd(Model model) {
		logger.info("Add new Driver in database");
		model.addAttribute("drivers", driversService.findAll());
		return "/drivers/add";
	} 
	
	//TODO Add edit driver
	
	
}
