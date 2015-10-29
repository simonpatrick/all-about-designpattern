package io.hedwig.jrefactoring.extractSubClass.refactored;

/**
 * Created by patrick on 15/10/29.
 */
public class NoneRegistration extends RegistrationRefactored {
    private String action;
    private String notes;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
