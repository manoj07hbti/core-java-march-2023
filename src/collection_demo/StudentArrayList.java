package collection_demo;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {

    public Student enterData(){

        Scanner scanner= new Scanner(System.in);
        // create data using model class with param constructor

        System.out.println("Please enter student roll number :");
        int roll_no=scanner.nextInt();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("Please enter student name  :");

        String name= scanner1.nextLine();

        System.out.println("Please enter student Section  :");
        String section= scanner1.nextLine();

        Student student= new Student(roll_no,name,section);

        return student;

    }

    public  ArrayList<Student> createStudentList(){

   // CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<Student> studentList= new ArrayList<>();

        Student student1= enterData();
        Student student2= enterData();
        Student student3= enterData();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        return studentList;
    }

    public static void main(String[] args) {
        StudentArrayList obj= new StudentArrayList();

       ArrayList<Student> students=obj.createStudentList();
        for (int i=0; i<students.size(); i++){

            System.out.println("Using for loop :"+students.get(i).getName());
        }

        for (Student var :students){

            System.out.println("printing Student "+var.getName() +" Roll no "+var.getRoll_no()+" Section: "+var.getSection());

        }
    }
}
