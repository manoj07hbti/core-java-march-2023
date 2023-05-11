package collection;

import java.util.ArrayList;

public class Collection_demo {

    public void createList(){

        //SYNTAX : ArrayList objName= new ArrayList();
        ArrayList list=new ArrayList();

        list.add("TANJIRO"); // ADDING INTO LIST, list index number start with 0 as well  INDEX 0
        list.add("RENGOKU"); // INDEX 1
        list.add("NEZUKO"); // INDEX 2
        list.add("IZUI"); // INDEX 3
        list.add("AKAZA"); // INDEX 4
        list.add("GIYU TOMIOKA");
        list.add("123");
        list.add("79.89");
        list.add("8877");
        list.add("451266");

        //list.get used for getting and printing list
        System.out.println("PRINTING LIST BY THEIR INDEX NUNBER "+list.get(4));
        System.out.println(list.get(0));

        //printing all elemets of list   ObjName.size() gives the size of the list
        for(int i=0; i < list.size(); i++) {
            System.out.println("Printing data in for loop : " + list.get(i) + " at INDEX " + i);
        }

        //PRINTING WITH WHILE LOOP
        int j=0;
         while(j< list.size()){
             System.out.println("Printing data in while loop : " + list.get(j) + " at INDEX " + j);
             j++;
         }

        // advanced loop  : for (Datatype varName: array/collection){ CODE }
        for(Object var: list){
            System.out.println("printing using advance for loop " +var);
        }

        list.remove(7);
        for(int i=0;i<list.size();i++){
            System.out.println("printing elements after remove "+list.get(i) +" on index " +i);
        }
    }


    public static void main(String[] args){
        Collection_demo obj=new Collection_demo();
        obj.createList();
    }
}
