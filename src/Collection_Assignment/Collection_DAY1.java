package Collection_Assignment;

import java.util.ArrayList;

public class Collection_DAY1 {

    public void NewList(){

        ArrayList list=new ArrayList();

        list.add("gaurav");
        list.add("vineet");
        list.add("vinay");
        list.add("saurav");
        list.add("old");
        list.add("use");
        list.add("better");
        list.add("sumit");
        list.add("bike");

        System.out.println(list.get(0));
        System.out.println(list.get(5));

        // Printing all element in arraylist;

        for (int i=0; i <list.size();i++){
            System.out.println("print in for Loop: "+list.get(i) +i);
        }

        // Printing all element in while loop;

        int k=0;
        while (k<list.size()){
            System.out.println("print in while loop: "+list.get(k) +k);
            k++;
        }



        for (Object var: list){
            System.out.println("Advanced Loop "+var);

        }
        list.remove(4);
        for (int i=0; i <list.size();i++){
            System.out.println("remove in loop: "+list.get(i)+ i);
        }

    }

    public static void main(String[] args) {
        Collection_DAY1 obj=new Collection_DAY1();
        obj.NewList();


    }
}
