package mytest;

public class Test_To_Check_Divisibility {
    public static void main(String[] args) {
        int number = 150;
        System.out.print("List of odd numbers from 5 to " + number + ": ");
        for (int i = 5; i <= number; i++) {

            if (i % 2 != 0 && i % 3==0) {
                System.out.println(i + " ");
            }

        }
    }
}
