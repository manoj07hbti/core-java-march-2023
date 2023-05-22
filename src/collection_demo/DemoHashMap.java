package collection_demo;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public void createHashMap(){
        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap<Integer,String> course= new HashMap<>();
        //adding value :  map.put(key,value);

        course.put(1,"Java");
        course.put(2,"Java 8");
        course.put(3,"Spring");
        course.put(4,"Spring boot");
        course.put(3,"Microservices");
        course.put(null,"Devops");

        // reading value from course : map.get(KEY);

        System.out.println("Printing Map Data "+course.get(1));

        // how to iterate or traverse hashMap  map.keySet();

        Set<Integer> keys=  course.keySet();

        for(Integer var: keys){

            System.out.println("Printing Map using loop : "+course.get(var));
        }

        // map.remove(key);
        course.remove(2);
        for(Integer var: keys){

            System.out.println("After remove Printing Map using loop : "+course.get(var));
        }


    }

    public static void main(String[] args) {
        DemoHashMap obj= new DemoHashMap();
        obj.createHashMap();
    }
}
