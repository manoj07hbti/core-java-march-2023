package collection_demo;

import java.util.ArrayList;

public class ArrayListGenerics {

    public  ArrayList<String>  createStringList(){

        //CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList <String> stringArrayList= new ArrayList<>();

        stringArrayList.add("Java");
        stringArrayList.add("Spring");
        stringArrayList.add("Spring Boot");
        //stringArrayList.add(22); // compile time error
        stringArrayList.add("microservices");

        return stringArrayList;

    }

    public ArrayList<Integer> createIntList(){
        ArrayList<Integer> integers= new ArrayList<>();
        integers.add(33);
        integers.add(24);
        integers.add(231);

        return integers;
    }



    public static void main(String[] args) {
        ArrayListGenerics obj = new ArrayListGenerics();
        ArrayList<String> output= obj.createStringList();
        // for(Datatype var: collection/array){ CODE }
        for(String var: output){

            System.out.println("Printing data of list : "+var);
        }

        for(Integer var : obj.createIntList()){
            System.out.println("Printing integer list : "+var);
        }

    }
}
