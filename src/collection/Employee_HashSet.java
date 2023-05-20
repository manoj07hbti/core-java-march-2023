package collection;

import model.Employee;

import java.util.HashSet;

public class Employee_HashSet {
    public void creteEmployeeHashSet(){
        HashSet<Employee> employeeSet=new HashSet<>();

        //creating data using employee class from model

        Employee employee1=new Employee(51296,"VINAY","IT");
        Employee employee2=new Employee(48596,"ROHAN","HR");
        Employee employee3=new Employee(44117,"AMAN","FINANCE");
        Employee employee4=new Employee(52416,"RAHUL","SALES");
        Employee employee5=new Employee(56987,"SHUBHAM","PRODUCTION");
        Employee employee6=new Employee(51296,"VINAY","IT");
        Employee employee7=new Employee(48596,"ROHAN","HR");
        Employee employee8=new Employee(44117,"AMAN","FINANCE");
        Employee employee9=new Employee(52416,"RAHUL","SALES");
        Employee employee10=new Employee(56987,"SHUBHAM","PRODUCTION");

        //ADDING DATA INTO LIST
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        employeeSet.add(employee6);
        employeeSet.add(employee7);
        employeeSet.add(employee8);
        employeeSet.add(employee9);
        employeeSet.add(employee10);

        for(Employee var: employeeSet){
            System.out.println("\nID : "+var.getEmp_id()+" NAME : "+var.getEmp_name()+ " DEPARTMENT : "+var.getEmp_department());
        }

        //for removing duplicacy or for own implementation hashcode and equals used in model
    }

    public static void main(String[] args) {
        Employee_HashSet obj=new Employee_HashSet();
        obj.creteEmployeeHashSet();
    }

}
