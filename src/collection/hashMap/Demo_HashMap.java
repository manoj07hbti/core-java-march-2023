package collection.hashMap;

import java.util.HashMap;
import java.util.Set;

public class Demo_HashMap {
    public void createHashMap(){

        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();
        HashMap<Integer,String> course=new HashMap<>();

        //adding value :  map.put(key,value);
        course.put(1,"JAVA");
        course.put(2,"PYTHON");
        course.put(3,"C LANGUAGE");
        course.put(4,"C++");
        course.put(5,"HTML");
        course.put(6,"CSS");
        course.put(7,"SPRING");
        course.put(8,"SPRING BOOT");
        course.put(9,"MICROSERVICES");
        course.put(10,"BOOT STRAP");
        course.put(null,"VISUAL BASIC");


        // reading value from course : map.get(KEY);
        System.out.println("Printing map data : " +course.get(5));

        // how to iterate or traverse hashMap  map.keySet();

        Set<Integer> keys = course.keySet();

        for(Integer var: keys){
            System.out.println("PRINTING USING ADVANCE LOOP " +var +" " +course.get(var));
        }

        // for remove map.remove();
        course.remove(8);

        System.out.println("\n");
        for(Integer var: keys){

            System.out.println("PRINTING MAP DATA AFTER REMOVING : " +var +" " +course.get(var));
        }
    }
    public static void main (String[] args){
        Demo_HashMap obj=new Demo_HashMap();
        obj.createHashMap();
    }
}
