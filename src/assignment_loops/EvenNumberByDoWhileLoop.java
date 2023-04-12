package assignment_loops;

public class EvenNumberByDoWhileLoop {
    public static void main(String[]args){

        // use of do while loop ;
        int j= 1;

        do {
            if (j % 2 == 0)  // check condition of even
                System.out.println("only for even number " + j);
            j++;
        } while(j<=100);
    }
}
