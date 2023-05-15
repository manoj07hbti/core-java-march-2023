package weekly_test_2023;

import java.util.Scanner;

public class CalculatorWithUI {
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int substract(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int multiply(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public double divide(int a, int b) {
        double div = (double) a/b; // here used casting data type double
        return div;
    }

    public static void main(String[] args) {
        CalculatorWithUI obj=new CalculatorWithUI();

        Scanner scanner1=new Scanner(System.in);
        // declare boolean variable
        boolean flag=true;

        while (flag){
            System.out.println("Please Enter value of a");
            int a=scanner1.nextInt();
            System.out.println("Please Enter value of b");
            int b=scanner1.nextInt();

            System.out.println("Select operation choice 4,8,12,16");
            int choice=scanner1.nextInt();

            if (choice==4){
                System.out.println(obj.add(a,b));
            } else if (choice==8) {
                System.out.println(obj.substract(a,b));
            } else if (choice==12) {
                System.out.println(obj.multiply(a,b));
            }else {
                System.out.println(obj.divide(a, b));
            }
            Scanner scanner2=new Scanner(System.in);
            System.out.println("do you want continue_process press any key otherwise press Y for stop process");
            String continue_process = scanner2.nextLine();
            if (continue_process.equals("Y")){
                flag=false;
            }
        }

    }
}


