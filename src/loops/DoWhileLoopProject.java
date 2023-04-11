package loops;

public class DoWhileLoopProject {
    public static void main(String[] args) {

        // Using Do while Loop Printing Table of 5;

        int number = 5;
        int i = 1;
        do {
            System.out.println(" 5x" + i + "=" + number * i);
            i++;
        } while (i <= 10);

        // Using Do while Loop Printing Table of 10;

        number = 10;
        int j = 1;
        do {
            System.out.println("10x" + j + "=" + number * j);
            j++;
        } while (j <= 10);


        // Using Do while Loop &  If Condition  Printing Even Number ;

        int k = 1;
        do {
            if (k % 2 == 0)
                System.out.println("Even num " + k);
            k++;
        } while (k < 100);

        // Using Do while Loop &  If Condition  Printing Odd Number ;
        int l = 1;
        do {
            if (l % 2 != 0)
                System.out.println("Odd num " + l);
            l++;
        } while (l < 100);;

    }
}
