package io.hedwig.jrefactoring.extractSubClass.refactored;

import java.util.Date;

/**
 * Created by patrick on 15/10/29.
 */
public class RegistrationRefactored {
    private double total;
    private String description;
    private Date registrationDate;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
