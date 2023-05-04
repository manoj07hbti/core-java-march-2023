package methods_or_function;

public class Calculator_Output_Parameter {
    public int addition (int a,int b){
        int sum= a+b;
        return sum;
    }
    public int subtract(int a, int b){
        int sub=a-b;
        return sub;
    }
    public int multiply (int a, int b){
        int multi=a*b;
        return multi;
    }
    public int div(int a, int b){
        int div=a/b;
        return div;
    }

    public static void main(String[] args) {
        Calculator_Output_Parameter obj=new Calculator_Output_Parameter();
       int add= obj.addition(3,2);
        System.out.println("Addition of given number is :- "+add);
       int subtract=obj.subtract(10,4);
        System.out.println("Subtract of given number is :- "+subtract);
        int multiply=obj.multiply(3,12);
        System.out.println("Multiply of given number is :- "+ multiply);
        int divide= obj.div(60,12);
        System.out.println("Divide of given number is :- "+ divide);
    }
}
