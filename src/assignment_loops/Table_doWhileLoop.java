package assignment_loops;

public class Table_doWhileLoop {
    public static void main(String[]args){
        int i=1; // initial value
        int num=5; // fixed value
        do {
            System.out.println("5 table do while loop 5x"+i+ " = " +i*num);
            i++; // applied increment operator
        }
        while (i<=10); // here we close do while loop by ; symbol

        // wrote code using do while loop for 10 table
        i=1; // declare initial value
        int num2=10; // fixed value
        do {
            System.out.println("10 table do while loop 10x"+i+ " = " +i*num2);
            i++;
        }
        while (i<=10);// declare limits for applied loop
        //here we close  do while loop by ; symbol
    }

}
