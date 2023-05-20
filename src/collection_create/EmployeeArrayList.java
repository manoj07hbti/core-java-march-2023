package collection_create;

import model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

    public   ArrayList<Employee> createEmployeeList() {

        ArrayList<Employee> employees = new ArrayList<>();
        Employee employees1 = new Employee("Kapoor", 256552.25, "ITC");
        Employee employees2 = new Employee("Lovely", 452355.85, "Garment");
        Employee employees3 = new Employee("Santy", 45623.60, "Furniture");
        Employee employees4 = new Employee("Manish", 253453.56, "Railway");
        Employee employees5 = new Employee("Pinku", 785623.56, "TVS");
        Employee employees6 = new Employee("Kartik", 852354.23, "MRF");

        employees.add(employees1);
        employees.add(employees2);
        employees.add(employees3);
        employees.add(employees4);
        employees.add(employees5);
        employees.add(employees6);
        return employees;
    }

    public static void main(String[] args) {

        EmployeeArrayList obj = new EmployeeArrayList();
        ArrayList<Employee> output=obj.createEmployeeList();

        for (Employee var:obj.createEmployeeList()){
            System.out.println("printing Employee "+var);

            // for loop
            int i;
            for (i=0;i<output.size();i++){
                System.out.println("for loop " +output.get(i).getName() + " salary " + output.get(i).getSalary() + " department "+output.get(i).getDepartment());
            }

        }

    }
    }


