package cz.uhk.shop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import cz.uhk.shop.domain.Katalog;

/**
 * MultiAction Kontroler spravy katalogu
 * @author kozelto1, krizpa1
 *
 */
@Controller
@RequestMapping("/sprava.do")
public class SpravaKataloguController extends MultiActionController {
	Katalog katalog = null;

	/**
	 * Zobrazeni tabulky polozek s tlacitk pro editaci/mazani
	 * @return
	 */
	@RequestMapping(params="!akce")
	public ModelAndView show() throws Exception {
		return new ModelAndView("katalogSprava","katalog",katalog);
	}

	/**
	 * Smazani polozky
	 * @return 
	 */
	@RequestMapping(params="akce=remove")
	public String remove(@RequestParam("polId") int id) {
		katalog.odstran(id);
		return "redirect:/sprava.do";
	}
	
	public Katalog getKatalog() {
		return katalog;
	}

	@Autowired
	@Qualifier("katalog")
	public void setKatalog(Katalog katalog) {
		this.katalog = katalog;
	}
}
