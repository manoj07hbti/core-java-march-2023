package methods_or_functions;

import java.util.Scanner;

public class CalcScanner {
    public int addition(int a, int b){

        int sum=a+b;

        return sum;
    }

    public int sub(int a, int b){

        int sub=a-b;

        return sub;
    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter value of a: ");
        int a= scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b= scanner.nextInt();

        CalcScanner obj= new CalcScanner();
        System.out.println("Addition is : "+obj.addition(a,b));

    }
}
