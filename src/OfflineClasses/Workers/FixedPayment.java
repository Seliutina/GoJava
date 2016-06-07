package OfflineClasses.Workers;


public class FixedPayment extends Employer {
    FixedPayment(String name, double salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public double calcSalary() {
        return this.salary;
    }

}
