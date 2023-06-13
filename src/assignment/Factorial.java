package assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //5*4*3*2*1
        int num , fact=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        num=scanner.nextInt();
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);

    }
}
