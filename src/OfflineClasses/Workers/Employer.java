package OfflineClasses.Workers;


public abstract class Employer {

    public Employer(String name) {


    }


    public static void main(String[] args) {
        FixedPayment emp1 = new FixedPayment("Jack", 200);
        HourlyPayment emp2 = new HourlyPayment("John", 10);
    }



    protected String name;
    protected double salary;

    public void setSalary(double Salary) {
        this.salary = Salary;
    }


    public abstract double calcSalary();

}
