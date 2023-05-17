package model;

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
