package collection;

import model.Doctor;

import java.util.ArrayList;

public class Doctor_ArrayList {
    public ArrayList<Doctor> doctor_list(){
        ArrayList<Doctor> doctor_detail=new ArrayList<>();

        //creating data using doctor class from model
        Doctor doctor1= new Doctor(1124,"ALOK","NEUROLOGIST");
        Doctor doctor2= new Doctor(1456,"ROHAN","DERMATOLOGIST");
        Doctor doctor3=new Doctor(4768,"ASHOK","CARDIOLOGIST");
        Doctor doctor4=new Doctor(4759,"ATUL", "SURGEON");

        //adding data in list
        doctor_detail.add(doctor1);
        doctor_detail.add(doctor2);
        doctor_detail.add(doctor3);
        doctor_detail.add(doctor4);
        return doctor_detail;

    }

    public static void main(String[] args) {
        Doctor_ArrayList obj=new Doctor_ArrayList();

        //printing with advance loop
        for(Doctor var:obj.doctor_list()){
            System.out.println("PRINTING WITH ADVANCE LOOP\n"+"NAME : "+var.getName()+"\nID : "+var.getId() +"\nSPECILAITY : "+var.getSpeciality()+"\n");
        }

        //printing with for loop
        for(int i=0;i<obj.doctor_list().size();i++){
            System.out.println("\nPRINTING WITH FOR LOOP\n"+"NAME : "+obj.doctor_list().get(i).getName()+"\nID : "+obj.doctor_list().get(i).getId()+"\nSPECIALITY : "+obj.doctor_list().get(i).getSpeciality());
        }

        //printing with while loop
        int i=0;
        while(i<obj.doctor_list().size()){
            System.out.println("\nPRINTING WITH WHILE LOOP\n"+"NAME : "+obj.doctor_list().get(i).getName()+"\nID : "+obj.doctor_list().get(i).getId()+"\nSPECIALITY : "+obj.doctor_list().get(i).getSpeciality());
            i++;
        }

    }
}
