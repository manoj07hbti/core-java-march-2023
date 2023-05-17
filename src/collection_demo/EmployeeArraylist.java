package collection_demo;

import model.Employee;

import java.util.ArrayList;

public class EmployeeArraylist {
    public ArrayList<Employee> createEmpArraylist(){
        ArrayList<Employee> employees=new ArrayList<>();

        Employee employees1 =new Employee("RAJ","TCS",58987.90);
        Employee employees2 =new Employee("PREM","VIPRO",707890.90);
        Employee employees3 =new Employee("RAHUL","GENPECT",897687.800);
        Employee employees4 =new Employee("PRIYA","COFORGE",80987.90);
        Employee employees5 =new Employee("VIPIN","NEOSOFT",907890.90);
        Employee employees6 =new Employee("PRASHANT","MICROSOFT",957687.800);

        employees.add(employees1);
        employees.add(employees2);
        employees.add(employees3);
        employees.add(employees4);
        employees.add(employees5);
        employees.add(employees6);
        return employees;
    }

    public static void main(String[] args) {
        EmployeeArraylist obj=new EmployeeArraylist();
        ArrayList<Employee> output=obj.createEmpArraylist();

        //
        // for loop
        int i;
        for (i=0;i<output.size();i++){
            System.out.println("for loop " +output.get(i).getName() + " company " + output.get(i).getCompany() + " salary "+output.get(i).getSalary());
        }
        // while loop apply
        i=0;
        while (i<output.size()){
            System.out.println(" while loop " +output.get(i).getName() + " company " + output.get(i).getCompany() + " salary "+output.get(i).getSalary());
            i++;
        }
        // do while loop
        int j=0;
        do {
            System.out.println(" do while loop " +output.get(j).getName() + " company " + output.get(j).getCompany() + " salary "+output.get(j).getSalary());
            j++;
        }while (j<output.size());
        // advance for loop
        for (Employee var:output){
            System.out.println("for each loop : " + var.getName() +" company " +var.getCompany() +" salary " + var
                    .getSalary());
        }
    }
}
