package assignment;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        num=scanner.nextInt();
        int rev=0;
        int z=num;

        while(num>0){
            rev=(rev*10)+num%10;
            num=num/10;
        }
        if(z==rev){
            System.out.println(z+" IS PALINDROME NUMBER");
        }else{
            System.out.println(z +" IS NOT PALINDROME NUMBER");
        }
    }
}
