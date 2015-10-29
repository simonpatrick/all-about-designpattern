package io.hedwig.jrefactoring.removeDuplicated;

import java.util.Date;

/**
 * Created by patrick on 15/10/29.
 */
public class MedicalRecord {

    Date archivedDate;
    public boolean archived;

    public void archiveRecord(){
        archived=true;
        archivedDate=new Date();
    }

    public void closeRecord(){
        archived=true;
        archivedDate= new Date();
    }
}
