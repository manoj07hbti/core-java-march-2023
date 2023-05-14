package weekly_test.Apr_Month;

public class Week_23_Apr_Test_2 {
    //write a code to check prime number between 1 to 10================================
    public static void main(String[] args) {
        int num=10;
        int count=0;
        for (int i=1; i<=num;i++){
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
        }

