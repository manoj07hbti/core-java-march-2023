package weekly_test_2023;

import java.util.Scanner;

public class PalindromeNumberWithScanner {
    public static void main(String[] args) {
        int num,reversednum=0,r,c;
        System.out.println("please enter number");
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        c=num; // c is new variable for comparing with reversed  variabble
        while (num!=0){
            r=num%10;
            reversednum=(reversednum*10)+r;
            num/=10;
        }
        if (c==reversednum){
            System.out.println("numer is palindrome");
        }else
            System.out.println("numer is not palindrome");

    }
}
