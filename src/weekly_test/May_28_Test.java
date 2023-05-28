package weekly_test;

import java.util.Scanner;

public class May_28_Test {
    public int armstrongNumber(){
        //NUMBER IS ARMSTRONG OR NOT

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
        return a;
    }

    public static void main(String[] args) {
        May_28_Test obj=new May_28_Test();
        obj.armstrongNumber();
    }
}
