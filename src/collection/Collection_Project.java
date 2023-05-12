package collection;

import java.util.ArrayList;
import java.util.Objects;

public class Collection_Project {
    public void studentList(){
        ArrayList  obj=new ArrayList<>();
        obj.add("Ramesh");
        obj.add("Mahesh");
        obj.add("Suresh");
        obj.add("Dinesh");
        obj.add("Akhilesh");
        obj.add("Rajesh");
        obj.add("Naveen");
        obj.add("Prem");
        obj.add("Nikhil");
        obj.add("Kavita");
        System.out.println(obj.get(0));
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));
        System.out.println(obj.get(4));
        System.out.println(obj.get(5));
        System.out.println(obj.get(6));
        System.out.println(obj.get(7));
        System.out.println(obj.get(8));
        System.out.println(obj.get(9));

        //Using for Loop for Execute
        for (int i=0;i<obj.size();i++){
            System.out.println("Printing List with For Loop:- " +obj.get(i)+ "Index No:- "+i);
        }

        //Using while loop for Execute
        int j=0;
        while(j<obj.size()){
            System.out.println("Printing List with while Loop:- " + obj.get(j) + "Index No:- "+j);
            j++;
        }

        //Using Advance loop for Execute
        for(Object var:obj){
            System.out.println("Printing List with Advance Loop :- "+ var);
        }

        //Using Remove Method for Remove and entry from list
        obj.remove(5);
            for (int i=0;i<obj.size();i++){
                System.out.println("Printing List Remove method with For Loop:- " +obj.get(i)+ "Index No:- "+i);
            }

        }

    public static void main(String[] args) {
        Collection_Project obj=new Collection_Project();
        obj.studentList();
    }
}
