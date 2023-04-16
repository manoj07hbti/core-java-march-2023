package weekly_test_2023;

public class Div_7_ChechEvenOdd {

    public static void main(String[] args) {

        int i=1; // initial value i=1 here using nested if condition with while loop
            while (i<=100){
                if (i%7==0){
                    if (i%2==0){
                        System.out.println("num is div by 7 and this is even number "+i);
                    }else {
                        System.out.println("num is div by 7 and this is Odd number "+i);
                    }
                }i++;
            }




    }
}



