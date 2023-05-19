package Collection_Assignment;

import java.util.HashSet;

public class Collection_Hashset {
    // String , Integer and , Double print in advanced loop

    public void StringData() {
        HashSet<String> StudentName = new HashSet<>();
        StudentName.add("Rohit");
        StudentName.add("Ritesh");
        StudentName.add("Rohit");
        StudentName.add("Ritesh");
        System.out.println("Data Size:- " + StudentName.size());

        for (String var : StudentName) {
            System.out.println("Name:- " + var);
        }

    }

    public void IntegerData(){
        HashSet<Integer> RollNo=new HashSet<>();
        RollNo.add(23);
        RollNo.add(98);
        RollNo.add(88);
        RollNo.add(87);
        System.out.println("Data Size:-"+ RollNo.size());

        for (Integer var :RollNo){
            System.out.println("Roll:- "+var);
        }
    }


    public void DoubleData(){
        HashSet<Double> Percentage=new HashSet<>();
        Percentage.add(78.8);
        Percentage.add(545.76);
        Percentage.add(876.5);
        Percentage.add(98.67);
        System.out.println("Data size:- "+Percentage.size());

        for (Double var : Percentage){
            System.out.println("Percentage");
        }
    }

    public static void main(String[] args) {
        Collection_Hashset obj=new Collection_Hashset();
        obj.StringData();
        obj.IntegerData();
        obj.DoubleData();
    }
}
