package weekly_test;

public class Week_23_Apr_MethodClass {
    //Make the Method & Call Method Project of Prime Number==========================
    public void primeNumberCheck(){
        int num=10;
        int count=0;
        for(int i=1; i<=num;i++){
            count=0;
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==0){
                System.out.println("Given Number is Prime Number:- "+i);
            }
        }
    }

    //Make the Method & Call Method Project of ==========================
    //write a code to check any number between 8 to 160 is divisible by 11 and it should not be odd number
    public void evenOdd(){
        for (int i=8;i<=160;i++){
            System.out.println("Number :- "+i);
            //We can use Nested if & Both Condition for this============================================
            if (i%11==0 && i%2==0){
                //if (i%2==0){
                System.out.println("Given Number is Divisible by 11 & not an Odd number "+i);
            }
        }
    }
    public static void main(String[] args) {
       Week_23_Apr_MethodClass obj=new Week_23_Apr_MethodClass();
       obj.primeNumberCheck();
       obj.evenOdd();
    }
}

