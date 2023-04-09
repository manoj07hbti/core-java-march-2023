package weekly_test_9th_april_23;

public class OddOrEvenAndDivBy5 {
    public static void main(String[] args) {
        // using for loop
        int j = 123;
        for (j = 123; j <= 234; j++) {
            // check num is odd or even
            if (j % 2 == 0) {
                System.out.println("num is even "+j);


            }else {
                System.out.println("num is Odd "+j);
            }
               // check num is div by 5
                if (j % 5 == 0) {
                    // print only those num which are divisible by 5
                    System.out.println("which num is also divisible by 5 that is : " + j);
                }
        }
    }
}
