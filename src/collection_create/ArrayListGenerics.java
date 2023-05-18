package collection_create;

import java.util.ArrayList;

public class ArrayListGenerics {


        public  ArrayList<String>  createStringList(){

            //CollectionName <Datatype> objName = new CollectionName<>();

            ArrayList <String> stringArrayList= new ArrayList<>();


            stringArrayList.add("Do you know me ");
            stringArrayList.add("Yes i know you ");
            stringArrayList.add("Where did you meet me ?");
            stringArrayList.add("I meet you in Agra");
            stringArrayList.add("How are you ? ");
            stringArrayList.add("I am fine ");
            stringArrayList.add("What are you doing now a days");
            stringArrayList.add("Nothing ");

            return  stringArrayList;
        }

        public static void main(String[] args) {

            ArrayListGenerics obj = new ArrayListGenerics();
            ArrayList<String> output= obj.createStringList();

            // applied for loop
            for (int i=0;i<output.size(); i++){
                System.out.println("for loop " +output.get(i));
            }
            // applied while loop
            int j=0;
            while (j<output.size()){
                System.out.println(" while loop " +output.get(j));
                j++;
            }
            //   applied do while loop
            int k=0;
            do {
                System.out.println("do while loop " +output.get(k));
                k++;
            }while (k<output.size());

        }
        }


