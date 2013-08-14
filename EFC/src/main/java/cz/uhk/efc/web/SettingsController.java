/**
 * 
 */
package cz.uhk.efc.web;

import java.util.HashMap;
import java.util.Map;

import javax.el.MapELResolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author corri
 *
 */
@Controller
@RequestMapping(value="/settings")
public class SettingsController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView renderDefault(){
		ModelAndView model = new ModelAndView("/settings/default");
		model.addObject("fuels", null);
		model.addObject("cars", null);
		return model;
	}
}
