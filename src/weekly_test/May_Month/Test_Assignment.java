package weekly_test.May_Month;

import java.util.Scanner;

public class Test_Assignment {
    // Write a calculator App with Scanner
    //ask user for choice : 5 for addition 10 for subtraction , 15 - for multiply and 20 for divide

    public void addition(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of :- a");
        int a=scanner.nextInt();
        System.out.println("Enter the value of :- b");
        int b=scanner.nextInt();
        int sum=a+b;
        System.out.println("Value of Addition:- "+sum);

    }

    public void subtraction(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of :- a");
        int a=scanner.nextInt();
        System.out.println("Enter the value of :- b");
        int b=scanner.nextInt();
        int sub=a-b;
        System.out.println("Value of subtraction:- "+sub);

    }

    public void multiply(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of :- a");
        int a=scanner.nextInt();
        System.out.println("Enter the value of :- b");
        int b=scanner.nextInt();
        int multi=a*b;
        System.out.println("Value of Multiply:- "+multi);

    }

    public void divide(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of :- a");
        int a=scanner.nextInt();
        System.out.println("Enter the value of :- b");
        int b=scanner.nextInt();
        int div=a/b;
        System.out.println("Value of Divide:- "+div);
    }

    public void choice(Test_Assignment obj){
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Please Enter your Choice:- ");
        int choice=scanner1.nextInt();
        if (choice==5){
          obj.addition();
        } else if (choice==10) {
            obj.subtraction();
        } else if (choice==15) {
            obj.multiply();
        } else if (choice==20) {
            obj.divide();
        }
    }

    public static void main(String[] args) {
        Test_Assignment obj=new Test_Assignment();
        obj.choice(obj);
    }
}
