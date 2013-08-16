package cz.uhk.efc.dao;

import cz.uhk.efc.common.IOperations;
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
public interface StatsDao extends IOperations<Stats>{

}
