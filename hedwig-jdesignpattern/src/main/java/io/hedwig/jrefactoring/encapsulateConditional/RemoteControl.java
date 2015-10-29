package io.hedwig.jrefactoring.encapsulateConditional;

import java.util.Date;

/**
 * Created by patrick on 15/10/29.
 */
public class RemoteControl {

    private String[] functions;
    private String name;
    private int createdYear;
    public String performCollFunction(String button) {
        if (hasExtraFunction()) {
            return "do something";
        }
        return "";
    }

    private boolean hasExtraFunction() {
        return functions.length > 1 && name == "RCA" &&
                createdYear > new Date().getYear() - 2;
    }

}
