package loop;

public class EvenNumberWithForLoop {

    public static void main(String[] args) {

        //print even or odd numbers
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(" print even number with for loop " + i);

            } else {
                System.out.println(" odd numbers.." + i);
            }
        }


        //odd number with for loop

        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {
                System.out.println(" print odd number with for loop " + i);
            }
        }

        //Print even

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                System.out.println("Print all even number with for loop .." + i);


            }
        }
    }}
