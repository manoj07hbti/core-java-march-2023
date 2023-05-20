package collection;

import jdk.nashorn.internal.runtime.ScriptRuntime;
import model.Student;

import java.util.HashSet;

public class Student_HashSet {
    public void createStudentSet(){
        HashSet<Student> student=new HashSet<Student>();

        Student student1=new Student(55,"ABHINAV","B");
        System.out.println("hashcode of student1 : "+student1.hashCode());

        Student student2=new Student(36,"RAHUL","A");
        System.out.println("hashcode of student2 : "+student2.hashCode());

        Student student3=new Student(55,"AMAN","B");
        System.out.println("hashcode of student3 : "+student3.hashCode());

        Student student4=new Student(36,"RAHUL","A");
        System.out.println("hashcode of student4 : "+student4.hashCode());

        Student student5=new Student(55,"AMAN","B");
        System.out.println("hashcode of student5 : "+student5.hashCode());

        Student student6=new Student(55,"ABHINAV","B");
        System.out.println("hashcode of student6 : "+student6.hashCode());

        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        student.add(student1);
        student.add(student6);

        for(Student var: student){
            System.out.println("\nROLL NO : "+var.getRoll_no()+" NAME : "+var.getName()+" SECTION : "+var.getSection());
        }

        //for removing duplicacy or for own implementation hashcode and equals used in model
    }

    public static void main(String[] args) {
        Student_HashSet obj=new Student_HashSet();
        obj.createStudentSet();

    }
}
