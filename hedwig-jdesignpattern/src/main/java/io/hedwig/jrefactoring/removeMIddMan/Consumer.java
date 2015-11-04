package io.hedwig.jrefactoring.removeMIddMan;

/**
 * Created by patrick on 15/11/4.
 */
public class Consumer {

    public AccountManager am;

    public void get(int id){
        am.getDataProvider().getAccount(id);
    }

    public AccountDataProvider provider;

    public void getRefactor(int id){
        provider.getAccount(id);
    }

}
