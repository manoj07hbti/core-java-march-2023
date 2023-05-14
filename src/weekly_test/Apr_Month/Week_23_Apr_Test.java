package weekly_test.Apr_Month;

public class Week_23_Apr_Test {
    //write a code to check any number between 8 to 160 is divisible by 11 and it should not be odd number
    public static void main(String[] args) {
        for (int i=8;i<=160;i++){
            System.out.println("Number :- "+i);
            //We can use Nested if & Both Condition for this============================================
            if (i%11==0 && i%2==0){
                //if (i%2==0){
                    System.out.println("Given Number is Divisible by 11 & not an Odd number "+i);
                }
            }
        }
    }


