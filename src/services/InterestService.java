package services;

import java.security.InvalidParameterException;

public interface InterestService {

    public double getInterestrate();

    default double payment (double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestrate() / 100.0, months);
    }
}
