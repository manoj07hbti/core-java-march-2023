package collection.Hashset;

import collection.Model.Employee;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Employee_Hashset {
 public void employeeSet(){
     HashSet<Employee>employees=new HashSet<>();
     //Creating LinkedHashSet for Printing data in Incerstion Order (Sequnce Order)==================
     LinkedHashSet<Employee> linkedHashset=new LinkedHashSet<>();

     Employee employee1=new Employee("Rahul", "Wipro","Software Engenier",18900.23);
     System.out.println("Hashcode Details Employee 1 :- "+employee1.hashCode());

     // Creating Duplicate to check Hashcode & Equals===========================
     Employee employee4=new Employee("Ajeet","Wipro","Frontend Developer",28900.23);
     System.out.println("Hashcode Details Employee 4 :- "+employee4.hashCode());

     Employee employee2=new Employee("Rohit","HCL","Backend Developer",25900.23);
     System.out.println("Hashcode Details Employee 2 :- "+employee2.hashCode());

     Employee employee3=new Employee("Ajeet","Wipro","Frontend Developer",28900.23);
     System.out.println("Hashcode Details Employee 3 :- "+employee3.hashCode());

     employees.add(employee1);
     employees.add(employee2);
     employees.add(employee3);
     employees.add(employee4);

     //Creating LinkedHashSet.Add to Obj Creating============
     linkedHashset.add(employee1);
     linkedHashset.add(employee2);
     linkedHashset.add(employee3);
     linkedHashset.add(employee4);
     linkedHashset.add(employee1);
     linkedHashset.add(employee2);

     //Using Advance for loop for Print Linked has set============

     for (Employee var:linkedHashset){
         System.out.println("Printing LinkedHashSet Employee Name:- "+ var.getName() + "Company Name:- "+ var.getCompany_name()+
                 "Designation:- "+ var.getDesignation()+ "Salary:- "+ var.getSalary());
     }


     for (Employee var:employees){
         System.out.println("Employee Name:- "+ var.getName() + "Company Name:- "+ var.getCompany_name()+
                 "Designation:- "+ var.getDesignation()+ "Salary:- "+ var.getSalary());
     }
 }
    public static void main(String[] args) {
     Employee_Hashset obj=new Employee_Hashset();
     obj.employeeSet();
    }
}
