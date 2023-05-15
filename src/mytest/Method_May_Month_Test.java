package mytest;


import java.util.Scanner;

public class Method_May_Month_Test {

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

    public static void main(String[] args) {
        Method_May_Month_Test obj = new Method_May_Month_Test();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("please enter value of a");
            int a = scanner.nextInt();
            System.out.println("please enter value of b");
            int b = scanner.nextInt();
            System.out.println("Please enter choice -:2 4 6 and 8");
            Scanner scanner1 = new Scanner(System.in);
            String choice = scanner1.nextLine();

            if (choice.equals("2")) {
                System.out.println("addition is " + obj.add(a, b));
            } else if (choice.equals("4")) {
                System.out.println("subtraction is " + obj.sub(a, b));
            } else if (choice.equals("6")) {
                System.out.println("multi is " + obj.multi(a, b));
            } else if (choice.equals("8")) {
                System.out.println("divide is " + obj.divide(a, b));
            }
                System.out.println("Do you want to close Calculator App? press Z to exit or press any other key to continue");
                String choice1=scanner1.nextLine();

                if(choice1.equals("z")) {
                    flag = false;
                }
            }
       }
   }