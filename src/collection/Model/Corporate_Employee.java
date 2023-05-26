package collection.Model;

import java.util.Objects;

public class Corporate_Employee {
    String companyName;
    String employeeName;
    int employeeId;
    int salary;

    // Create Param constructor============================================
    public Corporate_Employee(String companyName, String employeeName, int employeeId, int salary) {
        this.companyName = companyName;
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    //Crate hashCode & Equals for maintain incertion order=======================
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Corporate_Employee employee = (Corporate_Employee) o;
        return employeeId == employee.employeeId && salary == employee.salary && Objects.equals(companyName, employee.companyName) && Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, employeeName, employeeId, salary);
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


