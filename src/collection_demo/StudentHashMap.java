package collection_demo;

import model.Student;

import java.util.HashMap;

public class StudentHashMap {

    public HashMap <String, Student> createStudentMap(){
         //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap <String, Student> studentHashMap= new HashMap<>();

        //create data of Student
        Student student1= new Student(1,"Raj","CS");
        Student student2= new Student(2,"Mukesh","IT");
        Student student3= new Student(3,"Rohit","CS");

        studentHashMap.put("JNU",student1);
        studentHashMap.put("AGRA COLLEGE",student2);
        studentHashMap.put("RBS COLLEGE",student3);

        return studentHashMap;
    }

    public static void main(String[] args) {
        StudentHashMap obj= new StudentHashMap();
        HashMap <String, Student> studentHashMap= obj.createStudentMap();

        for( String var: studentHashMap.keySet()){

            if(var.equals("JNU")){
                System.out.println("Printing JNU Students:");
                System.out.println(studentHashMap.get(var).getName()+" "+studentHashMap.get(var).getRoll_no()+" "+studentHashMap.get(var).getSection());
            }
        }
    }
}
