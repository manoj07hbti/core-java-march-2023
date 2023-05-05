package method_or_function;

import javafx.util.converter.PercentageStringConverter;

public class CalculatorMethodWithReturnType {


    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public int addition(int a, int b){

        int sum=a+b;

        return sum;
    }

    public int sub(int a, int b){

        int sub=a-b;

        return sub;
    }
public  int multiply(int a, int b){

        int multi = a*b;

        return multi;
}
public int divide (int a, int b) {

    int div = a / b;

    return div;
}
public int percentage(int a , int  b){

        int per = a*b/100;
        return per ;



    }

    public static void main(String[] args) {

        CalculatorMethodWithReturnType obj = new CalculatorMethodWithReturnType();

        int output = obj.addition(4522, 4587);
        System.out.println("Addition is " + output);

        output = obj.sub(1500, 698);
        System.out.println("Subtraction is : " + output);

        output = obj.multiply(8,12);
        System.out.println("Multiply is "+output);

        output = obj.divide(80,8);
        System.out.println("Divide is "+output);

        output = obj.percentage(1200,4);
        System.out.println("Percentage is "+output);
    }
    }
