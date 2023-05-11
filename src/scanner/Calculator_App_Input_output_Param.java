package scanner;

import java.util.Scanner;

public class Calculator_App_Input_output_Param {
    public int addition(int a, int b) {
        int sum = a + b;
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
        Calculator_App_Input_output_Param obj=new Calculator_App_Input_output_Param();
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        while (flag){
            System.out.println("Please enter the value of :- a");
            int a= scanner.nextInt();
            System.out.println("Please enter the value of :- b");
            int b= scanner.nextInt();

            System.out.println("Please enter your choice:- ");
            Scanner scanner1=new Scanner(System.in);
            String choice =scanner1.nextLine();
            if (choice.equals("+")){
                System.out.println("Addition is := "+obj.addition(a,b));
            } else if (choice.equals("-")) {
                System.out.println("Subtract is:- "+obj.subtract(a,b));
            } else if (choice.equals("*")) {
                System.out.println("Multiply is :- "+obj.multiply(a,b));
            } else if (choice.equals("/")) {
                System.out.println("Divide is :- "+obj.divide(a,b));
            }
            System.out.println("Want to Close Calculator Press Y or Press any key to Continue:-");
            String new_choice=scanner1.nextLine();
            if (new_choice.equals("Y")){
                flag=false;
            }
        }
    }
}
