package collection_demo;

import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public void createStudentSet(){

        HashSet<Student> students= new HashSet<>();

        // create data of student :
        Student student1= new Student(1,"Raj","CS");

        System.out.println("Hashcode of student1: "+student1.hashCode());

        Student student2= new Student(2,"Mukesh","IT");
        System.out.println("Hashcode of student2: "+student2.hashCode());

        Student student3= new Student(3,"Rohit","CS");
        System.out.println("Hashcode of student3: "+student3.hashCode());

        Student student5= new Student(1,"Raj","CS");
        System.out.println("Hashcode of student5: "+student5.hashCode());

        Student student4= new Student(2,"Mukesh","IT");
        System.out.println("Hashcode of student4: "+student4.hashCode());


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for(Student var : students){

            System.out.println("Printing Student : "+var.getName()+" Roll no "+var.getRoll_no() +" Section "+var.getSection());
        }


    }
    public static void main(String[] args) {

        StudentHashSet obj= new StudentHashSet();
        obj.createStudentSet();

    }
}
