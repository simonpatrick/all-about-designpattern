package io.hedwig.jrefactoring.moveMethod.refactored;

/**
 * Created by patrick on 15/10/27.
 */
public class BankAccountRefactored {

    private int accountAge;
    private int creditScore;
    private AccountInterestRefactored accountInterest;

    public int getAccountAge() {
        return accountAge;
    }

    public void setAccountAge(int accountAge) {
        this.accountAge = accountAge;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

}
