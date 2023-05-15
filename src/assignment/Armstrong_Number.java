package assignment;

public class Armstrong_Number {
    public static void main(String[] args){

        int number=153, arm=0,reminder, a;
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
