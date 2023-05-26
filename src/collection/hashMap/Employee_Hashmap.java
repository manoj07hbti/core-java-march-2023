package collection.hashMap;

import model.Employee;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Employee_Hashmap {
    /* company name IBM , TCS , CTS , DXC
    print only TCS employee */
    public HashMap<String,Employee> createEmployeeHashMap() {
        HashMap<String, Employee> employeeHashMap = new HashMap<>();

        Employee employee1=new Employee(51296,"VINAY","IT");
        Employee employee2=new Employee(48596,"ROHAN","HR");
        Employee employee3=new Employee(44117,"AMAN","FINANCE");
        Employee employee4=new Employee(52416,"RAHUL","SALES");
        Employee employee5=new Employee(56987,"SHUBHAM","PRODUCTION");

        employeeHashMap.put("TCS",employee1);
        employeeHashMap.put("IBM",employee2);
        employeeHashMap.put("CTS",employee3);
        employeeHashMap.put("BXM",employee4);
        employeeHashMap.put("TCS",employee5);


        System.out.println("PRINTING TCS EMPLOYEE DATA");
        for(String var: employeeHashMap.keySet()){

            if(var.equals("TCS")){
                System.out.println("NAME : "+employeeHashMap.get(var).getEmp_name()+"\nID : "+employeeHashMap.get(var).getEmp_id()+"\nDEPARTMENT : "+employeeHashMap.get(var).getEmp_department());
            }
        }

        return employeeHashMap;
    }

    public static void main(String[] args) {
        Employee_Hashmap obj=new Employee_Hashmap();
        obj.createEmployeeHashMap();
    }
}
