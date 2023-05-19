package Collection_Assignment;

import Model.Employee;

import java.util.HashSet;

public class Employee_Hashset {
    public void EmployeeSet() {
        HashSet<Employee> employees = new HashSet<>();
        Employee employee1 = new Employee("Rajesh ", 23345, "it");
        Employee employee2 = new Employee("Pradeep", 23300, "none it");
        Employee employee3 = new Employee("Mohini", 23343, "technical");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        for (Employee var : employees) {
            System.out.println("Employee Name:-"+ var.getName()+"Salary"+ var.getSalary()+
                    "Department:-"+var.getDepartment());

        }
    }

    public static void main(String[] args) {
        Employee_Hashset obj=new Employee_Hashset();
        obj.EmployeeSet();


    }
}