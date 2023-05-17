package collection_demo;

import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public void createStudentSet(){

        HashSet<Student> students= new HashSet<>();

        // create data of student :
        Student student1= new Student(1,"Raj","CS");
        Student student2= new Student(2,"Mukesh","IT");
        Student student3= new Student(3,"Rohit","CS");
        Student student5= new Student(1,"Raj","CS");
        Student student4= new Student(2,"Mukesh","IT");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for(Student var : students){

            System.out.println("Printing Student : "+var.getName()+" Roll no "+var.getRoll_no() +" Section"+var.getSection());
        }


    }
    public static void main(String[] args) {

        StudentHashSet obj= new StudentHashSet();
        obj.createStudentSet();

    }
}
