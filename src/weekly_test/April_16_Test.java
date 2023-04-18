package weekly_test;

public class April_16_Test {
    public static void main(String[] args) {

        //print even and odd number between 123 and 234

        System.out.println("LIST OF EVEN AND ODD NUMBERS BETWEEN 123 AND 234 ");
        for (int i = 123; i <= 234; i++) {

            //  % is used for remainder
            if (i % 5 == 0) {
                if(i%2 ==0) {
                    System.out.println("EVEN NUMBER " + i + " DIVISIBLE BY 5");
                }else {
                    System.out.println("ODD NUMBER " + i +" DIVISIBLE BY 5");
                }
            }
        }


        //NUMBER IS PRIME OR NOT

            int value =17;
            boolean number= false;
            for (int h=2; h<value;h++){
                if (value % h ==0){
                    number =true;
                    break;
                }
            }
            if (!number)
                System.out.println("\n"+value+ " is prime number");
            else
                System.out.println("\n" +value+ " is not  prime number");
    }
}


