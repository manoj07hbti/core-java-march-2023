package loops;

public class DoWhileLoopProject {
    public static void main(String[] args) {

        // Using Do while Loop Printing Table of 5;

        int number=5;
        int i=1;
        do {
            System.out.println(" 5x"+i+"="+number*i);
            i++;
        }while(i<=10);

        // Using Do while Loop Printing Table of 10;

        number=10;
        int j=1;
        do {
            System.out.println("10x"+j+"="+number*j);
            j++;
        }while (j<=10);


        // Using Do while Loop & Condition If & Else Printing Even & Odd Number ;

        number=100;
        int k=1;
        do {
            System.out.println("Even & Odd Number 1 to 100"+k%2);
            }while (k<=number);

    }
}
