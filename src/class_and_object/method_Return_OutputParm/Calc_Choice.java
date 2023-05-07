package class_and_object.method_Return_OutputParm;

import java.util.StringJoiner;

public class Calc_Choice {
    public int addition(int a,int b){
       int sum=a+b;
        return sum;
    }
    public int subtraction(int a , int b){
        int sub=a+b;
        return sub;
    }
    public int multipliction(int a, int b){
        int multi=a*b;
        return multi;
    }
    public double division(int a,int b){
        double div=(double)a/b;
        return div;
    }
    public void checkopeartion(String choice, Calc_Choice obj){
        if(choice=="+"){
            System.out.println("THE ADDITION IS : "+obj.addition(78,48));
        }else if(choice=="-"){
            System.out.println("THE SUBTRACTION IS : "+obj.subtraction(45,88));
        }else if(choice=="*"){
            System.out.println("THE MULTIPLICATION IS : "+obj.multipliction(78,15));
        }else{
            System.out.println("THE DIVISION IS : "+obj.division(5,2));
        }
    }

    public static void main(String[] args){
        Calc_Choice obj=new Calc_Choice();
        obj.checkopeartion("+",obj);
        obj.checkopeartion("*",obj);
        obj.checkopeartion("5",obj);

    }
}
