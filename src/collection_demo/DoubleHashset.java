package collection_demo;

import java.util.HashSet;

public class DoubleHashset {
    public void createDoubleHashset(){

        HashSet<Double> doubleHashSet=new HashSet<>();


        // HashSet always stores unique element e.i.at index 1,3,5 here will be print only sinle element

        doubleHashSet.add(765.87);
        doubleHashSet.add(865.755);
        doubleHashSet.add(765.87);
        doubleHashSet.add(865.755);
        doubleHashSet.add(765.87);
        doubleHashSet.add(865.755);
        doubleHashSet.add(765.54);
        doubleHashSet.add(6368.54);

        //apply for each loop

        for (Double var:doubleHashSet){
            System.out.println("for loop "+var);
        }

    }

    public static void main(String[] args) {
        DoubleHashset obj=new DoubleHashset();
        obj.createDoubleHashset();
    }
}
