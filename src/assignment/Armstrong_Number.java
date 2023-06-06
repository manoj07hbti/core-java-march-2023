package assignment;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args){

        int num=371, arm = 0, reminder, a;
        a=num;
        while(num>0){
            reminder = num%10; // 1
            arm = reminder*reminder*reminder+arm;
            num = num/10;
        }
        if(a==arm){
            System.out.println("THE NUMBER "+a +" IS AN ARMSTRONG NUMBER");
        }else{
            System.out.println("THE NUMBER "+a +" IS NOT AN ARMSTRONG NUMBER");
        }
    }
}
