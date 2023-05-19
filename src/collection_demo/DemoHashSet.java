package collection_demo;

import java.util.HashSet;

public class DemoHashSet {

    public void createHashset(){
// CollectionName <Datatype> objName = new CollectionName<>();

        HashSet <String> course= new HashSet<>();
        String s1="Java";
        System.out.println("Hashcode of s1: "+s1.hashCode());
        course.add(s1);
        course.add("Spring");
        course.add("Spring Boot");
        String s2="Java";
        course.add(s2);
        System.out.println("Hashcode of s2: "+s2.hashCode());
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
