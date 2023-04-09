package weekly_test_9_april;

public class Programe1 {

    //Write a program to print a number between 1 to 100 which is
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println("Number" + "=" + i);
        }

        // divisible by 7 and it should also tell whether given number is even or odd.
        int i=100;
            if (i>7) {
                System.out.println("Given Number is Odd");
                if (i % 7 == 0) {
                    System.out.println("Odd Number" + i + ",");
                } else {
                    System.out.println("Even Number");
                }
            }else {
                System.out.println("Given number is Even");
            }
        }

    }



