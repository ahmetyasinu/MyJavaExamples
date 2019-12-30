package java05;

public class SalaryInfo {
    private int annualSalary;
    private double needToPayAnnualTax;
    private double taxHaveToPay;
    private double taxCutSalary;

    @Override
    public String toString() {
        return "SalaryInfo{" +
                "annualSalary=" + annualSalary +
                ", needToPayAnnualTax=" + needToPayAnnualTax +
                ", taxHaveToPay=" + taxHaveToPay +
                ", taxCutSalary=" + taxCutSalary +
                '}';
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setNeedToPayAnnualTax(double needToPayAnnualTax) {
        this.needToPayAnnualTax = needToPayAnnualTax;
    }

    public void setTaxHaveToPay(double taxHaveToPay) {
        this.taxHaveToPay = taxHaveToPay;
    }

    public void setTaxCutSalary(double taxCutSalary) {
        this.taxCutSalary = taxCutSalary;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public double getNeedToPayAnnualTax() {
        return needToPayAnnualTax;
    }

    public double getTaxHaveToPay() {
        return taxHaveToPay;
    }

    public double getTaxCutSalary() {
        return taxCutSalary;
    }
}
