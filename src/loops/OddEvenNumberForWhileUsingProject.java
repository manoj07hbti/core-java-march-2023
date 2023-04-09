package loops;

public class OddEvenNumberForWhileUsingProject {
    public static void main(String[] args) {
        // Using For loop & If Else Condition to Print Even & Odd Number;

        int Number=100;
        System.out.print("List of even numbers from 1 to " + Number + " ");
        for (int i = 1;i <=Number;i++){


            if (i % 2 == 0){
                System.out.println("Even Number"+i+ ",");
            }else {
                System.out.println("Odd Number"+i);
            }
        }

        // Niranjan Programe;
        // Using For loop & If Else Condition to Print Even Number;
            int number = 100;
            System.out.print("List of even numbers from 1 to " + number + " ");
            for (int k = 1; k <= number; k++) {
        //logic to check if the number is even or not
        //if i%2 is equal to zero, the number is even
                if (k % 2 == 0) {
                    System.out.print( "even number " +k + " , ");
                }else{
                    System.out.println("odd number"+k);
            }
        }
    }
}
