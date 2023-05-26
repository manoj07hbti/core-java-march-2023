package model;

public class Corporate_Employee {
    String companyName;
    String employeeName;
    int employeeId;
    int salary;

    public Corporate_Employee(String companyName, String employeeName, int employeeId, int salary) {
        this.companyName = companyName;
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
