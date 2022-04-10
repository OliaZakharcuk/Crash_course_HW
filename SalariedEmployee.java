package com.company;

public class SalariedEmployee extends Employee implements CalculatePay{
    private String name;
    private String socialSecurityNumber;
    private Integer hourlyRate = 50;
    private Integer numberOfHoursWorked;

    public SalariedEmployee( String employeeId, String name, String socialSecurityNumber, Integer numberOfHoursWorked) {
        super(employeeId);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public void calculatePay() {
        this.setAverageMonthlySalary(this.hourlyRate * this.numberOfHoursWorked);

    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Integer getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Integer hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Integer getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(Integer numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.socialSecurityNumber + " " + this.getAverageMonthlySalary();
    }
}
