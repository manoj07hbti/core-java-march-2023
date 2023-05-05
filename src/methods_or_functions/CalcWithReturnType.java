package methods_or_functions;

public class CalcWithReturnType {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public int addition(int a, int b){

        int sum=a+b;

        return sum;
    }

    public int sub(int a, int b){

        int sub=a-b;

        return sub;
    }


    public static void main(String[] args) {

        CalcWithReturnType obj= new CalcWithReturnType();

       int output= obj.addition(34,234);
        System.out.println("Addition is "+output);

        output= obj.sub(33,6);
        System.out.println("Subtraction is : "+output);

    }
}
