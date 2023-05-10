package methods_or_funtions;

import java.util.Scanner;

public class MyCalculatorApp {
    public int add(int a, int b) {
        int add = a + b;
        return add;
    }

    public int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int multi(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public double divide(int a, int b) {
        double divide = (double) a / b;
        return divide;
    }

    public double percentage(int a, int b) {
        double output = (double) a / b * 100;
        return output;
    }

    public static void main(String[] args) {
        MyCalculatorApp obj = new MyCalculatorApp();
        Scanner scanner = new Scanner(System.in);
boolean flag=true;
        while (flag) {
            System.out.println("please enter value of a");
            int a = scanner.nextInt();
            System.out.println("please enter value of b");
            int b = scanner.nextInt();
            System.out.println("Please enter choice : + , - , * , / and %");
            Scanner scanner1 = new Scanner(System.in);
            String choice = scanner1.nextLine();

            if (choice.equals("+")) {
                System.out.println("addition is " + obj.add(a, b));
            } else if (choice.equals("-")) {
                System.out.println("subtraction is " + obj.sub(a, b));
            } else if (choice.equals("*")) {
                System.out.println("multi is " + obj.multi(a, b));
            } else if (choice.equals("/")) {
                System.out.println("divide is " + obj.divide(a, b));
            } else if (choice.equals("%")) {
                System.out.println("percentage is " + obj.percentage(a, b));
            }
            System.out.println("Do you want to close Calculator App? press Z to exit or press any other key to continue");
            String choice1=scanner1.nextLine();

            if(choice1.equals("z")) {
                flag = false;
            }
        }
    }
}



