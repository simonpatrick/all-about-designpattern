package io.hedwig.jrefactoring.removeDoubleNegative;

import com.sun.istack.internal.NotNull;

/**
 * Created by patrick on 15/11/4.
 */
public class Order {

    public void checkout(){
        if(!isNotNull()){
            System.out.println("checking ....");
        }
    }

    private boolean isNotNull(){
        return true;
    }

    private boolean isNull(){
        return true;
    }

    public void checkoutRefactored(){
        if(isNull()){
            System.out.println("checking ....");
        }
    }
}
