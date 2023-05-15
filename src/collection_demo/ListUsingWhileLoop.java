package collection_demo;

import java.util.ArrayList;

public class ListUsingWhileLoop {
    public void whileList(){
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
        int i=0;
        while (i<list.size()){
            System.out.println("Printing data in for loop :" +list.get(i) + " at INDEX "+i);
            i++;
        }

    }

    public static void main(String[] args) {
        ListUsingWhileLoop obj =new ListUsingWhileLoop();
        obj.whileList();
    }
}
