package assignment_loops;

public class FiveTable {
    public static void main(String []args){
        // write code of 5 table using for loop
        int num=5;
        for (int k=1;k<=10;k++){
            System.out.println("for loop 5X"+k+ "=" + num*k);
        }

       // write code of 5 table using while loop

        int k=1;
        while (k<=10){
            System.out.println(" while loop 5X"+ k + "=" +num*k);
            k++;
        }

    }
}
