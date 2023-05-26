package Collection_Assignment;

import Model.Corporate_Employee_Advance_Hashmap;


import java.util.ArrayList;
import java.util.HashMap;

public class Corporate_Employee_Hashmap {
    public static void main(String[] args) {
        HashMap<String,ArrayList<Corporate_Employee_Advance_Hashmap>> employeeArrayListHashMap = new HashMap<>();

        ArrayList<Corporate_Employee_Advance_Hashmap> IBMCompany = new ArrayList<>();
        ArrayList<Corporate_Employee_Advance_Hashmap> TCSCompany = new ArrayList<>();
        ArrayList<Corporate_Employee_Advance_Hashmap> INFOSYSCompany = new ArrayList<>();

        //Data Employee
        Corporate_Employee_Advance_Hashmap Employee1 = new Corporate_Employee_Advance_Hashmap("IBM", "Rahul", 89, 30001);
        Corporate_Employee_Advance_Hashmap Employee2 = new Corporate_Employee_Advance_Hashmap("IBM", "Mayank", 98, 25002);
        Corporate_Employee_Advance_Hashmap Employee3 = new Corporate_Employee_Advance_Hashmap("IBM", "Urmila", 66, 40002);
        Corporate_Employee_Advance_Hashmap Employee4 = new Corporate_Employee_Advance_Hashmap("IBM", "Mintu", 88, 66007);
        Corporate_Employee_Advance_Hashmap Employee5 = new Corporate_Employee_Advance_Hashmap("IBM", "Madhu", 77, 20008);
        Corporate_Employee_Advance_Hashmap Employee6 = new Corporate_Employee_Advance_Hashmap("IBM", "Rohit", 88, 45009);
        Corporate_Employee_Advance_Hashmap Employee7 = new Corporate_Employee_Advance_Hashmap("IBM", "Rajesh", 44, 70004);
        Corporate_Employee_Advance_Hashmap Employee8 = new Corporate_Employee_Advance_Hashmap("IBM", "Sachin", 987, 65003);
        Corporate_Employee_Advance_Hashmap Employee9 = new Corporate_Employee_Advance_Hashmap("IBM", "Rohit", 987, 43004);
        Corporate_Employee_Advance_Hashmap Employee10 = new Corporate_Employee_Advance_Hashmap("IBM", "Saurav", 876, 77005);

        Corporate_Employee_Advance_Hashmap Employee11 = new Corporate_Employee_Advance_Hashmap("TCS", "Shivam", 988, 34005);
        Corporate_Employee_Advance_Hashmap Employee12 = new Corporate_Employee_Advance_Hashmap("TCS", "Hitendra", 7655, 50007);
        Corporate_Employee_Advance_Hashmap Employee13 = new Corporate_Employee_Advance_Hashmap("TCS", "Ramesh", 987, 80007);
        Corporate_Employee_Advance_Hashmap Employee14 = new Corporate_Employee_Advance_Hashmap("TCS", "Choto", 987, 44407);
        Corporate_Employee_Advance_Hashmap Employee15 = new Corporate_Employee_Advance_Hashmap("TCS", "Saroj", 99, 650009);
        Corporate_Employee_Advance_Hashmap Employee16 = new Corporate_Employee_Advance_Hashmap("TCS", "Parash", 777, 4408);
        Corporate_Employee_Advance_Hashmap Employee17 = new Corporate_Employee_Advance_Hashmap("TCS", "Arti", 76, 87908);
        Corporate_Employee_Advance_Hashmap Employee18 = new Corporate_Employee_Advance_Hashmap("TCS", "Sachin", 76, 89706);
        Corporate_Employee_Advance_Hashmap Employee19 = new Corporate_Employee_Advance_Hashmap("TCS", "Vishal", 77, 34205);
        Corporate_Employee_Advance_Hashmap Employee20 = new Corporate_Employee_Advance_Hashmap("TCS", "Raju", 66, 12007);

        Corporate_Employee_Advance_Hashmap Employee21 = new Corporate_Employee_Advance_Hashmap("INFOYS", "Shivam", 988, 34004);
        Corporate_Employee_Advance_Hashmap Employee22 = new Corporate_Employee_Advance_Hashmap("INFOYS", "Hitendra", 7655, 50008);
        Corporate_Employee_Advance_Hashmap Employee23 = new Corporate_Employee_Advance_Hashmap("INFOYS", "Ramesh", 987, 80009);
        Corporate_Employee_Advance_Hashmap Employee24 = new Corporate_Employee_Advance_Hashmap("INFOYS", "Choto", 987, 44405);
        Corporate_Employee_Advance_Hashmap Employee25 = new Corporate_Employee_Advance_Hashmap("INFOYS", "Saroj", 99, 65005);
        Corporate_Employee_Advance_Hashmap Employee26 = new Corporate_Employee_Advance_Hashmap("INFOYS", "Parash", 777, 4407);
        Corporate_Employee_Advance_Hashmap Employee27 = new Corporate_Employee_Advance_Hashmap("INFOYS", "Arti", 76, 87905);
        Corporate_Employee_Advance_Hashmap Employee28 = new Corporate_Employee_Advance_Hashmap("INFOYS", "Sachin", 76, 89706);
        Corporate_Employee_Advance_Hashmap Employee29 = new Corporate_Employee_Advance_Hashmap("INFOYS", "Vishal", 77, 34204);
        Corporate_Employee_Advance_Hashmap Employee30 = new Corporate_Employee_Advance_Hashmap("INFOYS", "Raju", 66, 12006);

        IBMCompany.add(Employee1);
        IBMCompany.add(Employee2);
        IBMCompany.add(Employee3);
        IBMCompany.add(Employee4);
        IBMCompany.add(Employee5);
        IBMCompany.add(Employee6);
        IBMCompany.add(Employee7);
        IBMCompany.add(Employee8);
        IBMCompany.add(Employee9);
        IBMCompany.add(Employee10);

        TCSCompany.add(Employee11);
        TCSCompany.add(Employee12);
        TCSCompany.add(Employee13);
        TCSCompany.add(Employee14);
        TCSCompany.add(Employee15);
        TCSCompany.add(Employee16);
        TCSCompany.add(Employee17);
        TCSCompany.add(Employee18);
        TCSCompany.add(Employee19);
        TCSCompany.add(Employee20);

        INFOSYSCompany.add(Employee21);
        INFOSYSCompany.add(Employee22);
        INFOSYSCompany.add(Employee23);
        INFOSYSCompany.add(Employee24);
        INFOSYSCompany.add(Employee25);
        INFOSYSCompany.add(Employee26);
        INFOSYSCompany.add(Employee27);
        INFOSYSCompany.add(Employee28);
        INFOSYSCompany.add(Employee29);
        INFOSYSCompany.add(Employee30);

        employeeArrayListHashMap.put("IBM", IBMCompany);
        employeeArrayListHashMap.put("TCS", TCSCompany);
        employeeArrayListHashMap.put("INFOSYS", INFOSYSCompany);

        for (String var:employeeArrayListHashMap.keySet()){
            if (var.equals("IBM")){
                for (Corporate_Employee_Advance_Hashmap emp:IBMCompany){
                    System.out.println("Printing IBM Employee:"+emp.getCompanyName()+" "+emp.getEmployeeName()+" "+emp.getSalary()+" "+emp.getEmployeeId());
                }
            }
        }
        for (String var:employeeArrayListHashMap.keySet()){
            if (var.equals("TCS")){
                for (Corporate_Employee_Advance_Hashmap emp:TCSCompany){
                    System.out.println("Printing TCS Employee: "+emp.getCompanyName()+" "+emp.getEmployeeName()+" "+emp.getSalary()+" "+emp.getEmployeeId());
                }
            }
        }


    }

}




