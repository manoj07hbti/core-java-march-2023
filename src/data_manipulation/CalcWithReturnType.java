package data_manipulation;

public class CalcWithReturnType {
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
        CalcWithReturnType obj=new CalcWithReturnType();
        int output=obj.addition(69,50);
        System.out.println("addition "+output);

        output=obj.substarcation(400,150);
        System.out.println("substraction "+output);

        output=obj.multipication(50,30);
        System.out.println("multiplication "+output);

        double result=obj.division(1000,30);
        System.out.println("addition "+result);

    }
}
