package collection.Hashset;

import collection.Model.Employee;

import java.util.HashSet;

public class Employee_Hashset {
 public void employeeSet(){
     HashSet<Employee>employees=new HashSet<>();
     Employee employee1=new Employee("Rahul","Wipro","Software Engenier",18900.23);
     Employee employee2=new Employee("Rohit","HCL","Backend Developer",25900.23);
     Employee employee3=new Employee("Ajeet","Wipro","Frontend Developer",28900.23);

     employees.add(employee1);
     employees.add(employee2);
     employees.add(employee3);

     for (Employee var:employees){
         System.out.println("Employee Name:- "+var.getName() + "Company Name:- "+ var.getCompany_name()+
                 "Designation:- "+var.getDesignation()+ "Salary:- "+var.getSalary());
     }
 }

    public static void main(String[] args) {
     Employee_Hashset obj=new Employee_Hashset();
     obj.employeeSet();
    }
}
