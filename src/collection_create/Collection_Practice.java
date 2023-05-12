package collection_create;

import java.util.ArrayList;

public class Collection_Practice {

    public void poorlifelist (){

        ArrayList list = new ArrayList();
        list.add("Once there was a farmer  "); // opn.0
        list.add("His name was Ramu "); // opn 1
        list.add("He had two son "); // opn 2
        list.add("He was very hard worker ");// opn 3
        list.add("But he was very honestly ");// opn 4
        list.add("One day he was very ill ");// opn 5
        list.add("He called both his son and said, i want you tell  something.  "); // opn 6
        list.add("He said to both son, i have hidden some good in the field ");// opn 7
        list.add("Saying this he died ");// opn 8
        list.add("Both of them quickly pickup the shovel ");// opn 8
        list.add("They both  kept searching for long time  ");// opn 9
        list.add("But they did not get anything ");// opn 10

        System.out.println(list.get(5));
        System.out.println(list.get(7));

        // Printing all element in arraylist;

        for (int i=0; i < list.size();i++){
            System.out.println("print in for Loop: "+list.get(i) +i);

        }
        // Printing all element in while loop;

        int j=0;
        while (j<list.size()){
            System.out.println("print in while loop: "+list.get(j) +j);
            j++;
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
        Collection_Practice obj = new Collection_Practice();
        obj.poorlifelist();
    }


    }

