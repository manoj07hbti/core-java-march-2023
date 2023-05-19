package collection.Hashset;

import java.util.HashSet;

public class Hashset_Project {
    // Hash set use for auto filter duplicate data from our code==============================
    // Example- We are Create Duplicate Data But Hash Set auto filter Duplicate Data==========================

    //Project:- create hashset of String , INteger and Double and print Advanced loop
    public void stringData(){
        HashSet<String>studentName=new HashSet<>();
        studentName.add("Rohit");
        studentName.add("Ritesh");
        studentName.add("Rohit");
        studentName.add("Ritesh");
        System.out.println("Data Size:- "+studentName.size());

        for (String var:studentName){
            System.out.println("Name:- "+var);
        }
    }

    public void integerData(){
       HashSet<Integer>rollNumber=new HashSet<>();
       rollNumber.add(12);
       rollNumber.add(15);
        rollNumber.add(12);
        rollNumber.add(15);
        System.out.println("Data Size:- "+rollNumber.size());
       for (Integer var:rollNumber){
           System.out.println("Roll No:- "+var);
       }
    }

    public void doubleData(){
        HashSet<Double>percentage=new HashSet<>();
        percentage.add(78.23);
        percentage.add(88.32);
        percentage.add(78.23);
        percentage.add(88.32);
        System.out.println("Data Size:- "+percentage.size());
        for (Double var:percentage){
            System.out.println("Percentage:- "+var);
        }
    }

    public static void main(String[] args) {
        Hashset_Project obj=new Hashset_Project();
        obj.stringData();
        obj.integerData();
        obj.doubleData();
    }
}
