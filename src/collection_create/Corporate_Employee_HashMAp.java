package collection_create;

import class_and_object.Employee;
import com.sun.xml.internal.fastinfoset.util.StringArray;
import model.Corporate_Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class Corporate_Employee_HashMAp {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Corporate_Employee>> EmployeeArraylistHashMap = new HashMap<>();
        ArrayList<Corporate_Employee>IBMCompany=new ArrayList<>();
        ArrayList<Corporate_Employee>TCSCompany=new ArrayList<>();
        ArrayList<Corporate_Employee>INFOSYSCompany=new ArrayList<>();

        // creating  data array list:::::::::::::     :::::::::::::::     :::::::::::::::::      ::::::::::::::      :::::::::::::    :::::::::

        Corporate_Employee employee1=new Corporate_Employee("IBM","Manoj",1,30000);
        Corporate_Employee employee2=new Corporate_Employee("IBM","Ved",2,40000);
        Corporate_Employee employee3=new Corporate_Employee("IBM","Mukul",3,65000);
        Corporate_Employee employee4=new Corporate_Employee("IBM","kamal",4,45000);
        Corporate_Employee employee5=new Corporate_Employee("IBM","Rahul",5,86540);
        Corporate_Employee employee6=new Corporate_Employee("IBM","Suman",6,56000);
        Corporate_Employee employee7=new Corporate_Employee("IBM","Tannu",7,52000);
        Corporate_Employee employee8=new Corporate_Employee("IBM","Deepa",8,36000);
        Corporate_Employee employee9=new Corporate_Employee("IBM","Lovely",9,450000);
        Corporate_Employee employee10=new Corporate_Employee("IBM","Kartik",10,90000);
        Corporate_Employee employee11=new Corporate_Employee("IBM","Nancy",11,78555);
        Corporate_Employee employee12=new Corporate_Employee("IBM","Kishori",12,70000);
        Corporate_Employee employee13=new Corporate_Employee("IBM","Khushabu",13,45000);
        Corporate_Employee employee14=new Corporate_Employee("IBM","Tanya",14,35000);
        Corporate_Employee employee15=new Corporate_Employee("IBM","kapil",15,25000);
        Corporate_Employee employee16=new Corporate_Employee("IBM","Viru",16,85000);
        Corporate_Employee employee17=new Corporate_Employee("IBM","Vinay",17,20000);
        Corporate_Employee employee18=new Corporate_Employee("IBM","Prem",18,35000);
        Corporate_Employee employee19=new Corporate_Employee("IBM","Pratik",19,54445);
        Corporate_Employee employee20=new Corporate_Employee("IBM","Shultan",20,35500);

        Corporate_Employee employee21=new Corporate_Employee("TCS","Mahak",21,35550);
        Corporate_Employee employee22=new Corporate_Employee("TCS","Kalu",22,45250);
        Corporate_Employee employee23=new Corporate_Employee("TCS","Pitam",23,65500);
        Corporate_Employee employee24=new Corporate_Employee("TCS","Sanam",24,45080);
        Corporate_Employee employee25=new Corporate_Employee("TCS","Ritu",25,86550);
        Corporate_Employee employee26=new Corporate_Employee("TCS","Sultan",26,52000);
        Corporate_Employee employee27=new Corporate_Employee("TCS","Tarun",27,52500);
        Corporate_Employee employee28=new Corporate_Employee("TCS","Deepak",28,36500);
        Corporate_Employee employee29=new Corporate_Employee("TCS","Lokesh",29,41000);
        Corporate_Employee employee30=new Corporate_Employee("TCS","Karan",30,93000);

        Corporate_Employee employee31=new Corporate_Employee("Infosys","Aman",31,55000);
        Corporate_Employee employee32=new Corporate_Employee("Infosys","Virendra",32,65000);
        Corporate_Employee employee33=new Corporate_Employee("Infosys","Anil",33,30000);
        Corporate_Employee employee34=new Corporate_Employee("Infosys","Anand",34,55000);
        Corporate_Employee employee35=new Corporate_Employee("Infosys","Brajmohan",35,65000);
        Corporate_Employee employee36=new Corporate_Employee("Infosys","Anita",36,26000);
        Corporate_Employee employee37=new Corporate_Employee("Infosys","Manavi",37,65000);
        Corporate_Employee employee38=new Corporate_Employee("Infosys","Shivani",38,30000);
        Corporate_Employee employee39=new Corporate_Employee("Infosys","Gopal",39,35000);
        Corporate_Employee employee40=new Corporate_Employee("Infosys","Akbar",40,25000);

         //    ::::::::::::::::::              ::::::::::::::::::                      :::::::::::::::::::::              ::::::::::::::::

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
        IBMCompany.add(employee11);
        IBMCompany.add(employee12);
        IBMCompany.add(employee13);
        IBMCompany.add(employee14);
        IBMCompany.add(employee15);
        IBMCompany.add(employee16);
        IBMCompany.add(employee17);
        IBMCompany.add(employee18);
        IBMCompany.add(employee19);
        IBMCompany.add(employee20);

        TCSCompany.add(employee21);
        TCSCompany.add(employee22);
        TCSCompany.add(employee23);
        TCSCompany.add(employee24);
        TCSCompany.add(employee25);
        TCSCompany.add(employee26);
        TCSCompany.add(employee27);
        TCSCompany.add(employee28);
        TCSCompany.add(employee29);
        TCSCompany.add(employee30);

        INFOSYSCompany.add(employee31);
        INFOSYSCompany.add(employee32);
        INFOSYSCompany.add(employee33);
        INFOSYSCompany.add(employee34);
        INFOSYSCompany.add(employee35);
        INFOSYSCompany.add(employee36);
        INFOSYSCompany.add(employee37);
        INFOSYSCompany.add(employee38);
        INFOSYSCompany.add(employee39);
        INFOSYSCompany.add(employee40);

        EmployeeArraylistHashMap.put("IBM",IBMCompany);
        EmployeeArraylistHashMap.put("TCS",TCSCompany);
        EmployeeArraylistHashMap.put("Infosys",INFOSYSCompany);

        for (String var : EmployeeArraylistHashMap .keySet()) {

            if (var.equals("IBM")) {
                ArrayList<Corporate_Employee>IBMCom = EmployeeArraylistHashMap.get(var);

             for (Corporate_Employee emp :IBMCom){
                 System.out.println("Printing IMB employee list "+ emp.getCompanyName()+" "+emp.getEmployeeName()+" "+emp.getEmployeeId()+" "+emp.getSalary());


             }
                }


            }

    }




}
