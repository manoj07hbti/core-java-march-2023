package collection.Hash_Map;

import collection.Model.Employee;

import java.util.HashMap;

public class Employee_HashMap_Project {
    public HashMap<String, Employee> createEmployeeHashMap(){
        HashMap<String, Employee> employeeHashMap=new HashMap<>();
        //Creating Data=======================================
        Employee employee1=new Employee("Rahul", "IBM","Software Engenier",18900.23);
        Employee employee2=new Employee("Rohit","CTS","Backend Developer",25900.23);
        Employee employee3=new Employee("Ajeet","TCS","Frontend Developer",28900.23);
        Employee employee4=new Employee("Akash","DXC","Frontend Developer",28900.23);

        employeeHashMap.put("IBM",employee1);
        employeeHashMap.put("CTS",employee2);
        employeeHashMap.put("TCS",employee3);
        employeeHashMap.put("DXC",employee4);

        return employeeHashMap;
    }

    public static void main(String[] args) {
        Employee_HashMap_Project obj=new Employee_HashMap_Project();
        HashMap<String, Employee> employeeHashMap= obj.createEmployeeHashMap();

        for (String var: employeeHashMap.keySet()){
            if (var.equals("TCS")){
                System.out.println("Printing Employee list:- ");
                System.out.println(employeeHashMap.get(var).getName()+ "" +employeeHashMap.get(var).getCompany_name()
                + "" +employeeHashMap.get(var).getDesignation()+ "" +employeeHashMap.get(var).getSalary());
            }
        }
    }
}
