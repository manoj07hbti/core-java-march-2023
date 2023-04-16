package weekly_test_9_april;

public class Programe1 {

    //Write a program to print a number between 1 to 100 which is Divisibale by 7
    //should also tell whether given number is even or odd.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%7==0) {
                System.out.println("Given Number is Divisible by 7");
                if (i % 2 == 0) {
                    System.out.println("Even Number" + i);
                } else {
                    System.out.println("Odd Number"+i);
                }
            }
            }
        }
        }




