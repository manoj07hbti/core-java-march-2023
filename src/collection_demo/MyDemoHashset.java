package collection_demo;

import java.util.HashSet;

public class MyDemoHashset {
    public void StringHashset() {
        HashSet<String> course = new HashSet<>();
        course.add("Raju");
        course.add("Shyam");
        course.add("Raju");
        course.add("Shyam");
        course.add("Ram");
        for (String var : course) {
            System.out.println("print string " + var);
        }
    }

    public void IntegerHashset() {
        HashSet<Integer> roll_no = new HashSet<>();
        roll_no.add(234);
        roll_no.add(235);
        roll_no.add(234);
        roll_no.add(235);
        roll_no.add(236);
        for (Integer var : roll_no) {
            System.out.println("print integer " + var);
        }
    }

    public void DoubleHashset() {
        HashSet<Double> expanses = new HashSet<>();
        expanses.add(435.45);
        expanses.add(435.4);
        expanses.add(435.54);
        expanses.add(435.45);
        expanses.add(435.4);
        for(Double var: expanses){
            System.out.println("print double "+var);
        }
    }

    public static void main(String[] args) {
        MyDemoHashset obj = new MyDemoHashset();
        obj.StringHashset();
        obj.IntegerHashset();
        obj.DoubleHashset();
    }
}