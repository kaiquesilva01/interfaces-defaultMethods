package services;

public class BrazilInterestService implements InterestService {
    private final double interestRate = 2;

    public BrazilInterestService() {
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
