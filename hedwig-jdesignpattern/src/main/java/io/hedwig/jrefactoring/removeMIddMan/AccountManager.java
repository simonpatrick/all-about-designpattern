package io.hedwig.jrefactoring.removeMIddMan;

/**
 * Created by patrick on 15/11/4.
 */
public class AccountManager {
    public AccountDataProvider dataProvider;

    public AccountDataProvider getDataProvider() {
        return dataProvider;
    }

    public void setDataProvider(AccountDataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }
}
