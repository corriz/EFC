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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.common.base.Preconditions;

import cz.uhk.efc.model.Cars;
import cz.uhk.efc.model.Fuel;
import cz.uhk.efc.services.CarService;
import cz.uhk.efc.services.DriversService;
import cz.uhk.efc.services.FuelService;

/**
 * @author corri
 *
 */
@Controller
@RequestMapping(value= SettingsController.URL)
public class SettingsController {
	
	public static final String URL = "/settings";
	
	private static final Logger logger = LoggerFactory.getLogger(SettingsController.class);
		
	@Autowired
	private FuelService fuelService;
	
	@Autowired
	private CarService carService;
	
	@Autowired
	private DriversService driversService;
		
	@RequestMapping(method = RequestMethod.GET)
	public String renderDefault(Model model){
		model.addAttribute("fuels", fuelService.findAll());
		model.addAttribute("cars", carService.findAll());
		return URL + "/default";
	}
	
	@RequestMapping(value="/add-fuel", method = RequestMethod.GET)
	public void initFuelForm(Model model,@ModelAttribute (value = "fuel") Fuel fuel, @RequestParam(required=false) Integer id){
		
	}
	
	@RequestMapping(value= "/add-fuel", method = RequestMethod.POST)
	public String submitFuel(@Valid Fuel fuel,BindingResult result, Model model, RedirectAttributes redirectAttributes){
			logger.info("Add new Fuel: " + fuel.getName());
			if(result.hasErrors()){
				logger.info("Additing crash!!!");
				redirectAttributes.addFlashAttribute("message","Něco se stalo při ukládání, zkontroluj log.");
				return "redirect:" + URL;
			}
			logger.info("Additing new:" + fuel.getName());
			fuelService.create(fuel);
			redirectAttributes.addFlashAttribute("message", "Nová položka "+ fuel.getName() + " úspěšně uložena.");		
			return "redirect:" + URL;
	}
	
	@RequestMapping(value="/add-car", method = RequestMethod.GET)
	public void initCarForm(Model model,@ModelAttribute (value = "car") Cars car, @RequestParam(required=false) Integer id){
		model.addAttribute("fuels", fuelService.findAll());
		model.addAttribute("drivers", driversService.findAll());
	}
	
	@RequestMapping(value="/add-car", method = RequestMethod.POST)
	public String submitCar(@Valid Cars car, BindingResult result, Model model, RedirectAttributes redirectAttributes){
		logger.info("Add new Car: " + car.getModel());
		car.setDriver(driversService.findOne(car.getDriver().getId()));
		car.setFuel(fuelService.findOne(car.getFuel().getId()));
		/*if(result.hasErrors()){
			logger.info("Additing crash!!!");
			redirectAttributes.addFlashAttribute("message","Něco se stalo při ukládání, zkontroluj log.");
			return "redirect:" + URL;
		}*/
		
		logger.info("Additing new:" + car.getDriver());
		logger.info("Additing new:" + car.getFuel());
		//car.setDriver(car.getDriver());
		carService.create(car);
		redirectAttributes.addFlashAttribute("message", "Nový automobil: "+ car.getMade() +" Model: "+ car.getModel() + " úspěšně vložen do databáze.");		
		return "redirect:" + URL;
	}
}
