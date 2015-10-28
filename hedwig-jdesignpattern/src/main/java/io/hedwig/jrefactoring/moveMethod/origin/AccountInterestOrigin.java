package io.hedwig.jrefactoring.moveMethod.origin;

/**
 * Created by patrick on 15/10/27.
 */
public class AccountInterestOrigin {
    private BankAccountOrigin ba;

    private double interestRate =ba.calculateInterestRate();
    private boolean introductorRate;

    public AccountInterestOrigin(BankAccountOrigin ba) {
        this.ba = ba;
    }

    public BankAccountOrigin getBa() {
        return ba;
    }

    public void setBa(BankAccountOrigin ba) {
        this.ba = ba;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isIntroductorRate() {
        return ba.calculateInterestRate()<0.05;
    }

    public void setIntroductorRate(boolean introductorRate) {
        this.introductorRate = introductorRate;
    }
}
