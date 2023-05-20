package model;

import java.util.Objects;

public class Employee {
    int emp_id;
    String emp_name;
    String emp_department;

    //creating parameterized constructor

    public Employee(int emp_id, String emp_name, String emp_department) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_department = emp_department;
    }


    //hashcode anad equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return emp_id == employee.emp_id && Objects.equals(emp_name, employee.emp_name) && Objects.equals(emp_department, employee.emp_department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emp_id, emp_name, emp_department);
    }

    //getter setter

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_department() {
        return emp_department;
    }

    public void setEmp_department(String emp_department) {
        this.emp_department = emp_department;
    }
}
