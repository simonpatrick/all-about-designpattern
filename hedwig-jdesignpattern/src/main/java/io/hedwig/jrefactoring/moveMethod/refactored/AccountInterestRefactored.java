package io.hedwig.jrefactoring.moveMethod.refactored;

/**
 * Created by patrick on 15/10/27.
 */
public class AccountInterestRefactored {
    private BankAccountRefactored ba;

    private double interestRate =calculateInterestRate();
    private boolean introductorRate;

    public AccountInterestRefactored(BankAccountRefactored ba) {
        this.ba = ba;
    }

    public BankAccountRefactored getBa() {
        return ba;
    }

    public void setBa(BankAccountRefactored ba) {
        this.ba = ba;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isIntroductorRate() {
        return calculateInterestRate()<0.05;
    }

    public void setIntroductorRate(boolean introductorRate) {
        this.introductorRate = introductorRate;
    }

    private double calculateInterestRate(){
        if(ba.getCreditScore()>800){
            return 0.02;
        }
        if(ba.getAccountAge()>10){
            return 0.03;
        }
        return 0.05;
    }
}
