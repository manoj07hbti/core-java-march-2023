package assignment;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args){

        int number, arm=0,reminder, a;
        System.out.println("ENTER THE 3 DIGIT NUMBER");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        a=number;
        while(number>0){
            reminder=number%10;
            arm=reminder*reminder*reminder+arm;
            number=number/10;
        }
        if(a==arm){
            System.out.println("THE NUMBER "+a +" IS AN ARMSTRONG NUMBER");
        }else{
            System.out.println("THE NUMBER "+a +" IS NOT AN ARMSTRONG NUMBER");
        }
    }
}
