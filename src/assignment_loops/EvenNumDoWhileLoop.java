package assignment_loops;

public class EvenNumDoWhileLoop {
    public static void main(String[]args){

        // here used do while loop
        int j=1;  //declare initial value
        do {if (j%2==0) //check condition of even num
            System.out.println("even num do while loop " +j);
            j++;
        }while (j<=100); // declare last value or limits
    }
}
