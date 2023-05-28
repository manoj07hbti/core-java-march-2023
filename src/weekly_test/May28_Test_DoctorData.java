package weekly_test;
import model.Specialist_Doctors;
import model.Test_DoctorList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class May28_Test_DoctorData {
    public Test_DoctorList enterData(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("PLEASE ENTER DOCTOR ID");
        int id=scanner.nextInt();

        Scanner scanner1=new Scanner(System.in);
        System.out.println("PLEASE ENTER DOCTOR NAME");
        String name=scanner1.nextLine();

        Scanner scanner2=new Scanner(System.in);
        System.out.println("PLEASE ENTER DOCTOR SPECIALISATION");
        String speciality= scanner2.nextLine();

        Scanner scanner3=new Scanner(System.in);
        System.out.println("ENTER THE POST OF DOCTOR");
        String post=scanner3.nextLine();

        Test_DoctorList doctor=new Test_DoctorList(id,name,speciality,post);
        return doctor;
    }

    public ArrayList<Test_DoctorList> createDoctorList(){

        ArrayList<Test_DoctorList> doctorArrayList= new ArrayList<>();

        Test_DoctorList doc1 = enterData();
        Test_DoctorList doc2 = enterData();
        Test_DoctorList doc3 = enterData();
        Test_DoctorList doc4 = enterData();

        doctorArrayList.add(doc1);
        doctorArrayList.add(doc2);
        doctorArrayList.add(doc3);
        doctorArrayList.add(doc4);



        return doctorArrayList;
    }

    public static void main(String[] args) {
        May28_Test_DoctorData obj=new May28_Test_DoctorData();
        ArrayList<Test_DoctorList> doctorList=obj.createDoctorList();

        HashMap<String, ArrayList<Test_DoctorList>> surgeon_list=new HashMap<>();
        surgeon_list.put("SURGEON",doctorList);

        for(String var: surgeon_list.keySet()){
            if(var.equals("SURGEON")){
                for(Test_DoctorList surgeon_doc:doctorList){
                    if(surgeon_doc.getPost().equals("surgeon")||surgeon_doc.getPost().equals("SURGEON")){
                        System.out.println("\nSURGEONS"+"\nID : "+surgeon_doc.getId()+"\nNAME: "+surgeon_doc.getName()+"\nSPECIALITY : "+surgeon_doc.getSpeciality()+"\nPOST : "+surgeon_doc.getPost());

                    }
                }
            }
        }
    }
}
