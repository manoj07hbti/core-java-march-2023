package weekly_test_16_april;

public class Project_1 {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 100) {
            if (i % 7 == 0) {
                System.out.println(" Given Number is Divisible by 7 " + i);
                if (i % 2 != 0) {
                    System.out.println("Given Number is Odd " + i);
                } else {
                    System.out.println("Given Number is Even " + i);
                }
            }
            i++;
        }
    }
    }