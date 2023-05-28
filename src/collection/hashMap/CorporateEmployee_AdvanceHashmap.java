package collection.hashMap;

import model.Corporate_Employee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class CorporateEmployee_AdvanceHashmap {
    public static void main(String[] args) {

        //creating hashmap which will store employee data

        HashMap<String, ArrayList<Corporate_Employee>> employeeArrayListHashMap=new HashMap<>();

        //// we need create data for multiple companies
        ArrayList<Corporate_Employee> IBM_employees =new ArrayList<>();
        ArrayList<Corporate_Employee> TCS_employees =new ArrayList<>();
        ArrayList<Corporate_Employee> INFOSYS_employees=new ArrayList<>();

        Corporate_Employee emp1 =new Corporate_Employee(1411,"AMAN","IBM",66000);
        Corporate_Employee emp2 =new Corporate_Employee(1412,"ROHAN","IBM",55000);
        Corporate_Employee emp3 =new Corporate_Employee(1413,"MOHAN","IBM",24000);
        Corporate_Employee emp4 =new Corporate_Employee(1414,"SOHAN","IBM",54200);
        Corporate_Employee emp5 =new Corporate_Employee(1415,"MITHLESH","IBM",12000);
        Corporate_Employee emp6 =new Corporate_Employee(1416,"ASHOK","IBM",10000);
        Corporate_Employee emp7 =new Corporate_Employee(1417,"RAGHAV","IBM",89000);
        Corporate_Employee emp8 =new Corporate_Employee(1418,"SUMAN","IBM",99000);
        Corporate_Employee emp9 =new Corporate_Employee(1419,"SEEMA","IBM",45000);
        Corporate_Employee emp10=new Corporate_Employee(1420,"NAINA","IBM",36000);

        Corporate_Employee emp11 =new Corporate_Employee(1511,"AMAN","TCS",15000);
        Corporate_Employee emp12 =new Corporate_Employee(1512,"ROHAN","TCS",15200);
        Corporate_Employee emp13 =new Corporate_Employee(1513,"MOHAN","TCS",24000);
        Corporate_Employee emp14 =new Corporate_Employee(1514,"SOHAN","TCS",56200);
        Corporate_Employee emp15 =new Corporate_Employee(1515,"MITHLESH","TCS",45000);
        Corporate_Employee emp16 =new Corporate_Employee(1516,"ASHOK","TCS",20000);
        Corporate_Employee emp17 =new Corporate_Employee(1517,"RAGHAV","TCS",45000);
        Corporate_Employee emp18 =new Corporate_Employee(1518,"SUMAN","TCS",65000);
        Corporate_Employee emp19 =new Corporate_Employee(1519,"SEEMA","TCS",52000);
        Corporate_Employee emp20=new Corporate_Employee(1520,"NAINA","TCS",32000);

        Corporate_Employee emp21 =new Corporate_Employee(1611,"AMAN","INFOSYS",62000);
        Corporate_Employee emp22 =new Corporate_Employee(1612,"ROHAN","INFOSYS",15200);
        Corporate_Employee emp23 =new Corporate_Employee(1613,"MOHAN","INFOSYS",45000);
        Corporate_Employee emp24 =new Corporate_Employee(1614,"SOHAN","INFOSYS",55200);
        Corporate_Employee emp25 =new Corporate_Employee(1615,"MITHLESH","INFOSYS",32000);
        Corporate_Employee emp26 =new Corporate_Employee(1616,"ASHOK","INFOSYS",22000);
        Corporate_Employee emp27 =new Corporate_Employee(1617,"RAGHAV","INFOSYS",25000);
        Corporate_Employee emp28 =new Corporate_Employee(1618,"SUMAN","INFOSYS",78000);
        Corporate_Employee emp29 =new Corporate_Employee(1619,"SEEMA","INFOSYS",24000);
        Corporate_Employee emp30=new Corporate_Employee(1620,"NAINA","INFOSYS",34500);

        IBM_employees.add(emp1);
        IBM_employees.add(emp2);
        IBM_employees.add(emp3);
        IBM_employees.add(emp4);
        IBM_employees.add(emp5);
        IBM_employees.add(emp6);
        IBM_employees.add(emp7);
        IBM_employees.add(emp8);
        IBM_employees.add(emp9);
        IBM_employees.add(emp10);

        TCS_employees.add(emp11);
        TCS_employees.add(emp12);
        TCS_employees.add(emp13);
        TCS_employees.add(emp14);
        TCS_employees.add(emp15);
        TCS_employees.add(emp16);
        TCS_employees.add(emp17);
        TCS_employees.add(emp18);
        TCS_employees.add(emp19);
        TCS_employees.add(emp20);

        INFOSYS_employees.add(emp21);
        INFOSYS_employees.add(emp22);
        INFOSYS_employees.add(emp23);
        INFOSYS_employees.add(emp24);
        INFOSYS_employees.add(emp25);
        INFOSYS_employees.add(emp26);
        INFOSYS_employees.add(emp27);
        INFOSYS_employees.add(emp28);
        INFOSYS_employees.add(emp29);
        INFOSYS_employees.add(emp30);

        employeeArrayListHashMap.put("IBM",IBM_employees);
        employeeArrayListHashMap.put("TCS",TCS_employees);
        employeeArrayListHashMap.put("INFOSYS",INFOSYS_employees);

        for(String var: employeeArrayListHashMap.keySet()){
            if(var.equals("IBM")){
              for(Corporate_Employee ibm_emp:IBM_employees){
                  if(ibm_emp.getCorpEmp_Salary()>=45000){
                      System.out.println("\nPRINTING IBM COMPANY EMPLOYEE DATA"+"\n"+"ID : " +ibm_emp.getCorpEmp_id()+"\nNAME : "+ibm_emp.getCorpEmp_Name()+"\nCOMPANY NAME : "+ibm_emp.getCorpEmp_compName()+"\nSALARY : "+ibm_emp.getCorpEmp_Salary());
                  }
              }
            }
        }
        for(String var: employeeArrayListHashMap.keySet()){
            if(var.equals("TCS")){
                for(Corporate_Employee tcs_emp:TCS_employees){
                    if(tcs_emp.getCorpEmp_Salary()>=45000) {
                        System.out.println("\nPRINTING TCS COMPANY EMPLOYEE DATA" + "\n" + "ID : " + tcs_emp.getCorpEmp_id() + "\nNAME : " + tcs_emp.getCorpEmp_Name() + "\nCOMPANY NAME : " + tcs_emp.getCorpEmp_compName() + "\nSALARY : " + tcs_emp.getCorpEmp_Salary());
                    }
                }
            }
        }
    }
}
