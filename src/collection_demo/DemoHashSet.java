package collection_demo;

import java.util.HashSet;

public class DemoHashSet {

    public void createHashset(){
// CollectionName <Datatype> objName = new CollectionName<>();

        HashSet <String> course= new HashSet<>();
        course.add("Java");
        course.add("Spring");
        course.add("Spring Boot");
        course.add("Java");
        course.add("Spring");
        course.add("Spring Boot");

        System.out.println("Printing Size "+course.size());
        for(String var : course){

            System.out.println("Printing Set : "+var);
        }


    }

    public void createIntegerHashset(){

        HashSet<Integer> roll_no= new HashSet<>();

        roll_no.add(12);
        roll_no.add(12);
        roll_no.add(13);
        roll_no.add(12);roll_no.add(12);
        roll_no.add(33);
        roll_no.add(45);
        roll_no.add(55);

        for(Integer var: roll_no){

            System.out.println("Printing Integer Set: "+var);
        }


    }


    public static void main(String[] args) {
        DemoHashSet obj= new DemoHashSet();
        obj.createHashset();
        obj.createIntegerHashset();

    }
}
