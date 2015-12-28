package io.hedwig.dp.creational.abstractFactory;

import io.hedwig.dp.creational.abstractFactory.discreteproducts.Army;
import io.hedwig.dp.creational.abstractFactory.discreteproducts.Castle;
import io.hedwig.dp.creational.abstractFactory.factories.EmployedKingdomFactory;
import io.hedwig.dp.creational.abstractFactory.factories.KingdomFactory;
import io.hedwig.dp.creational.abstractFactory.factories.SelfKingdomFactory;

/**
 * Created by patrick on 15/4/25.
 *
 * @version $Id$
 */


public class AppClient {

    public static void main(String[] args) {
        createKingdom(new SelfKingdomFactory());
        createKingdom(new EmployedKingdomFactory());
        createKingdom(new KingdomFactory() {
        });
    }
    public static void createKingdom(KingdomFactory factory){
        Army army =factory.createArmy();
        Castle castle = factory.createCastle();
        System.out.println(army);
        System.out.println(castle);
    }
}
