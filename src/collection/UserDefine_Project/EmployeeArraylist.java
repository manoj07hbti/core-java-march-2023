package collection.UserDefine_Project;

import collection.Model.Employee;

import java.util.ArrayList;

public class EmployeeArraylist {
    //Create custom Employee list=========

    public ArrayList <Employee> employeeList(){
        ArrayList <Employee>employees=new ArrayList<>();
        Employee employee1=new Employee("Rahul","Wipro","Software Engenier",18900.23);
        Employee employee2=new Employee("Rohit","HCL","Backend Developer",25900.23);
        Employee employee3=new Employee("Ajeet","Wipro","Frontend Developer",28900.23);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        return employees;
    }

    public static void main(String[] args) {
        EmployeeArraylist obj=new EmployeeArraylist();
        for (Employee var: obj.employeeList()){
            System.out.println("Employee Name:= "+var.getName());
            System.out.println("Company Name := "+var.getCompany_name());
            System.out.println("Designation := "+var.getDesignation());
            System.out.println("Salary := "+var.getSalary());

        }
    }
}
