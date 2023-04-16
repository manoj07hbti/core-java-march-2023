package weekly_test;

public class April_16_Test {
    public static void main(String[] args) {

        //print even and odd number between 123 and 234

        System.out.println("LIST OF EVEN AND ODD NUMBERS BETWEEN 123 AND 234 ");
        for (int i = 123; i <= 234; i++) {

            //  % is used for remainder
            if (i % 2 == 0) {
                System.out.println("EVEN " + i);
            } else {
                System.out.println("ODD " + i);
            }
        }
        for (int j = 123; j <= 234; j++) {
            if (j % 5 == 0)
                System.out.println(+j + " DIVISIBLE BY 5");
        }



        //NUMBER IS PRIME OR NOT

            int value =52;
            boolean weather= false;
            for (int h=2; h<=value;h++){
                if (value % h ==0){
                    weather =true;
                    break;
                }
            }
            if (!weather)
                System.out.println("\n"+value+ " is not  prime number");
            else
                System.out.println("\n" +value+ " is  prime number");

        }
}


