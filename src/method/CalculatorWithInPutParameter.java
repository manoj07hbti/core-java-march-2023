package method;

public class CalculatorWithInPutParameter {

    public void  addition(int a, int b){
       int add=a+b;
        System.out.println("print add value...."+add);

    }

    public void subtraction(int a, int b){
        int sub=a-b;
        System.out.println("print subtraction value...."+sub);

    }

    public void  multiplication(int a , int b){
        int multi = a*b;
        System.out.println("print multiplication...."+multi);

    }
    public void divide(int a, int b){

        int div = a/b;
        System.out.println(" print divide value...."+div);
    }

    public static void main(String[] args) {
        CalculatorWithInPutParameter obj =new CalculatorWithInPutParameter();
        obj.addition(45,78);
        obj.subtraction(34,45);
        obj.multiplication(87,56);
        obj.divide(34,12);
    }
}
