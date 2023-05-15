package weekly_test;

import java.util.Scanner;

public class Test_14_May {
    public int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int multiply(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public int divide(int a, int b) {
        int div = a / b;
        return div;
    }

    public static void main(String[] args) {
        Test_14_May obj = new Test_14_May();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("plz enter value A");
            int a = scanner.nextInt();
            System.out.println("plz enter value B");
            int b = scanner.nextInt();

            System.out.println("plz enter your choice");
            Scanner scanner1 = new Scanner(System.in);
            int Choice = scanner1.nextInt();
            if (Choice == 11) {
                System.out.println("add" + obj.addition(a, b));
            } else if (Choice == 22) {
                System.out.println("sub" + obj.sub(a, b));
            } else if (Choice == 33) {
                System.out.println("mul" + obj.multiply(a, b));
            } else if (Choice == 44) {
                System.out.println("div" + obj.divide(a, b));
            }


            Scanner scanner2 = new Scanner(System.in);
            System.out.println("yes");
            String new_Choice1 = scanner2.nextLine();
            if (new_Choice1.equals("yes")) {
                flag = false;
            }
        }
    }
}