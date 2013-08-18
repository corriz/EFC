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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


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
	
	/**
	 * Fuel methods
	 * */
	
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
	
	@RequestMapping(value = "/fuel-remove", method = RequestMethod.GET)
	public String removeFuel(@RequestParam(value = "id", required = false) Integer id, Model m) {
		if(id != null){
			fuelService.deleteById(id);
			return "redirect:" + URL;
		}
		return "redirect:" + URL;
	}
	
	/**
	 * CAR values and methods
	 * */
	
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
		
		carService.create(car);
		redirectAttributes.addFlashAttribute("message", "Nový automobil: "+ car.getMade() +" Model: "+ car.getModel() + " úspěšně vložen do databáze.");		
		return "redirect:" + URL;
	}
	
	@RequestMapping(value="/{carId}/edit-car", method= RequestMethod.GET)
	public String editCar(@PathVariable("carId") int carId,Model model){
		logger.info("Take attribute " + carId);
		model.addAttribute("car", carService.findOne(carId));
		return URL + "/add-car";
	}
	
	@RequestMapping(value = "/{carId}/edit-car", method = RequestMethod.PUT)
    public String processUpdateOwnerForm(@Valid Cars car, BindingResult result, SessionStatus status) {
        if (result.hasErrors()) {
            return "redirect:" + URL + "/add-car";
        } else {
            carService.update(car);
            return "redirect:" + URL;
        }
    }
	
	@RequestMapping(value = "/car-remove", method = RequestMethod.GET)
	public String removeCar(@RequestParam(value = "id", required = false) Integer id, Model m) {
		if(id != null){
			carService.deleteById(id);
			return "redirect:" + URL;
		}
		return "redirect:" + URL;
	}
}
