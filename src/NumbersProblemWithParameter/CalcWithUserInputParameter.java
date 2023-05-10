package NumbersProblemWithParameter;

import java.util.Scanner;

public class CalcWithUserInputParameter {
    public int addition(int a,int b){
        int add=a+b;
        return add;
    }
    public int substarcation(int a,int b){
        int sub=a-b;
        return sub;
    }
    public int multipication(int a,int b){
        int mult=a*b;
        return mult;
    }
    public double division(double a, double b){
        double div=a/b;
        return div;
    }

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        CalcWithUserInputParameter obj=new CalcWithUserInputParameter();

        String flag="Y";
        while (flag.equals("Y")){
            System.out.println("Please Enter 1-addition, 2-substraction,3-multiplication,4-division");
            int choice = scr.nextInt();
            System.out.println(" entre value of a ");
            int a=scr.nextInt();
            System.out.println("please entre value of b");
            int b=scr.nextInt();

            if (choice==1){
                int result=obj.addition(a,b);
                System.out.println("addition of a and b is :"+result);
            } else if (choice==2) {
                int result=obj.substarcation(a,b);
                System.out.println("substraction from a to b is :"+result);
            } else if (choice==3) {
                int result=obj.multipication(a,b);
                System.out.println("multiplication of a  and b is :"+result);
            } else if (choice==4) {
                double result=obj.division(a,b);
                System.out.println("division of a by b is :"+result);
            }
            Scanner scr2=new Scanner(System.in);
            System.out.println("press Y for continue or press any button for Exit");
            flag=scr2.nextLine();



        }
    }


}
