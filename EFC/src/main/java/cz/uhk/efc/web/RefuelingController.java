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
import cz.uhk.efc.model.Refueling;
import cz.uhk.efc.services.DriversService;
import cz.uhk.efc.services.RefuelingService;

/**
 * @author corri
 *
 */
@Controller
public class RefuelingController {

	private static final Logger logger = LoggerFactory.getLogger(RefuelingController.class);
	
	@Autowired
	private RefuelingService refuelingService;
	
	@RequestMapping("refueling/")
	public String renderOverView(Model model) {
		logger.info("Show complet overview for Refueling");
		model.addAttribute("refueling", refuelingService.findAll());
		return "refueling/default";
	}
	
	@RequestMapping(value = "refueling/list/remove", method = RequestMethod.GET)
	public String remove(@RequestParam(value = "id", required = false) Integer id, Model m) {
		if(id != null){
			refuelingService.deleteById(id);
			return "redirect:/refueling/list/";
		}
		return "redirect:/refueling/list/";
	}
	
	@RequestMapping(value="refueling/list/", method= RequestMethod.GET )
	public String renderList(Model model) {
		logger.info("Show all Refueling in database");
		model.addAttribute("refuelings", refuelingService.findAll());
		return "refueling/list";
	} 
	
	@RequestMapping(value="refueling/add/", method = RequestMethod.GET)
	public void renderAdd(Model model, @ModelAttribute Refueling refuelings,@RequestParam(required=false) Integer id){
		
	}
	
	@RequestMapping(value="drivers/add/", method = RequestMethod.POST)
	public String submitAdd(@Valid Refueling refueling, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
		logger.info("Additing new Refueling in database");
		if(result.hasErrors()){
			logger.info("Here is Error while additing to DB");
			return null;
		}
		logger.info("We additing this:" + refueling);
		//driver.setOwn_number(UUID.randomUUID().toString());
		refuelingService.create(refueling);
		redirectAttributes.addFlashAttribute("message", "�?idič "+ refueling.getDriver().getLastname() +" přidán");
		return "redirect:/drivers/";
	} 
	
}
