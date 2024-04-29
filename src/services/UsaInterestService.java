package services;

public class UsaInterestService implements InterestService{
    private final double interestRate = 1;

    public UsaInterestService() {

    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
