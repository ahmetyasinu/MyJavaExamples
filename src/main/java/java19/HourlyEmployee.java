package java19;

public class HourlyEmployee extends Employee {
    private double wage; // wage per hour
    private double hours; // hours worked

    public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked) {
        super(first, last, ssn);
        setWage(hourlyWage); // validate hourly wage
        setHours(hoursWorked); // validate hours worked
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;

    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hoursWorked) {
        hours = ((hoursWorked >= 0.0) && (hoursWorked <= 168.0)) ?
                hoursWorked : 0.0;
        this.hours = hours;
    }

    public double earnings() {
        if (getHours() <= 40) // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (gethours() - 40) * getWage() * 1.5;
    } // end method earnings

    private double gethours() {
        return getHours();
    }


    // return String representation of HourlyEmployee object
    public String toString() {
        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    } // end method toString
} // end class HourlyEmployee
