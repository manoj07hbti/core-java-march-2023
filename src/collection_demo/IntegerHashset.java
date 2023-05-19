package collection_demo;

import java.util.HashSet;

public class IntegerHashset {
    public void createIntegerhashset(){
        HashSet<Integer> integerHashSet=new HashSet<>();

        integerHashSet.add(5887);
        integerHashSet.add(4478);
        integerHashSet.add(358);
        integerHashSet.add(42478);
        integerHashSet.add(4367);
        integerHashSet.add(5434);
        integerHashSet.add(1111);
        integerHashSet.add(22222);

        // remove element at 7 index
        integerHashSet.remove(7);
        integerHashSet.remove(22222);

        for (Integer var:integerHashSet){
            System.out.println("for each loop "+var);
        }
    }
    public static void main(String[] args) {
        IntegerHashset obj=new IntegerHashset();
        obj.createIntegerhashset();
    }
}
