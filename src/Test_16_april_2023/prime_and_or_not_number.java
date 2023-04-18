package Test_16_april_2023;

public class prime_and_or_not_number {
    public static void main(String[] args) {
        int value =18;
        boolean weather= false;
        for (int h=2; h<value; ++h){
            if (value % h ==0){
                weather =true;
                break;
            }
        }
        if (!weather)
            System.out.println(value+ "prime number");
        else
            System.out.println(value+ "is not prime number");

        }
       }
