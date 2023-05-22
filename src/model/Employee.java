package model;

import java.util.Objects;

public class Employee {
    String name;
    String company;
    Double salary;
    // make parameterized constructor

    public Employee(String name, String company, Double salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }
    // OVERRIDE HASHCODE AND EQUAL METHOD

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && company.equals(employee.company) && salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, salary);
    }


    // meke getter and seeter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
