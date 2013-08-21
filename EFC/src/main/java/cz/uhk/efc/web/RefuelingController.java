/**
 * 
 */
package cz.uhk.efc.web;

import java.util.Date;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cz.uhk.efc.model.Refueling;
import cz.uhk.efc.model.Stats;
import cz.uhk.efc.services.CarService;
import cz.uhk.efc.services.DriversService;
import cz.uhk.efc.services.RefuelingService;
import cz.uhk.efc.services.StatsService;

/**
 * @author corri
 *
 */
@Controller
@RequestMapping(RefuelingController.URL)
public class RefuelingController {

	private static final Logger logger = LoggerFactory.getLogger(RefuelingController.class);
	
	@Autowired
	private RefuelingService refuelingService;
	
	protected static final String URL = "/refueling";
	
	@Autowired
	private DriversService driversService;
	
	@Autowired
	private StatsService statsService;
	
	@Autowired
	private CarService carService;
	
	/**
	 * Overview pages
	 * **/
	
	@RequestMapping(method = RequestMethod.GET)
	public String initView(@ModelAttribute Refueling refuel, Model model){
		return URL + "/default";
	}
	
	/**
	 * List pages
	 * **/
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String initList(Model model){
		model.addAttribute("cars", carService.findAll());
		model.addAttribute("refuelings", refuelingService.findAll());
		return URL + "/list";
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.GET)
	public String removeOne(@RequestParam(value = "id", required = false) Integer id, Model model, RedirectAttributes redirectAttributes){
		if(id != null){
			redirectAttributes.addFlashAttribute("message", "Položka " + "smazána!");
			refuelingService.deleteById(id);
		}
		return "redirect:" + URL + "/list";
	}
	
	/**
	 * Form pages
	 * **/
	
	@RequestMapping(value = "/{carId}/add", method = RequestMethod.GET)
	public String initCostForm(@PathVariable("carId") int carId,@ModelAttribute(value="refueling") Refueling refueling, Model model){
		logger.info("Add refueling to car " + carId);
		model.addAttribute("drivers", driversService.findAll());
		model.addAttribute("car", carService.findOne(carId));
		return URL + "/add";
	}
	
	@RequestMapping(value = "/{carId}/add", method = RequestMethod.POST)
	public String submitCostForm(@PathVariable("carId") int carId,@Valid Refueling refueling, BindingResult result, Model model, RedirectAttributes redirectAttributes){
		logger.info("Try refueling to car " + carId);
		Stats stat = new Stats();
		stat.setDate(new Date());
		stat.setKilometers(refueling.getStat().getKilometers());
		stat.setPrice(refueling.getStat().getPrice());
		statsService.create(stat);
		
		refueling.setDriver(driversService.findOne(refueling.getDriver().getId()));
		refueling.setStat(statsService.findOne(stat.getId()));
		refueling.setCar(carService.findOne(carId));
		refuelingService.create(refueling);
		redirectAttributes.addFlashAttribute("message", "Nový čerpání v hodnotě: "+ stat.getPrice() +" počet litrů: "+ refueling.getAmount() + "l úspěšně vložen do databáze.");		
		return "redirect:"+ URL;
	}
	
	@RequestMapping(value="/{refId}/edit", method= RequestMethod.GET)
	public String editCost(@PathVariable("refId") int reftId,Model model){
		model.addAttribute("cars", carService.findAll());
		model.addAttribute("drivers", driversService.findAll());
		model.addAttribute("refueling", refuelingService.findOne(reftId));
		return URL + "/add";
	}
	
	@RequestMapping(value = "/{refId}/edit", method = RequestMethod.PUT)
    public String processUpdateCosts(@Valid Refueling refueling, BindingResult result, @PathVariable("refId") int reftId) {
        //Refueling updateRef = refuelingService.findOne(reftId);
		//refueling.setDriver(driversService.findOne(refueling.getDriver().getId()));
        refueling.getStat().setDate(new Date());;
		refuelingService.update(refueling);
        return "redirect:" + URL;
    }
	
	
	
}
