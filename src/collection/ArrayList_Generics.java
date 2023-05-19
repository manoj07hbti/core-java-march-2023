package collection;

import java.util.ArrayList;

public class ArrayList_Generics {
    //CREATING STRING LIST
    public ArrayList<String> StringList(){

        //CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList<String> stringArrayList=new ArrayList<>();

        stringArrayList.add("Java");
        stringArrayList.add("Python");
        stringArrayList.add("C++");
        stringArrayList.add("C#");
        stringArrayList.add("DOTNET");
        stringArrayList.add("BOOT SPRING");

        //deleting the index
        stringArrayList.remove(4);

        return stringArrayList;
    }

    //CREATING INTEGER LIST
    public ArrayList<Integer> CreateIntegerList(){
        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(123);
        integerArrayList.add(85255);
        integerArrayList.add(8569999);
        integerArrayList.add(84575);
        integerArrayList.add(14254);

        //deleting the index
        integerArrayList.remove(3);

        return integerArrayList;
    }

    //CREATING DOUBLE LIST
    public ArrayList<Double> CreateDoubleList(){

        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(56.25);
        doubleArrayList.add(8545.556);
        doubleArrayList.add(78451.4);
        doubleArrayList.add(7485.55);
        doubleArrayList.add(145.22);

        //deleting the index
        doubleArrayList.remove(1);

        return doubleArrayList;
    }

    public static void main(String[] args) {
        ArrayList_Generics obj=new ArrayList_Generics();
        System.out.println(obj.StringList());
        System.out.println(obj.CreateIntegerList());
        System.out.println(obj.CreateDoubleList());

        // first method save the object into a variable
        ArrayList<String> output = obj.StringList();
        for (String var: output){
            System.out.println("PRINTING THE STRING LIST : "+var);
        }

        //second method print directly
        for(Integer var: obj.CreateIntegerList()){
            System.out.println("PRINTING THE INTEGER LIST : "+var);
        }

        for(Double var: obj.CreateDoubleList()){
            System.out.println("PRINTING THE DOUBLE LIST : "+var);
        }
    }
}
