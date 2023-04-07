package assignment_loops;

public class FindOddEvenNumbers {
    public static void main(String[] args) {
        // USING FOR for loop
        int i = 1;
        for (i = 1; i <= 100; i++) {
            // check even num
            if (i % 2 == 0) {
                System.out.println("even numbers using for loop " + i);
            } else {
                System.out.println("Odd numbers " + i);
            }

        }
        // using while loop
        i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("even num using while loop " + i);
            } else {
                System.out.println("Odd num using " + i);
            }
            i++;
        }

    }
}