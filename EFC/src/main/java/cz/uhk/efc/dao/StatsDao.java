package cz.uhk.efc.dao;

import java.util.List;

import cz.uhk.efc.model.Stats;

/**
 *
 * Statisty svazane s poloykami. Zaznamenavaji se pocty kilometru a datum.
 * Tyto polozky jsou pak dale sdileny mezi Costs (dalsi vydaje na auto) a refueling
 * (jednotliva tankovani)
 * @author corri
 *
 *
 */
public interface StatsDao {

	/**
	 * Vybere jednu konkretni statistiku podle ID
	 * @param id
	 * @return Stats
	 */
	Stats get(int id);
	/**
	 * Ulozi jeden zaznam do databaze statistik
	 * @param stat
	 */
	void save(Stats stat);
	/**
	 * Vymaze jeden zaznam z databaze
	 * @param stat
	 */
	void delete(Stats stat);
	/**
	 * Vybere vsechny statistiky z DB
	 * @return List<Stats>
	 */
	List<Stats> findAll();
}
