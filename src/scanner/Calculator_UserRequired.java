package scanner;

import java.util.Scanner;

public class Calculator_UserRequired {
    public int addition(int a,int b){
         int sum=a+b;
        return sum;
    }
    public int subtract(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int multiply(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public double divide(int a, int b) {    // Using of Type Casting for Change the Datatype value
        double div =(double) a / b;
        return div;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the Value of:- a");
        int a= scanner.nextInt();
        System.out.println("Please enter the Value of:- b");
        int b= scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("PLease enter the operator:- ");
        String choice= scanner1.nextLine();
        System.out.println("Please enter the another operator:- ");
        String choice1=scanner1.nextLine();

        Calculator_UserRequired obj=new Calculator_UserRequired();
        if (choice.equals("+")){
            System.out.println("Addition is :-"+obj.addition(a,b));
        } else if (choice.equals("-")) {
            System.out.println("Subtract is :- "+obj.subtract(a,b));
        } else if (choice.equals("*")) {
            System.out.println("Multiply is :- "+obj.multiply(a,b));
        } else if (choice.equals("/")) {
            System.out.println("Divide is :- "+ obj.divide(a,b));
        }
    }
}
