package array_demo_project;

public class Advance_Loop_With_Index_Printing_Project {
    public static void main(String[] args) {
        //Using Advance Loop for Printing with Index No

        String Country[] = {"India", "USA", "England", "Russia", "Canada"};
        int i=0;
        for (String var : Country) {
            System.out.println("Printing Country Name"+" = " + var+"Index No:- "+i);
            i++;
        }
    }
}
