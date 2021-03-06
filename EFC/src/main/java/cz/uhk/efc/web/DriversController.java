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

import cz.uhk.efc.model.Drivers;
import cz.uhk.efc.services.CarService;
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
	@Autowired
	private CarService carService;
	
	@RequestMapping("drivers/")
	public String renderOverView(Model model) {
		logger.info("Show complet overview for Drivers");
		model.addAttribute("drivers", driversService.findAll());
		model.addAttribute("cars", carService.findAll());
		return "drivers/default";
	}
	
	@RequestMapping(value = "drivers/list/remove", method = RequestMethod.GET)
	public String remove(@RequestParam(value = "id", required = false) Integer id, Model m) {
		if(id != null){
			driversService.deleteById(id);
			return "redirect:/drivers/list/";
		}
		return "redirect:/drivers/list/";
	}
	
	@RequestMapping(value="drivers/list/", method= RequestMethod.GET )
	public String renderList(Model model) {
		logger.info("Show all Drivers in database");
		model.addAttribute("drivers", driversService.findAll());
		return "drivers/list";
	} 
	
	@RequestMapping(value="drivers/add/", method = RequestMethod.GET)
	public void renderAdd(Model model, @ModelAttribute Drivers drivers,@RequestParam(required=false) Integer id){
		
	}
	
	@RequestMapping(value="drivers/add/", method = RequestMethod.POST)
	public String submitAdd(@Valid Drivers driver, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
		logger.info("Additing new Driver in database");
		if(result.hasErrors()){
			logger.info("Here is Error while additing to DB");
			return null;
		}
		logger.info("We additing this:" + driver);
		driver.setOwn_number(UUID.randomUUID().toString());
		driversService.create(driver);
		redirectAttributes.addFlashAttribute("message", "Ĺ�idiÄŤ "+ driver.getLastname() +" pĹ™idĂˇn");
		return "redirect:/drivers/";
	} 
	
}
