package collection;

import model.Employee;

import java.util.ArrayList;

public class Employee_ArrayList {

    public ArrayList<Employee> Emp_List(){
        ArrayList<Employee> employee_detail=new ArrayList<>();

        //creating data using employee class from model

        Employee employee1=new Employee(51296,"VINAY","IT");
        Employee employee2=new Employee(48596,"ROHAN","HR");
        Employee employee3=new Employee(44117,"AMAN","FINANCE");
        Employee employee4=new Employee(52416,"RAHUL","SALES");
        Employee employee5=new Employee(56987,"SHUBHAM","PRODUCTION");

        //ADDING DATA INTO LIST
        employee_detail.add(employee1);
        employee_detail.add(employee2);
        employee_detail.add(employee3);
        employee_detail.add(employee4);
        employee_detail.add(employee5);

        return employee_detail;
    }

    public static void main(String[] args) {
        Employee_ArrayList obj=new Employee_ArrayList();

        //PRINTING WITH ADVANCE LOOP
        for(Employee var:obj.Emp_List()){
            System.out.println("\nDETAILS OF EMPLOYEE WITH ADVANCE LOOP\n"+"NAME : "+var.getEmp_name()+"\n"+"ID : "+var.getEmp_id()+"\n"+"DEPARTMENT : "+var.getEmp_department());
        }

        //PRINTING WITH FOR LOOP
        for(int i=0; i < obj.Emp_List().size();i++){
            System.out.println("\nDETAILS OF EMPLOYEE WITH FOR LOOP\n"+"NAME : "+obj.Emp_List().get(i).getEmp_name()+"\n"+"ID : "+obj.Emp_List().get(i).getEmp_id()+"\n"+"DEPARTMENT : "+obj.Emp_List().get(i).getEmp_department());

        }

        //PRINTING WITH WHILE LOOP
        int i=0;
        while(i<obj.Emp_List().size()){
            System.out.println("\nDETAILS OF EMPLOYEE WITH WHILE LOOP\n"+"NAME : "+obj.Emp_List().get(i).getEmp_name()+"\n"+"ID : "+obj.Emp_List().get(i).getEmp_id()+"\n"+"DEPARTMENT : "+obj.Emp_List().get(i).getEmp_department());
            i++;
        }

    }
}
