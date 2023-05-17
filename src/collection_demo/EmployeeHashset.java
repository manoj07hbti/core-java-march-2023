package collection_demo;

import model.Employee;

import java.util.HashSet;

public class EmployeeHashset {
    public void createEmployeeHashset(){
        HashSet<Employee> employees=new HashSet<>();

        Employee employee1=new Employee("KAMAL","COGNIZANT",89768.77);
        Employee employee2=new Employee("GUDDU","TCS",90768.77);
        Employee employee3=new Employee("ANIL","MICROSOFT",80868.80);
        Employee employee4=new Employee("RIYA","INFOSYS",78768.77);
        Employee employee5=new Employee("KOMAL","HCL",87068.50);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        System.out.println("count " + employees.hashCode());

        // apply for each loop
        for (Employee var:employees){
            System.out.println("for each loop " + var.getName() + " copmany " +var.getCompany() + " salary " + var.getSalary());
        }

    }

    public static void main(String[] args) {

        EmployeeHashset obj=new EmployeeHashset();
        obj.createEmployeeHashset();
    }
}
