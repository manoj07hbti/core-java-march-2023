package data_manipulation;

import org.omg.CORBA.OBJ_ADAPTER;

public class Calculator {
     public void add(){
         int a=10;
         int b=15;
         int sum=a+b;
         System.out.println(" Addition of two num is :" +sum);
     }
     public void substraction() {
         int a=30;
         int b=12;
         int subs=a-b;
         System.out.println(" substraction of two num is :" +subs);

     }
     public void multiplication(){
         int a=10;
         int b=5;
         int c=20;
         int multi=a*b*c;
         System.out.println(" Multiplication of two num is :" +multi);
         }
         // fin d percentage
    public void FindPercetage(){
         int num=800;
         int percent_rate=40;
         int percent=(num*percent_rate)/100;
        System.out.println(" 40 % percent of 800 is :" +percent);
    }

    public static void main(String[]args){
         Calculator obj=new Calculator();
         // CALLING  METHOD indise main method
        obj.add();
        obj.substraction();
        obj.multiplication();
        obj.FindPercetage();

    }
}

