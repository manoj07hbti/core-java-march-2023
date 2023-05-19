package collection.Generics_Project;

import java.util.ArrayList;

public class Employee_Arraylist_Genrics {
    //create String List , integer List, Double list , add remove method also=====================
    // Employee list and print it using for loop, while loop and advanced loop==================


    public ArrayList<String> stringArraylist() {
        ArrayList<String> stringArraylist = new ArrayList<>();
        stringArraylist.add("Ramesh");
        stringArraylist.add("Mahesh");
        stringArraylist.add("Ritesh");
        return stringArraylist;
    }

    public ArrayList<Integer> integerArrayList() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(18);
        integerArrayList.add(23);
        integerArrayList.add(25);
        return integerArrayList;
    }

    public ArrayList<Double> doubleArrayList() {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18900.25);
        doubleArrayList.add(22500.72);
        doubleArrayList.add(23450.33);
        return doubleArrayList;
    }



    public static void main(String[] args) {
        Employee_Arraylist_Genrics obj = new Employee_Arraylist_Genrics();
        for (String var : obj.stringArraylist()) {
            System.out.println("Name:- " + var);
        }

        for (Integer var : obj.integerArrayList()){
            System.out.println("Age:- "+var);
        }
        for (Double var : obj.doubleArrayList()){
            System.out.println("Salary:- "+var);
        }
    }
}
