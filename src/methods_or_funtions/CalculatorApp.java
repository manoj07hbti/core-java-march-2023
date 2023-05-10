package methods_or_funtions;

import java.util.Scanner;

public class CalculatorApp {
    public int addition(int a, int b){
        int add=a+b;
        return add;
    }
    public int substract(int a, int b){
        int subs=a-b;
        return subs;
    }
    public int multiply(int a, int b){
        int mult=a*b;
        return mult;
    }
    public double divide(int a, int b){
        double div=(double) a/b;
        return div;
    }
    public double percent(int a,int b){
        double percent_value=(double)a*b/100;
        return percent_value;

    }

    public static void main(String[] args) {
        CalculatorApp obj=new CalculatorApp();
        Scanner scr=new Scanner(System.in);
        //Create boolean condition for true and false condition
        Boolean flag=true;


        //here we appling while loop
        while (flag){
            System.out.println("please Enter value of a" );
            int a=scr.nextInt();

            System.out.println("please Enter value of b" );
            int b=scr.nextInt();

            //create again scanner obj
            Scanner scanner=new Scanner(System.in);

            System.out.println("Please select operation +,-,*,/,%");
            String choice=scanner.nextLine();

            if (choice.equals("+")){
                System.out.println("addition of a and b is " +obj.addition(a,b));
            } else if(choice.equals("-")) {
                System.out.println("subtraction is " +obj.substract(a,b));
            } else if (choice.equals("*")) {
                System.out.println("multi is " +obj.multiply(a,b));
            } else if (choice.equals("/")) {
                System.out.println("division is " +obj.divide(a,b));
            }else {
                System.out.println("percent " +obj.percent(a,b));
            }

            System.out.println("do yo want to Exit Press Y or press any key for continue" );
            String process_continue=scanner.nextLine();
            if (process_continue.equals("Y")){
                flag=false;

            }
        }

    }
}
