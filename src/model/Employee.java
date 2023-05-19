package model;

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
