package method_or_function;

public class CalculatorWithParameter {

    public void addition(int a, int b) {
    int add = a+b ;
        System.out.println(" addition is " + add);
    }
    public void subtraction(int a, int b) {
        int sub = a - b;
        System.out.println("subtraction is " + sub);
    }
    public void multiply(int a, int b) {
        int multi = a * b;
        System.out.println("multiply is " + multi);
    }
    public void divide(int a, int b) {
        int divide = a / b;
        System.out.println("divide is " + divide);
    }
        public void percentage (int a , int b) {
            int percentage = (a * b) / 100;
            System.out.println("percentage is " + percentage);
        }

    public static void main(String[] args) {
        CalculatorWithParameter obj = new CalculatorWithParameter();
        obj. addition (45,35);
        obj. subtraction (140,26);
        obj .multiply (4,15);
        obj .divide (45,9);
        obj . percentage (1000,40);


    }


    }


