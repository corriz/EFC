/**
 * 
 */
package cz.uhk.efc.web;

import java.util.Date;

import javax.validation.Valid;

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

import cz.uhk.efc.model.Costs;
import cz.uhk.efc.model.Stats;
import cz.uhk.efc.services.CarService;
import cz.uhk.efc.services.CostsService;
import cz.uhk.efc.services.StatsService;

/**
 * @author corri
 *
 */
@Controller
@RequestMapping(CostsController.URL)
public class CostsController {

	protected static final String URL = "/costs";
	
	@Autowired
	private CostsService costsService;
	
	@Autowired
	private StatsService statsService;
	
	@Autowired
	private CarService carService;
	
	/**
	 * Overview pages
	 * **/
	
	@RequestMapping(method = RequestMethod.GET)
	public String initView(Model model){
		
		model.addAttribute("costs", costsService.findAll());
		
		return URL + "/default";
	}
	
	/**
	 * List pages
	 * **/
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String initList(Model model){
		model.addAttribute("costs", costsService.findAll());
		return URL + "/list";
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.GET)
	public String removeOne(@RequestParam(value = "id", required = false) Integer id, Model model, RedirectAttributes redirectAttributes){
		if(id != null){
			redirectAttributes.addFlashAttribute("message", "Položka " + "smazána!");
			costsService.deleteById(id);
		}
		return "redirect:" + URL + "/list";
	}
	
	/**
	 * Form pages
	 * **/
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void initCostForm(@ModelAttribute(value="cost") Costs cost, Model model){
		model.addAttribute("cars", carService.findAll());
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String submitCostForm(@Valid Costs cost, BindingResult result, Model model, RedirectAttributes redirectAttributes){
		Stats stat = new Stats();
		stat.setDate(new Date());
		stat.setKilometers(cost.getStat().getKilometers());
		stat.setPrice(cost.getStat().getPrice());
		statsService.create(stat);
		cost.setStat(statsService.findOne(stat.getId()));
		cost.setCar(carService.findOne(cost.getCar().getId()));
		costsService.create(cost);
		redirectAttributes.addFlashAttribute("message", "Nový Výdaj v hodnotě: "+ stat.getPrice() +" na: "+ cost.getName() + " úspěšně vložen do databáze.");		
		return "redirect:"+ URL;
	}
	
	@RequestMapping(value="/{costId}/edit", method= RequestMethod.GET)
	public String editCost(@PathVariable("costId") int costId,Model model){
		model.addAttribute("cars", carService.findAll());
		model.addAttribute("cost", costsService.findOne(costId));
		return URL + "/add";
	}
	
	@RequestMapping(value = "/{costId}/edit", method = RequestMethod.PUT)
    public String processUpdateCosts(@Valid Costs cost, BindingResult result,
    		@PathVariable("costId") int costId) {
			Costs updateCost = costsService.findOne(costId);
			cost.getStat().setDate(updateCost.getStat().getDate());
            costsService.update(cost);
            return "redirect:" + URL;
    }
	
}
