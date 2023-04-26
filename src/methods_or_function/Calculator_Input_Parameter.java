package methods_or_function;

public class Calculator_Input_Parameter {
    public void addition (int a, int b){
        int sum=a+b;
        System.out.println("Addition of Number is "+sum);
    }
    public void subtract (int a,int b){
        int sub=a-b;
        System.out.println("Subtract of Number is "+ sub);
    }
    public void multiply(int a, int b){
        int multi=a*b;
        System.out.println("Multiply of Number is "+multi);
    }

    public void divide (int a, int b){
        int div=a/b;
        System.out.println("Divide of Number is "+div);
    }

    public static void main(String[] args) {
        Calculator_Input_Parameter obj=new Calculator_Input_Parameter();
        obj.addition(15,34);
        obj.subtract(34,22);
        obj.multiply(21,4);
        obj.divide(24,2);
    }
}
