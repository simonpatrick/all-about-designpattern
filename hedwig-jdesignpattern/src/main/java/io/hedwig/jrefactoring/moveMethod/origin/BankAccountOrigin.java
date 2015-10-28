package io.hedwig.jrefactoring.moveMethod.origin;

/**
 * Created by patrick on 15/10/27.
 */
public class BankAccountOrigin {

    private int accountAge;
    private int creditScore;
    private AccountInterestOrigin accountInterest;

    public double calculateInterestRate(){
        if(creditScore>800){
            return 0.02;
        }
        if(accountAge>10){
            return 0.03;
        }
        return 0.05;
    }

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

    public AccountInterestOrigin getAccountInterest() {
        return accountInterest;
    }

    public void setAccountInterest(AccountInterestOrigin accountInterest) {
        this.accountInterest = accountInterest;
    }
}
