package assignment_loops;

public class EvenNumber{
    public static void main(String[]args) {
        // print even numbers b/w 1 to 100 using for loop

        for (int k = 1; k <= 100; k++) {
            // we check that number is is even
            if (k % 2 == 0) {
                System.out.println("for loop " + k);
            }

        }

        // using while loop
        int i = 1;
        while (i <= 100) {
            // we check number is even
            if (i % 2 == 0) {
                System.out.println("while loop" + i);
            }
            i++;
        }

    }
}
