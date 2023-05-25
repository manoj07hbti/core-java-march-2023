package collection.Hash_Map;

import collection.Model.Employee;

import java.util.HashMap;

public class Employee_HashMap_Project {
    public void createEmployeeHashMap(){
        HashMap<String, Employee> employeeHashMap=new HashMap<>();
        //Creating Data=======================================
        Employee employee1=new Employee("Rahul", "Wipro","Software Engenier",18900.23);
        Employee employee2=new Employee("Rohit","HCL","Backend Developer",25900.23);
        Employee employee4=new Employee("Ajeet","Wipro","Frontend Developer",28900.23);
    }
}
