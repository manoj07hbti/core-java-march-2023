package collection_demo;

import model.EmployeeData;

import java.util.ArrayList;
import java.util.HashMap;

public class MyEmployeeHashMap {
    public static void main(String[] args) {
        // create HashMap which will store employee data
        HashMap<String, ArrayList<EmployeeData >> stringArrayListHashMap = new HashMap<>();
        // we need create data for multiple employee
        ArrayList<EmployeeData> ibmEmployees=new ArrayList<>();
        ArrayList<EmployeeData> tcsEmployees=new ArrayList<>();
        ArrayList<EmployeeData> imfEmployees=new ArrayList<>();

        EmployeeData employeeData1=new EmployeeData(1, "Rajesh",30000);
        EmployeeData employeeData2=new EmployeeData(2, "Raul", 60000);
        EmployeeData employeeData3=new EmployeeData(3 ,"Pratap", 55000);
        EmployeeData employeeData4=new EmployeeData(4, "Gaurav", 40000);
        EmployeeData employeeData5=new EmployeeData(5 ,"mukesh", 65000);
        EmployeeData employeeData6=new EmployeeData(6 , "Omi", 64000);
        EmployeeData employeeData7=new EmployeeData(7 , "vivek", 70000);
        EmployeeData employeeData8=new EmployeeData(8, "Kumar", 34000);
        EmployeeData employeeData9=new EmployeeData(9, "Lalit", 25000);
        EmployeeData employeeData10=new EmployeeData(10 ,"Govind",44000);

        EmployeeData employeeData11=new EmployeeData(1, "Raju",30000);
        EmployeeData employeeData12=new EmployeeData(2, "komal", 60000);
        EmployeeData employeeData13=new EmployeeData(3 ,"Pramod", 55000);
        EmployeeData employeeData14=new EmployeeData(4, "Gargi", 40000);
        EmployeeData employeeData15=new EmployeeData(5 ,"Monu", 65000);
        EmployeeData employeeData16=new EmployeeData(6 , "omkar", 64000);
        EmployeeData employeeData17=new EmployeeData(7 , "vikesh", 70000);
        EmployeeData employeeData18=new EmployeeData(8, "kamini", 34000);
        EmployeeData employeeData19=new EmployeeData(9, "lala", 25000);
        EmployeeData employeeData20=new EmployeeData(10 ,"geeta",44000);

        EmployeeData employeeData21=new EmployeeData(1, "Rudra",30000);
        EmployeeData employeeData22=new EmployeeData(2, "Ramkesh", 60000);
        EmployeeData employeeData23=new EmployeeData(3 ,"Pati", 55000);
        EmployeeData employeeData24=new EmployeeData(4, "Garmi", 40000);
        EmployeeData employeeData25=new EmployeeData(5 ,"Moahan", 65000);
        EmployeeData employeeData26=new EmployeeData(6 , "o.p", 64000);
        EmployeeData employeeData27=new EmployeeData(7 , "Vinesh", 70000);
        EmployeeData employeeData28=new EmployeeData(8, "Kartar", 34000);
        EmployeeData employeeData29=new EmployeeData(9, "Love kush", 25000);
        EmployeeData employeeData30=new EmployeeData(10 ,"God",44000);

        ibmEmployees.add(employeeData1);
        ibmEmployees.add(employeeData2);
        ibmEmployees.add(employeeData3);
        ibmEmployees.add(employeeData4);
        ibmEmployees.add(employeeData5);
        ibmEmployees.add(employeeData6);
        ibmEmployees.add(employeeData7);
        ibmEmployees.add(employeeData8);
        ibmEmployees.add(employeeData9);
        ibmEmployees.add(employeeData10);


        tcsEmployees.add(employeeData11);
        tcsEmployees.add(employeeData12);
        tcsEmployees.add(employeeData13);
        tcsEmployees.add(employeeData14);
        tcsEmployees.add(employeeData15);
        tcsEmployees.add(employeeData16);
        tcsEmployees.add(employeeData17);
        tcsEmployees.add(employeeData18);
        tcsEmployees.add(employeeData19);
        tcsEmployees.add(employeeData20);

        imfEmployees.add(employeeData21);
        imfEmployees.add(employeeData22);
        imfEmployees.add(employeeData23);
        imfEmployees.add(employeeData24);
        imfEmployees.add(employeeData25);
        imfEmployees.add(employeeData26);
        imfEmployees.add(employeeData27);
        imfEmployees.add(employeeData28);
        imfEmployees.add(employeeData29);
        imfEmployees.add(employeeData30);

        stringArrayListHashMap.put("IBM",ibmEmployees);
        stringArrayListHashMap.put("TCS",tcsEmployees);
        stringArrayListHashMap.put("IMF",imfEmployees);

        for (String var : stringArrayListHashMap.keySet()){
            if(var.equals("IBM")){
                ArrayList<EmployeeData> ibm =stringArrayListHashMap.get(var);
                for(EmployeeData emp:ibm){
                    System.out.println("printing IBM Data id no:"+emp.getId()+" "+emp.getName()+" "+emp.getSalary());
                }
            }
        }
    }

 }
