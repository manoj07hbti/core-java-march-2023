package weekly_test_9th_april_23;

public class OddOrEvenAndDivBy5 {
    public static void main(String[] args) {
        // using for loop
        int j = 123;
        for (j = 123; j <= 234; j++) {
            // check num is odd or even by nested if condition
            if (j % 2 == 0) {
                if (j%5==0)
                System.out.println("num is even and div by 5: " +j);


            }else {
                if (j%5==0)
                System.out.println("num is Odd and div by 5: " +j);
            }

        }
    }
}
