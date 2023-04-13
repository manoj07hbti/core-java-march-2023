package loops;

public class OddNumberForWhileUsingProject {
    public static void main(String[] args) {
        // Using For loop & If Condition to Print Even Number;
        int number=100;
        for (int j = 1;j <=number;j++){
            if (j % 2 != 0){
                System.out.println("Odd Number"+"="+j);
            }
        }
        // Using While loop & If Condition to Print Even Number;
        int k=1;
        while (k<number){
            if (k%2!=0){
                System.out.println("Odd Number"+"="+k);
            }
            k++;
        }
    }
}
