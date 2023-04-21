package methods_or_funtions;

public class Calculator {
    public void addition(){
        int a=30;
        int b=40;
        int sum=a+b;
        System.out.println(" Sum of a and b:- "+sum);
    }
    public void subtract(){
        int c=40;
        int d=30;
        int sub=c-d;
        System.out.println(" subtract of given number:- "+sub);
    }
    public void multiply(){
        int e=30;
        int f=20;
        int multi=e*f;
        System.out.println(" Multiply of given number:- "+multi);
    }
    public void divide(){

    int g=30;
    int h=10;
    int divide=g/h;
    System.out.println(" Divide of g and h:- "+divide);
    }
    public void percentage(){
        int i=400;
        int j=20;
        int per=i*j/100;
        System.out.println(" Percentage of i and j:- "+per);
    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.addition();
        obj.subtract();
        obj.divide();
        obj.multiply();
        obj.percentage();
    }
}
