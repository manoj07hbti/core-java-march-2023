package collection_demo;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public  ArrayList<Student> createStudentList(){

   // CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<Student> students= new ArrayList<>();

        // create data using model class with param constructor

        Student student1= new Student(1,"Raj","CS");
        Student student2= new Student(2,"Mukesh","IT");
        Student student3= new Student(3,"Rohit","CS");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        return students;
    }

    public static void main(String[] args) {
        StudentArrayList obj= new StudentArrayList();
        for (Student var :obj.createStudentList()){

            System.out.println("printing Student "+var.getName() +" Roll no "+var.getRoll_no()+" Section: "+var.getSection());

        }
    }
}
