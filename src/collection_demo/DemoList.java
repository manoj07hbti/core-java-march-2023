package collection_demo;

import java.util.ArrayList;

public class DemoList {

    public void createList(){

        //SYNTAX : ArrayList objName= new ArrayList();

        ArrayList list= new ArrayList();

       list.add("Java"); // 0 INDEX
       list.add("Spring"); // 1 INDEX
       list.add("Spring boot");// 2 INDEX
       list.add(123);// 3 INDEX

        System.out.println(list.get(0));
        System.out.println(list.get(2));

        // print all element of arraylist

        for (int i=0; i < list.size(); i++){

            System.out.println("Printing data in for loop : "+list.get(i) + " at INDEX "+i);
        }
        // print it using while loop
        // advanced loop  : for (Datatype varName: array/collection){ CODE }
        for(Object var: list){

            System.out.println("Printing using advanced loop "+var);
        }

        list.remove(1);

        for (int i=0; i < list.size(); i++){

            System.out.println("AFTER REMOVE Printing data in for loop : "+list.get(i) + " at INDEX "+i);
        }

    }

    public static void main(String[] args) {
        DemoList obj= new DemoList();
        obj.createList();
    }
}
