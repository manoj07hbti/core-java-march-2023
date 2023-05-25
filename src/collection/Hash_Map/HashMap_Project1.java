package collection.Hash_Map;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Project1 {
    public void createHashMap(){
        //Creating Object=======================

        HashMap<String,String> student=new HashMap<>();

        //Adding value:- Integer & String  ==========================
        student.put("JNU","Ravi");
        student.put("BHU","Mahesh");
        student.put("PSIT","Nitesh");

        //Printing value:- Integer & String  ==========================
        System.out.println("Printing Hashmap Data:- "+student.get("JNU"));

        //Applying Advance for loop in HashMap Important======================

        Set<String> keys=student.keySet();
        for (String var:keys){
            System.out.println("Printing Advance Loop Hashmap List:- "+student.get(var));
        }

        //Remove method using to remove data from list=================
        student.remove("JNU");
        for (String var:keys){
            System.out.println("After remove Printing Hashmap List:- "+student.get(var));
        }
    }

    public static void main(String[] args) {
        HashMap_Project1 obj=new HashMap_Project1();
        obj.createHashMap();
    }
}
