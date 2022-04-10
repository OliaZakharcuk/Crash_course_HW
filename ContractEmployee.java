package com.company;

public class ContractEmployee extends Employee implements CalculatePay{
    private String name;
    private boolean federalTaxIdMember;
    private Integer fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String name, boolean federalTaxIdMember, Integer fixedMonthlyPayment) {
        super(employeeId);
        this.name = name;
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public void calculatePay() {
        this.setAverageMonthlySalary(fixedMonthlyPayment);

    }
    @Override
    public String toString() {
        return this.name + " " + this.fixedMonthlyPayment ;
    }
    public boolean isFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(boolean federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public Integer getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(Integer fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
