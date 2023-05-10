package Scanner;

import java.util.Scanner;

public class Calculator_Made_By_Scanner {
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

    public int percentage(int a, int b) {
        int per = a * b / 100;
        return per;
    }

    public static void main(String[] args) {
        Calculator_Made_By_Scanner obj = new Calculator_Made_By_Scanner();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {

            System.out.println("Please enter value of a: ");
            int a = scanner.nextInt();
            System.out.println("Please enter value of b: ");
            int b = scanner.nextInt();

            System.out.println("Please enter choice : + , - , * and / ");
            Scanner scanner1 = new Scanner(System.in);
            String choice = scanner1.nextLine();

            if (choice.equals("+")) {
                System.out.println("Addition is :" + obj.addition(a, b));
            } else if (choice.equals("-")) {
                System.out.println("Subtraction  is :" + obj.sub(a, b));
            } else if (choice.equals("*")) {
                System.out.println("multiply is :" + obj.multiply(a, b));
            } else if (choice.equals("/")) {
                System.out.println("divide is :" + obj.divide(a, b));
            } else if (choice.equals("%")) {
                System.out.println("percentage is :" + obj.percentage(a, b));
                System.out.println("Do you want to close Calculator App? press Y to exit or press any other key to continue");
                String new_choice = scanner1.nextLine();
                if (new_choice.equals("Y")) {
                    flag = false;

                }
            }
        }
    }
}