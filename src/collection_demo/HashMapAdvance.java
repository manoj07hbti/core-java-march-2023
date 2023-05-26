package collection_demo;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAdvance {

    public static void main(String[] args) {

        // create HashMap which will store colleges data

        HashMap<String, ArrayList<Student>> stringArrayListHashMap = new HashMap<>();

        // we need create data for multiple college
        ArrayList<Student> agraClgStudents = new ArrayList<>();
        ArrayList<Student> jnuClgStudents = new ArrayList<>();
        ArrayList<Student> rbsClgStudents = new ArrayList<>();

        Student student1 = new Student(1, "Raj", "CS");
        Student student2 = new Student(2, "Mukesh", "IT");
        Student student3 = new Student(3, "Rohit", "CS");

        Student student4 = new Student(1, "Rajesh", "CS");
        Student student5 = new Student(2, "Mohit", "IT");
        Student student6 = new Student(3, "Rakesh", "CS");

        Student student7 = new Student(1, "Rahul", "CS");
        Student student8 = new Student(2, "Munesh", "IT");
        Student student9 = new Student(3, "Vijay", "CS");

        agraClgStudents.add(student1);
        agraClgStudents.add(student2);
        agraClgStudents.add(student3);

        jnuClgStudents.add(student4);
        jnuClgStudents.add(student5);
        jnuClgStudents.add(student6);

        rbsClgStudents.add(student7);
        rbsClgStudents.add(student8);
        rbsClgStudents.add(student9);

        stringArrayListHashMap.put("AGRA COLLEGE", agraClgStudents);
        stringArrayListHashMap.put("JNU", jnuClgStudents);
        stringArrayListHashMap.put("RBS", rbsClgStudents);


        for (String var : stringArrayListHashMap.keySet()) {

            if (var.equals("AGRA COLLEGE")) {
                ArrayList<Student> studentArrayList = stringArrayListHashMap.get(var);

                for (Student std : studentArrayList) {

                    if (std.getSection().equals("CS")) {
                        System.out.println("Printing AGRA Admission List: " + std.getName() + " " + std.getRoll_no() + " " + std.getSection());

                    }
                }


            }
            if (var.equals("JNU")) {


                for (Student std :  stringArrayListHashMap.get(var)) {

                    System.out.println("Printing JNU Admission List: " + std.getName() + " " + std.getRoll_no() + " " + std.getSection());
                }


            }

        }


    }
}
