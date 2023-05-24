package collection.Model;

import java.util.Objects;

public class Employee {
    String name;
    String company_name;
    String designation;
    double salary;

    //Create Param Constructor=================================
    public Employee(String name, String company_name, String designation, double salary) {
        this.name = name;
        this.company_name = company_name;
        this.designation = designation;
        this.salary = salary;
    }

    //Create Hashcode& Equals===================================


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name)
                && Objects.equals(company_name, employee.company_name) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company_name, designation, salary);
    }

    // Create getter & setter=====================================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
