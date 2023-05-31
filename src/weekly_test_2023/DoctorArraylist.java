package weekly_test_2023;

import model.Doctor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DoctorArraylist {
    public Doctor addData(){

        // use scanner class and create obj
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter Doctor's id:");
        int id=scanner.nextInt();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("Please enter Doctor name  :");

        String name= scanner1.nextLine();

        System.out.println("Please enter Doctor dept  :");
        String dept= scanner1.nextLine();

        Doctor doctor= new Doctor(id,name,dept);

        return doctor;
    }
    public ArrayList<Doctor> createDoctorArraylist(){

        ArrayList<Doctor> doctorArrayList=new ArrayList<>();// create arraylist  OBJ and declare datatype

        Doctor doctor1=addData();
        Doctor doctor2=addData();
        Doctor doctor3=addData();

        doctorArrayList.add(doctor1);
        doctorArrayList.add(doctor2);
        doctorArrayList.add(doctor3);
        return doctorArrayList;

        }
    public static void main(String[] args) {
        DoctorArraylist obj=new DoctorArraylist(); // create class object
        ArrayList<Doctor> doctor =obj.createDoctorArraylist(); // call doctor arraylist

//        for (int i=0; i<doctor.size();i++){
//            System.out.println(doctor.get(i).getId() + " name: "+doctor.get(i).getName() + " department "+doctor.get(i).getDept());
//        }

        // applying for each loop and printing only surgeon dept details
        for ( Doctor var:doctor){
            if (var.getDept().equals("SURGEON")){
                System.out.println("print only surgeon dept details : "+var.getId()+ " name " +var.getName()+ " department " +var.getDept());
            }
        }
    }
}
