package collection.Hash_Map;

import java.util.HashMap;

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
    }

    public static void main(String[] args) {
        HashMap_Project obj=new HashMap_Project();
        obj.createHashMap();
    }
}
