package collection;

import model.Student;

import java.util.ArrayList;

public class Student_ArrayList {


    public ArrayList<Student> student_list(){    //created method

        // CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<Student> student_details=new ArrayList<>();

        //create data using Student class imported from model
        Student student1=new Student(23,"RAHUL","A");
        Student student2=new Student(24,"AMAN","B");
        Student student3=new Student(55,"ROHAN","C");
        Student student4=new Student(5,"ASHOK","D");

        //adding the data in list
        student_details.add(student1);
        student_details.add(student2);
        student_details.add(student3);
        student_details.add(student4);

        return student_details;
    }
    public static void main(String[] args) {
        Student_ArrayList obj = new Student_ArrayList();

        //advance loop for printing
        for (Student var : obj.student_list()) {
            System.out.println("\nprinting student data\n" + "NAME : " + var.getName() + "\nROLL NO : " + var.getRoll_no() + "\nSECTION : " + var.getSection());
        }

        //printing with for loop
         for(int i=0; i < obj.student_list().size();i++){
             System.out.println("\nNAME : " +obj.student_list().get(i).getName() +"\nROLL NO : "+obj.student_list().get(i).getRoll_no()+"\nSECTION : "+obj.student_list().get(i).getSection());
         }

         //printing with while loop
        int i=0;
         while(i<obj.student_list().size()){
             System.out.println("\nNAME : " +obj.student_list().get(i).getName() +"\nROLL NO : "+obj.student_list().get(i).getRoll_no()+"\nSECTION : "+obj.student_list().get(i).getSection());
             i++;
         }

    }
}
