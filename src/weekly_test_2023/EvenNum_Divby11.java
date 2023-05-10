package weekly_test_2023;

public class EvenNum_Divby11 {
    public static void main(String[] args) {

        // using for loop and applying Nested if condition
        int i = 180;
        for (i = 180; i >= 1; i--) {
            if (i % 11 == 0) {
                if (i % 2 == 0) {
                    System.out.println("Number is div by 11 and this is even num" + i);
                }
            }
        }

        // we using while loop as well & operator
        i=180; // initial value
        while (i >= 1) {
            if (i % 11 == 0 & i % 2 == 0) {
                System.out.println("Number is div by 11 and this is even num using while loop & operator" + i);
            }
            i--; // decrement operator

        }
    }
}
