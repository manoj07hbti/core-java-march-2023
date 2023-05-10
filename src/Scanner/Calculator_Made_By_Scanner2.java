package Scanner;

import java.util.Scanner;

public class Calculator_Made_By_Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b =sc.nextInt();
        System.out.println("Enter an operator do you want to calculator (+,-,*,/,%)");
        char op = sc.next().charAt(0);
        switch (op){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '/': System.out.println(a/b);
                break;
            case '%': System.out.println(a%b);
                break;
            default:System.out.println("invalid input");
        }
    }
}
