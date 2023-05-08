package methods_or_function;

import java.util.Scanner;

public class Scanner_Class_Project {
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
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the value of :- a");
        int a= scanner.nextInt();
        System.out.println("Please enter the value of :- b");
        int b= scanner.nextInt();

        Scanner_Class_Project obj=new Scanner_Class_Project();
        System.out.println("Addition is :-"+obj.addition(a,b));
        System.out.println("Subtract is :- "+obj.subtract(a,b));
        System.out.println("Multiply is :- "+obj.multiply(a,b));
        System.out.println("Divide is :- "+ obj.divide(a,b));
    }
}
