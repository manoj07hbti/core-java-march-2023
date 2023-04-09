package test_9_april_2023;

public class check_weather_given_number_prime_or_not {
    public static void main(String[] args) {
        int num =23;
        boolean flag= false;
        for (int i=2; i<= num/2;++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num +"is a prime number.");
        else
            System.out.println(num+"is not a prime number.");

    }
}

