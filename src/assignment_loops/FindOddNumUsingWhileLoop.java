package assignment_loops;

public class FindOddNumUsingWhileLoop {
    public static void main(String[]args){
        // declare initial num
        int j=1;
        // decalre last limit of number
        while (j<=100){
            // check odd num
            if (!(j%2==0)){
                // print odd numbers
                System.out.println("while loop "+j);
            }
            j++;
        }
    }
}
