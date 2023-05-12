package collection_demo;

import java.util.ArrayList;

public class MyDemoList {
    public void list_create(){
//SYNTAX : ArrayList objName= new ArrayList();
        ArrayList list=new ArrayList();
        list.add(" This is my first list class ");
        list.add("hello world");
        list.add("ram going to agra");
        list.add("sudhir is a java developer");
        list.add("rashmi is a good java developer");
        list.add("rashmi's salary is");
        list.add("123533");
        list.add("we are learning java language");
        list.add("java language is a advance language");
        list.add("436546454");
        System.out.println(list.get(0));
        for (int i=0; i < list.size(); i++){

            System.out.println("Printing data in for loop : "+list.get(i) + " at INDEX "+i);
        }
        list.remove(5 &6);

        for (int i=0; i < list.size(); i++){

            System.out.println("AFTER REMOVE Printing data in for loop : "+list.get(i) + " at INDEX "+i);
        }

    }

    public static void main(String[] args) {
        MyDemoList obj= new MyDemoList();
        obj.list_create();
    }
}
