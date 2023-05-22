package collection_demo;

import model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class StudentHashSet {

    public void createStudentSet(){

        HashSet<Student> students= new HashSet<>();

        LinkedHashSet <Student> studentLinkedHashSet= new LinkedHashSet<>();
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

        studentLinkedHashSet.add(student1);
        studentLinkedHashSet.add(student2);
        studentLinkedHashSet.add(student3);
        studentLinkedHashSet.add(student1);
        studentLinkedHashSet.add(student2);
        studentLinkedHashSet.add(student3);

        for(Student var: studentLinkedHashSet){

            System.out.println("Printing LinkedHashSet  : "+var.getName()+" Roll no "+var.getRoll_no() +" Section "+var.getSection());

        }

        for(Student var : students){

            System.out.println("Printing Student : "+var.getName()+" Roll no "+var.getRoll_no() +" Section "+var.getSection());
        }


    }
    public static void main(String[] args) {

        StudentHashSet obj= new StudentHashSet();
        obj.createStudentSet();

    }
}
