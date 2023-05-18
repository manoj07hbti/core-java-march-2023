package collection_demo;

import java.util.ArrayList;

public class ArrayGenericsList {
    public ArrayList <String> StringList(){
        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList <String> stringArrayList = new ArrayList<>();
        stringArrayList.add("the language is java");
        stringArrayList.add("spring boot");
        stringArrayList.add("this is my world");
        return stringArrayList;
    }
public  ArrayList <Integer> integerList(){
        ArrayList <Integer> integers=new ArrayList<>();
        integers.add(23);
        integers.add(32423);
        integers.add(424);
        return integers;
}
public  ArrayList <Double> doubleList(){
        ArrayList <Double> doubles=new ArrayList<>();
        doubles.add(23.32);
        doubles.add(12.3);
      return doubles;
}

    public static void main(String[] args) {
        ArrayGenericsList obj=new ArrayGenericsList();
        ArrayList<String> output= obj.StringList();
for(String var :obj.StringList()){
    System.out.println("print sting value: "+var);
    }
for(Integer var: obj.integerList()){
    System.out.println("print integer value: "+var);
   }
for(Double var: obj.doubleList()){
    System.out.println("print double value: "+var);
        }
    }
}
