package java19;

public class BasePlusComissionEmployee extends ComissionEmployee {
    private double BaseSalary;

    public BasePlusComissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        setBaseSalary(salary);
    }

    public double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(double salary) {
        BaseSalary = (salary < 0.0) ? 0.0 : salary; // non-negative
    }

    public double earnings()
    {return getBaseSalary() + super.earnings();} // end method earnings

    // return String representation of BasePlusCommissionEmployee object
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    } // end method toString
}
