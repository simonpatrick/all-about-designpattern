package io.hedwig.dp.creational.simplefactory;

/**
 * Created by patrick on 15/4/10.
 *
 * @version $Id$
 */


public class ProductMaker {

    public static Product create(String context){
        switch (context){
            case "product1":
                return new Product1();
            case "product2":
                return new Product2();
            default:
                return new Product() {
                };
        }
    }
    public static void main(String[] args) {
        create("product1").sendSms();
        create("product2").sendSms();
        create("product4435").sendSms();
    }
}
