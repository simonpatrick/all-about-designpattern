package io.hedwig.jrefactoring.removeDuplicated;

import java.util.Date;

/**
 * Created by patrick on 15/10/29.
 */
public class MedicalRecordRefactor {

    Date archivedDate;
    public boolean archived;

    public void archiveRecord(){
        setToArchived();
    }

    private void setToArchived() {
        archived=true;
        archivedDate=new Date();
    }

    public void closeRecord(){
        setToArchived();
    }
}
