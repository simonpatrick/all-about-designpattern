package io.hedwig.jrefactoring.introduceParameterObject;

/**
 * Created by patrick on 15/11/4.
 */
public class Registration {
    public void create(double amount,String name,
                       double credits){
        //do work
    }

    public void createRefactored(RegistrationContext context){
        //do work
    }
}
