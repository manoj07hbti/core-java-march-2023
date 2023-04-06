package loops;

public class OddEvenNumberForWhileUsingProject {
    public static void main(String[] args) {
        //Using For Loop Command to Print Even Number--1 to 100;

        for (int i = 100; i >= 0; i--) {
            System.out.println("Even Number"+"="+ i);
            i--;
        }
        //Using For Loop Command to Print Odd Number--1 to 100;

        for (int j = 99; j >= 0; j--) {
            System.out.println("Odd Number"+"="+ j);
            j--;
        }
        //Using While Loop Command to Print Even Number--1 to 100;

        int i=100;
        while (i>=0){
            System.out.println("Even Number"+"="+i--);
            i--;
        }

        //Using While Loop Command to Print Odd Number--1 to 100;

        int j=99;
        while (j>=0){
            System.out.println("Odd Number"+"="+j--);
            j--;
        }

    }
}
