package collection_demo;

import model.Employee;

import java.util.HashSet;

public class EmployeeHashSet {
    public void employeeSet() {
        HashSet<Employee> employees = new HashSet<>();
        Employee employee1 = new Employee("Rajesh", 23343, "it");
        System.out.println("Hashcode of the employee "+employee1.hashCode());

        Employee employee2 = new Employee("Pradeep", 23300, " none it");
        System.out.println("Hashcode of the employee "+employee2.hashCode());

        Employee employee3 = new Employee("Mohini", 23343, "technical");
        System.out.println("Hashcode of the employee "+employee3.hashCode());

        Employee employee4 = new Employee("Rajesh", 23343, "it");
        System.out.println("Hashcode of the employee "+employee4.hashCode());

        Employee employee5 = new Employee("Pradeep", 23300, " none it");
        System.out.println("Hashcode of the employee "+employee5.hashCode());

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        for (Employee var : employees) {
            System.out.println("Name: " + var.getName() + " Salary: " + var.getSalary() + " Department: " + var.getDepartment());
        }
    }

    public static void main(String[] args) {
        EmployeeHashSet obj = new EmployeeHashSet();
        obj.employeeSet();
    }


    }


