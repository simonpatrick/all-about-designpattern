package io.hedwig.jrefactoring.replaceExceptionWithCondition;

/**
 * Created by patrick on 15/10/29.
 */
public class Microwave {
    private boolean isCooked =false;

    public boolean start(Object food){
        try{
            System.out.println("cook");
            isCooked=true;
        }catch (Exception e){
            isCooked=false;
        }
        return isCooked;
    }

    public boolean startRefactored(Object food){
        if(!isCooked){
            System.out.println("cook");
            isCooked=true;
        }

        return isCooked;
    }
}
