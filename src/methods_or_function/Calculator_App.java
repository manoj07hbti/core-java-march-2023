package methods_or_function;

import sun.font.CreatedFontTracker;

import java.util.Scanner;

public class Calculator_App {
    public void addition(){
        int a,b,sum;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the value of :- a");
        a=scanner.nextInt();
        System.out.println("Please enter the value of :- b");
        b=scanner.nextInt();
        sum=a+b;
        System.out.println("Addition of value:- "+sum);
    }
    public void subtract(){
        int a,b,sub;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the value of :- a");
        a=scanner.nextInt();
        System.out.println("Please enter the value of :- b");
        b=scanner.nextInt();
        sub=a-b;
        System.out.println("Subtract of value:- "+sub);
    }
    public void multiply(){
        int a,b,multi;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the value of :- a");
        a=scanner.nextInt();
        System.out.println("Please enter the value of :- b");
        b=scanner.nextInt();
        multi=a*b;
        System.out.println("Multiply of value:- "+multi);
    }
    public void divide(){
        int a,b,div;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the value of :- a");
        a=scanner.nextInt();
        System.out.println("Please enter the value of :- b");
        b=scanner.nextInt();
        div=a/b;
        System.out.println("Divide of value:- "+div);
    }

    public static void main(String[] args) {
        Calculator_App obj=new Calculator_App();
        boolean flag=true;
        while (flag=true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your Choice:-(Ex:- +,-,*,/) ");
            String choice = scanner.nextLine();
            if (choice.equals("+")){
                obj.addition();
            } else if (choice.equals("-")) {
                obj.subtract();
            } else if (choice.equals("*")) {
                obj.multiply();
            } else if (choice.equals("/")) {
                obj.divide();
            }
            System.out.println("Want to Close Calculator Press Y or Press any key to Continue:- ");
            String new_choice=scanner.nextLine();
            if (new_choice.equals("Y")){
                flag=false;
            }
        }
    }
    }

