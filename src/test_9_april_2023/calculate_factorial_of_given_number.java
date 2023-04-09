package test_9_april_2023;

public class calculate_factorial_of_given_number {
    public static void main(String[] args) {
        int i,fact=1;
        int number=8;
        // it  is the num to calculate factorial;
        for (i=1;i<number; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+"is:"+fact);
    }
}
