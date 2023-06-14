package collection.Advance_HashMap;

import collection.Model.Corporate_Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class Corporate_Employee_HashMap {

    //Add employee with hashmap using and print the Employee of company which get salary more then 45000/=======

    public static void main(String[] args) {

        HashMap<String, ArrayList<Corporate_Employee>> employeeArraylistHashmap =new HashMap<>();
        //Creating Arraylist=================================================
        ArrayList<Corporate_Employee>IBMCompany=new ArrayList<>();
        ArrayList<Corporate_Employee>TCSCompany=new ArrayList<>();
        ArrayList<Corporate_Employee>InfosysCompany=new ArrayList<>();

        //Creating Data for Array list=============================================

        Corporate_Employee employee1=new Corporate_Employee("IBM","Rahul",1,25000);
        Corporate_Employee employee2=new Corporate_Employee("IBM","Ravi",2,45000);
        Corporate_Employee employee3=new Corporate_Employee("IBM","Rohit",3,50000);
        Corporate_Employee employee4=new Corporate_Employee("IBM","Ritesh",4,55000);
        Corporate_Employee employee5=new Corporate_Employee("IBM","Ritu",5,65000);
        Corporate_Employee employee6=new Corporate_Employee("IBM","Riya",6,20000);
        Corporate_Employee employee7=new Corporate_Employee("IBM","Rakesh",7,15000);
        Corporate_Employee employee8=new Corporate_Employee("IBM","Roshni",8,30000);
        Corporate_Employee employee9=new Corporate_Employee("IBM","Rekha",9,45000);
        Corporate_Employee employee10=new Corporate_Employee("IBM","Ritik",10,75000);

        Corporate_Employee employee11=new Corporate_Employee("TCS","Akash",11,35000);
        Corporate_Employee employee12=new Corporate_Employee("TCS","Priya",12,55000);
        Corporate_Employee employee13=new Corporate_Employee("TCS","Rohit",13,50000);
        Corporate_Employee employee14=new Corporate_Employee("TCS","Arun",14,55000);
        Corporate_Employee employee15=new Corporate_Employee("TCS","Varun",15,65000);
        Corporate_Employee employee16=new Corporate_Employee("TCS","Sikha",16,20000);
        Corporate_Employee employee17=new Corporate_Employee("TCS","Lokesh",17,15000);
        Corporate_Employee employee18=new Corporate_Employee("TCS","Suresh",18,30000);
        Corporate_Employee employee19=new Corporate_Employee("TCS","Mahak",19,45000);
        Corporate_Employee employee20=new Corporate_Employee("TCS","Annu",20,65000);

        Corporate_Employee employee21=new Corporate_Employee("Infosys","Amit",21,55000);
        Corporate_Employee employee22=new Corporate_Employee("Infosys","Vivek",22,65000);
        Corporate_Employee employee23=new Corporate_Employee("Infosys","Akhil",23,30000);
        Corporate_Employee employee24=new Corporate_Employee("Infosys","Anand",24,55000);
        Corporate_Employee employee25=new Corporate_Employee("Infosys","Brijesh",25,65000);
        Corporate_Employee employee26=new Corporate_Employee("Infosys","Aman",26,26000);
        Corporate_Employee employee27=new Corporate_Employee("Infosys","Manish",27,65000);
        Corporate_Employee employee28=new Corporate_Employee("Infosys","Shalini",28,30000);
        Corporate_Employee employee29=new Corporate_Employee("Infosys","Gopal",29,35000);
        Corporate_Employee employee30=new Corporate_Employee("Infosys","Avanish",30,25000);

        //Cegricate the data===========================================
        IBMCompany.add(employee1);
        IBMCompany.add(employee2);
        IBMCompany.add(employee3);
        IBMCompany.add(employee4);
        IBMCompany.add(employee5);
        IBMCompany.add(employee6);
        IBMCompany.add(employee7);
        IBMCompany.add(employee8);
        IBMCompany.add(employee9);
        IBMCompany.add(employee10);

        TCSCompany.add(employee10);
        TCSCompany.add(employee11);
        TCSCompany.add(employee12);
        TCSCompany.add(employee13);
        TCSCompany.add(employee14);
        TCSCompany.add(employee15);
        TCSCompany.add(employee16);
        TCSCompany.add(employee17);
        TCSCompany.add(employee18);
        TCSCompany.add(employee19);
        TCSCompany.add(employee20);

        InfosysCompany.add(employee21);
        InfosysCompany.add(employee22);
        InfosysCompany.add(employee23);
        InfosysCompany.add(employee24);
        InfosysCompany.add(employee25);
        InfosysCompany.add(employee26);
        InfosysCompany.add(employee27);
        InfosysCompany.add(employee28);
        InfosysCompany.add(employee29);
        InfosysCompany.add(employee30);

        employeeArraylistHashmap.put("IBM",IBMCompany);
        employeeArraylistHashmap.put("TCS",TCSCompany);
        employeeArraylistHashmap.put("Infosys",InfosysCompany);

        //This loop and method using for collect the all data in keys===========================

        for (String var:employeeArraylistHashmap.keySet()){
            if (var.equals("IBM")){
                ArrayList<Corporate_Employee> IBMData = employeeArraylistHashmap.get(var);

                for (Corporate_Employee cop:IBMData){

                  if(cop.getSalary()>45000){
                      System.out.println("Printing IBM Data:- "+cop.getEmployeeId()+ " " +cop.getEmployeeName()+
                              " " +cop.getCompanyName()+ " " +cop.getSalary());
                  }
               }
              }
            if (var.equals("Infosys")){
                ArrayList<Corporate_Employee> IBMData = employeeArraylistHashmap.get(var);

                for (Corporate_Employee cop:IBMData){

                    if(cop.getSalary()<45000){
                        System.out.println("Printing Infosys Data:- "+cop.getEmployeeId()+ " " +cop.getEmployeeName()+
                                " " +cop.getCompanyName()+ " " +cop.getSalary());
                    }
                }
            }
            }
        }
    }
