/**
 * 
 */
package cz.uhk.efc.web;

import java.util.UUID;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cz.uhk.efc.factory.DriversCommand;
import cz.uhk.efc.model.Drivers;
import cz.uhk.efc.services.DriversService;

/**
 * @author corri
 *
 */
@Controller
public class DriversController {

	private static final Logger logger = LoggerFactory.getLogger(DriversController.class);
	
	@Autowired
	private DriversService driversService;
	
	//TODO dodelat přehled 
	@RequestMapping("drivers/")
	public String renderOverView(Model model) {
		logger.info("Show complet overview for Drivers");
		model.addAttribute("drivers", driversService.findAll());
		return "drivers/default";
	} 
	
	//TODO dodelat zobrazeni tabulky ridicu
	@RequestMapping(value="drivers/list/", method= RequestMethod.GET )
	public String renderList(Model model) {
		logger.info("Show all Drivers in database");
		model.addAttribute("drivers", driversService.findAll());
		return "drivers/list";
	} 
	
	@RequestMapping(value="drivers/add/", method = RequestMethod.GET)
	public void renderAdd(Model model, @ModelAttribute DriversCommand driversCommand,@RequestParam(required=false) Integer id){
		
	}
	
	@RequestMapping(value="drivers/add/", method = RequestMethod.POST)
	public String submitAdd(@Valid DriversCommand driverCommand, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
		logger.info("Additing new Driver in database");
		if(result.hasErrors()){
			logger.info("Here is Error while additing to DB");
			return null;
		}
		logger.info("We additing this:" + driverCommand);
		driverCommand.setOwn_number(UUID.randomUUID().toString());
		driversService.save(driverCommand);
		redirectAttributes.addFlashAttribute("message", "Řidič "+ driverCommand.getLastname() +" přidán");
		return "redirect:/drivers/";
	} 
	
}
