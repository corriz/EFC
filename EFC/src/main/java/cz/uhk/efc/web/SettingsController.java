/**
 * 
 */
package cz.uhk.efc.web;


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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cz.uhk.efc.model.Cars;
import cz.uhk.efc.model.Fuel;
import cz.uhk.efc.services.FuelService;

/**
 * @author corri
 *
 */
@Controller
@RequestMapping(value="/settings")
public class SettingsController {
	
	private static final Logger logger = LoggerFactory.getLogger(SettingsController.class);
		
	@Autowired
	private FuelService fuelService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String renderDefault(@ModelAttribute Fuel fuel,@ModelAttribute Cars car, Model model){
		model.addAttribute("fuels", fuelService.findAll());
		return "/settings/default";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String submitFuel(@Valid Fuel fuel, BindingResult result, Model model, RedirectAttributes redirectAttributes){
		logger.info("Add new Fuel: " + fuel.getName());
		if(result.hasErrors()){
			logger.info("Additing crash!!!");
			redirectAttributes.addFlashAttribute("message","Něco se stalo při ukládání, zkontroluj log.");
			return "/settings/default/";
		}
		logger.info("Additing new:" + fuel.getName());
		fuelService.create(fuel);
		redirectAttributes.addFlashAttribute("message", "Nová položka"+ fuel.getName() + "úspěšně uložena.");		
		return "redirect: /settings/default/";
	}
}
