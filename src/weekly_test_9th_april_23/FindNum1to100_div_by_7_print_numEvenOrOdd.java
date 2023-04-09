package weekly_test_9th_april_23;

public class FindNum1to100_div_by_7_print_numEvenOrOdd {
    public static void main(String[]args){
        int i=1; // intial value
        while (i<=100){if (i%7==0){
            System.out.println(" diviable by 7 num is " +i);// print num which div by 7
            if (i%2==0){                                    // check num is even or odd
                System.out.println("this num is even " +i);// print even num
            }else {
                System.out.println("this num is Odd " +i); // print odd num
            }

        }
            i++;


        }

    }
}
