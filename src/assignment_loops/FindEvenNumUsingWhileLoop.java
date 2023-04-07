package assignment_loops;

public class FindEvenNumUsingWhileLoop {
    public static void main(String[]args){
        // even num 1 to 100 using while loop

        // first declare initial num
        int i=1;
        // declare last num
        while (i<=100){
            // check even num by Modulus operator
            if (i%2==0){
                System.out.println(" "+i);
            }
            // increment operator
            i++;
        }
    }
}
