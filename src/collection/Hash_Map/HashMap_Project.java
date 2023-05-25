package collection.Hash_Map;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Project {

    public void createHashMap(){
        //Creating Object=======================

        HashMap<Integer,String> student=new HashMap<>();

        //Adding value:- Integer & String  ==========================
        student.put(1,"Rohit");
        student.put(2,"Rahul");
        student.put(3,"Ritesh");

        //Printing value:- Integer & String  ==========================
        System.out.println("Printing Hashmap Data:- "+student.get(2));

        //Applying Advance for loop in HashMap Important======================

        Set<Integer> keys=student.keySet();
        for (Integer var:keys){
            System.out.println("Printing Advance Loop Hashmap List:- "+student.get(var));
        }

        //Remove method using to remove data from list=================
        student.remove(2);
        for (Integer var:keys){
            System.out.println("After remove Printing Hashmap List:- "+student.get(var));
        }
    }

    public static void main(String[] args) {
        HashMap_Project obj=new HashMap_Project();
        obj.createHashMap();
    }
}
