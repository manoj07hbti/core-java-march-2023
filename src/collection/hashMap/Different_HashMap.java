package collection.hashMap;

import java.util.HashMap;
import java.util.Set;

public class Different_HashMap {

    //hashmap of integer key and string value
    public HashMap<Integer,String> IntegerStringHashmap(){
        //create a hashMap of integer key and String value
        HashMap<Integer,String> studentRollNo=new HashMap<>();

        //adding integer key with string value
        studentRollNo.put(1,"GAURAV");
        studentRollNo.put(2,"AMIT");
        studentRollNo.put(3,"AMAN");
        studentRollNo.put(4,"ROHIT");

        System.out.println("PRINTING THE INDIVIDUAL DATA BY KEY : " +studentRollNo.get(3));

        Set<Integer> key=studentRollNo.keySet();

        System.out.println("printing the integer key and string value data  ");
        for(Integer var:key){
            System.out.println( var +" " +studentRollNo.get(var));
        }
        return studentRollNo;
    }

    //hashmap of string key and string  value
    public  HashMap<String, String> StringKeyStringValue() {
        //create a hashMap of string key and String value

        HashMap<String, String> studentWithCourse = new HashMap<>();

        studentWithCourse.put("gaurav", "java");
        studentWithCourse.put("vinay", "c++");
        studentWithCourse.put("aman", "dbms");

        System.out.println("\n"+"PRINTING THE INDIVIDUAL DATA BY KEY : "+" aman" + studentWithCourse.get("aman"));

        System.out.println("\n" + "PRINTING THE INDIVIDUAL DATA BY String KEY : "+" vinay" + studentWithCourse.get("vinay"));

        //method 1 to print store the original key into key variable then in for each loop store the key variblbe into var
        Set<String> key = studentWithCourse.keySet();

        for (String var : key) {
            System.out.println(var + " " + studentWithCourse.get(var));
        }
        return studentWithCourse;
    }

    //hashmap of double key and string value
    public HashMap<Double,String> DoubleKeyStringValue(){
        HashMap<Double,String> percentage=new HashMap<>();

        percentage.put(33.00,"MATHS");
        percentage.put(40.00,"SCIENCE");
        percentage.put(45.00,"ENGLISH");
        percentage.put(48.00,"SOCIAL SCIENCE");
        percentage.put(35.00,"HINDI");


        System.out.println("PRINTING DOUBLE KEY AND STRING VALUE DATA");

        // method 2 to print directly store the key into var the use the in for each loop
        for(Double var:percentage.keySet()){
            System.out.println(var +" "+percentage.get(var));
        }
        return percentage;
    }

    public static void main(String[] args) {
        Different_HashMap obj=new Different_HashMap();
        obj.IntegerStringHashmap();
        obj.StringKeyStringValue();
        obj.DoubleKeyStringValue();
    }
}
