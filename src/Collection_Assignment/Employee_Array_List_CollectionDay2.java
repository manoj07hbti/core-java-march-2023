package Collection_Assignment;

import Model.Employee;

import java.util.ArrayList;

public class Employee_Array_List_CollectionDay2 {
    public ArrayList<Employee> EmployeeList() {
        // CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList <Employee> employees=new ArrayList<>();
        // create data using model class with param constructor
        Employee employee1 = new Employee("Rajesh",23343,"it");
        Employee employee2 = new Employee("Pradeep",23300," none it");
        Employee employee3 = new Employee("Mohini",23343,"technical");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;

    }

    public static void main(String[] args) {
        Employee_Array_List_CollectionDay2 obj = new Employee_Array_List_CollectionDay2();
        for(Employee var: obj.EmployeeList()){
            System.out.println("Name: "+var.getName() +" Salary: "+var.getSalary() + " Department: "+var.getDepartment());
        }
    }

}
