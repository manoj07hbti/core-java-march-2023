package test;

import java.util.Scanner;



public class Test_28_may_2023_Palindrome_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int n =in.nextInt();
       int t = n;
        int rev = 0;

        while (t != 0)
        {
            int d = t%10;
            rev=10*rev+d;
            t=t/10;

        }
        if (rev==n)
            System.out.println(n+ " palindrome Number");
        else
          System.out.println(n+ " Not Palindrome Number");
    }
}
