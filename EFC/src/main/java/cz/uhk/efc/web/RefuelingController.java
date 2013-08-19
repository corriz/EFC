/**
 * 
 */
package cz.uhk.efc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	
	
}
