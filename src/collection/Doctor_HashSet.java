package collection;

import model.Doctor;

import java.util.HashSet;

public class Doctor_HashSet {
    public void createDoctorHashSet(){
        HashSet<Doctor> DoctorSet= new HashSet<>();
        //creating data using doctor class from model
        Doctor doctor1= new Doctor(1124,"ALOK","NEUROLOGIST");
        Doctor doctor2= new Doctor(1456,"ROHAN","DERMATOLOGIST");
        Doctor doctor3=new Doctor(4768,"ASHOK","CARDIOLOGIST");
        Doctor doctor4=new Doctor(4759,"ATUL", "SURGEON");
        Doctor doctor5= new Doctor(1124,"ALOK","NEUROLOGIST");
        Doctor doctor6= new Doctor(1456,"ROHAN","DERMATOLOGIST");
        Doctor doctor7=new Doctor(4768,"ASHOK","CARDIOLOGIST");
        Doctor doctor8=new Doctor(4759,"ATUL", "SURGEON");

        //adding data in list
        DoctorSet.add(doctor1);
        DoctorSet.add(doctor2);
        DoctorSet.add(doctor3);
        DoctorSet.add(doctor4);
        DoctorSet.add(doctor5);
        DoctorSet.add(doctor6);
        DoctorSet.add(doctor7);
        DoctorSet.add(doctor8);

        for(Doctor var:DoctorSet){
            System.out.println(" ID : "+var.getId() +" NAME : "+var.getName()+" SPECIALITY : "+var.getSpeciality());
        }

        //for removing duplicacy or for own implementation hashcode and equals used in model
    }

    public static void main(String[] args) {
        Doctor_HashSet obj=new Doctor_HashSet();
        obj.createDoctorHashSet();
    }
}
