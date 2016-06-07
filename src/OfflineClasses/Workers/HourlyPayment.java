package OfflineClasses.Workers;


public class HourlyPayment extends Employer {
    private final double hoursPerMonth = 20.8 * 8;
    private double rate;

    public void setRate(double rate) {
        this.rate = rate;
    }

    HourlyPayment(String name, double rate){
        super(name);
        this.rate = rate;
    }

    @Override
    public double calcSalary() {
        this.salary = hoursPerMonth * rate;
        return salary;
    }

}
