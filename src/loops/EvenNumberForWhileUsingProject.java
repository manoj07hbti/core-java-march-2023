package loops;

public class EvenNumberForWhileUsingProject {
    public static void main(String[] args) {
        // Using For loop & If Condition to Print Even Number;

        int number=100;
        for (int i = 1;i <=number;i++){
            if (i % 2 == 0){
                System.out.println("Even Number"+ "="+i);
            }
            }
        // Using While loop & If Condition to Print Even Number;
        int j=1;
        while (j<number){
            if (j%2==0){
                System.out.println("Even No"+"="+j);
            }
            j++;
            }
        }
    }

