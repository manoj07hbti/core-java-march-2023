package collection.Hash_Map;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Project2 {
    public void createHashMap(){
        //Creating Object=======================

        HashMap<Double,String> student=new HashMap<>();

        //Adding value:- Integer & String  ==========================
        student.put(1.0,"Raman");
        student.put(2.0,"Ritu");
        student.put(3.0,"Rishabh");

        //Printing value:- Integer & String  ==========================
        System.out.println("Printing Hashmap Data:- "+student.get(2.0));

        //Applying Advance for loop in HashMap Important======================

        Set<Double> keys=student.keySet();
        for (Double var:keys){
            System.out.println("Printing Advance Loop Hashmap List:- "+student.get(var));
        }

        //Remove method using to remove data from list=================
        student.remove(2.0);
        for (Double var:keys){
            System.out.println("After remove Printing Hashmap List:- "+student.get(var));
        }
    }

    public static void main(String[] args) {
        HashMap_Project2 obj=new HashMap_Project2();
        obj.createHashMap();
    }
}
