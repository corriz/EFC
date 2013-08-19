/**
 * 
 */
package cz.uhk.efc.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cz.uhk.efc.model.Costs;
import cz.uhk.efc.model.Fuel;
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
	public String initView(@ModelAttribute Costs cost, Model model){
		return URL + "/default";
	}
	
	/**
	 * List pages
	 * **/
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String initList(@ModelAttribute Costs cost, Model model){
		return URL + "/list";
	}
	
	/**
	 * Form pages
	 * **/
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String initCostForm(@ModelAttribute Costs cost, Model model){
		return URL + "/add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String submitCostForm(@Valid Costs cost, BindingResult result, Model model, RedirectAttributes redirectAttributes){
				
		return "redirect:"+ URL;
	}
	
}
