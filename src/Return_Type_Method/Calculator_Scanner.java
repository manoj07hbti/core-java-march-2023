package Return_Type_Method;

import java.awt.*;

public class Calculator_Scanner {
    public int add(int a,int b){
        int sum= a+b;
        return sum;

    }
    public int sub(int a, int b){
        int sub=a-b;
        return sub;

    }

    public int mul(int a,int b){
        int mul=a*b;
        return mul;

    }

    public int div(int a,int b){
        int div=a/b;
        return div;

    }
    public void CheckChoice(String choice,Calculator_Scanner obj){
        if (choice.equals("+")){
            System.out.println("Add the number: "+obj.add(87,98));
        }else if (choice.equals("-")){
            System.out.println("Sub the number: "+obj.sub(90,65));
        }else if (choice.equals("*")){
            System.out.println("Mul the number: "+obj.mul(77,66));
        }else if (choice.equals("/")){
            System.out.println("Div the number: "+obj.div(879,76));
        }
    }

    public static void main(String[] args) {
        Calculator_Scanner obj=new Calculator_Scanner();
        obj.CheckChoice("+",obj);
        obj.CheckChoice("-",obj);
        obj.CheckChoice("*",obj);
        obj.CheckChoice("/",obj);
    }

    }

