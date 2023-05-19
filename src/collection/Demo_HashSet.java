package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo_HashSet {
    public HashSet<String> createHashset(){

        // CollectionName <Datatype> objName = new CollectionName<>();
        HashSet<String> course=new HashSet<>();

        course.add("JAVA");
        course.add("BOOT SPRING");
        course.add("DOT NET");
        course.add("VISUAL BASIC");
        course.add("PYTHON");
        course.add("C++");
        course.add("C#");
        course.add("CSS");
        course.add("C LANGUAGE");
        course.add("DOT NET");
        course.add("VISUAL BASIC");
        course.add("PYTHON");
        course.add("C++");
        course.add("C#");

        //printing size of arraylist
        System.out.println("printing arraylist size" +course.size());

        //printing size of arraylist with while loop
        int i=0;
        while(i<course.size()){
            System.out.println(i);
            i++;
        }

        //priting set with advance loop
        for(String var:course){
            System.out.println("printing string hashset : "+var );
        }

        return course;
    }

    //integer hashset
    public HashSet<Integer> IntegerHashset(){
        HashSet<Integer> roll_no=new HashSet<>();

        roll_no.add(88);
        roll_no.add(55);
        roll_no.add(45);
        roll_no.add(1);
        roll_no.add(47);
        roll_no.add(88);
        roll_no.add(55);
        roll_no.add(45);
        roll_no.add(1);
        roll_no.add(47);

        for(Integer var:roll_no){
            System.out.println("printing integer hashset : "+var);
        }
        return roll_no;
    }

    public static void main(String[] args) {
       Demo_HashSet obj=new Demo_HashSet();
        obj.createHashset();
        obj.IntegerHashset();
    }
}
