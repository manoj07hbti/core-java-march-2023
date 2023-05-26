package collection.hashMap;

import model.Student;

import java.util.HashMap;
import java.util.Set;

public class StudentHashMap {
    public HashMap<String,Student> createStudentHashmap(){
        HashMap<String,Student> studentHashMap=new HashMap<>();

        Student student1=new Student(1,"AMAN","A");
        Student student2=new Student(2,"ABHISHEK","B");
        Student student3=new Student(3,"ROHAN","C");
        Student student4=new Student(4,"RAHUL","D");

        studentHashMap.put("JNU",student1);
        studentHashMap.put("IP",student2);
        studentHashMap.put("DU",student3);
        studentHashMap.put("LPU",student4);


        return studentHashMap;
    }

    public static void main(String[] args) {
        StudentHashMap obj=new StudentHashMap();
        HashMap<String,Student> studentHashMap= obj.createStudentHashmap();

        for(String var:studentHashMap.keySet()){

            if(var.equals("LPU")){
            System.out.println("PRINTING LPU STUDENT DATA");
            System.out.println(studentHashMap.get(var).getRoll_no()+" "+studentHashMap.get(var).getName()+" "+studentHashMap.get(var).getSection());

        }

    }
    }
}

