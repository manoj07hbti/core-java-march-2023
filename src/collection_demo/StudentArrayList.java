package collection_demo;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public  ArrayList<Student> createStudentList(){

   // CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<Student> studentList= new ArrayList<>();

        // create data using model class with param constructor

        Student student1= new Student(1,"Raj","CS");
        Student student2= new Student(2,"Mukesh","IT");
        Student student3= new Student(3,"Rohit","CS");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        return studentList;
    }

    public static void main(String[] args) {
        StudentArrayList obj= new StudentArrayList();

        for (int i=0; i<obj.createStudentList().size(); i++){

            System.out.println("Using for loop :"+obj.createStudentList().get(i).getName());
        }

        for (Student var :obj.createStudentList()){

            System.out.println("printing Student "+var.getName() +" Roll no "+var.getRoll_no()+" Section: "+var.getSection());

        }
    }
}
