package Scanner;

import java.util.Scanner;

public class Calculator_Made_By_Scanner {
    public int addition(int a, int b){
        int sum=a+b;
        return sum;
    }
    public int sub(int a, int b){
        int sub=a-b;
        return sub;
    }
    public  int multiply(int a, int b){
        int multi = a*b;
        return multi;
    }
    public int divide (int a, int b) {
        int div = a / b;
        return div;
    }
    public int percentage(int a , int  b) {
        int per = a * b / 100;
        return per;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a= scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b= scanner.nextInt();
Calculator_Made_By_Scanner obj = new Calculator_Made_By_Scanner();
        System.out.println("Addi is "+obj.addition(a,b));
        System.out.println("sub is "+obj.sub(a,b));
        System.out.println("multi is "+obj.multiply(a,b));
        System.out.println("divide is "+obj.divide(a,b));
        System.out.println("per is "+obj.percentage(a,b));
    }
}
