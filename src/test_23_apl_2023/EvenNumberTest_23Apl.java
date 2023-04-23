package test_23_apl_2023;

public class EvenNumberTest_23Apl {
    public static void main(String[] args) {
        int number = 190;
        System.out.println("list of even number from 7 to " + number);

        for (int i = 7; i <= number; i++) {

            if (i % 2 == 0 && i % 7 == 0) {

                System.out.println(i+"");
            }
        }

    }
}