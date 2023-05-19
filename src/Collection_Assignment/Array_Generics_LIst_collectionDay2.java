package Collection_Assignment;

import java.util.ArrayList;

public class Array_Generics_LIst_collectionDay2 {

    public ArrayList<String> StringList() {
        //CollectionName <Datatype> objName = new CollectionName<>()

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("the language is java");
        arrayList.add("spring boot");
        arrayList.add("this is my world");
        return arrayList;

    }

    public ArrayList<Integer> integerList() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(23);
        integers.add(32423);
        integers.add(424);
        return integers;

    }

    public ArrayList<Double> doubleList() {
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(23.32);
        doubles.add(12.3);
        return doubles;

    }

    public static void main(String[] args) {
        Array_Generics_LIst_collectionDay2 obj = new Array_Generics_LIst_collectionDay2();
        ArrayList<String> output = obj.StringList();
        for (String var : obj.StringList()) {
            System.out.println("printing string value " + var);
        }
        for (Integer var : obj.integerList()) {
            System.out.println("print integer value: " + var);
        }
        for (Double var : obj.doubleList()) {
            System.out.println("print double value: " + var);
        }
    }
}