package class_and_object.method_Return_OutputParm;

import java.util.Scanner;

public class Calc_with_Scanner {
    public int addition(int a, int b){
        int sum = a+b;
        return sum;
    }
    public int subtraction(int a,int b){
        int sub = a+b;
        return sub;
    }
    public int multiplication(int a, int b){
        int multi = a*b;
        return multi;
    }
    public double division(int a,int b){
        double div = (double)a/b;
        return div;
    }
    public void checkOperation(String choice,Calc_with_Scanner obj){
        Scanner scanner=new Scanner(System.in);
        choice=scanner.nextLine();
        System.out.println("ENTER THE VALUE OF A : ");
        int a = scanner.nextInt();
        System.out.println("THE VALUE OF A : "+a);

        System.out.println("ENTER THE VALUE OF B : ");
        int b = scanner.nextInt();
        System.out.println("THE VALUE OF B : "+b);

        if(choice=="+"){
            System.out.println("THE ADDITION OF A AND B IS :"+obj.addition(a,b));
        }else if(choice=="-"){
            System.out.println("THE ADDITION OF A AND B IS :" + obj.subtraction(a,b));
        }else if(choice=="*") {
            System.out.println("THE MUTIPLICATION OF A AND B IS :" + obj.multiplication(a,b));
        }else{
            System.out.println("THE DIVISION OF A AND B IS : "+obj.division(a,b));
        }
    }

    public static void main(String[] args) {

        Calc_with_Scanner obj=new Calc_with_Scanner();
        obj.checkOperation(choice,obj);
    }
}
