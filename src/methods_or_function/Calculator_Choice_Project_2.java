package methods_or_function;

public class Calculator_Choice_Project_2 {
    public int addition(int a, int b){
        int sum=a+b;
        return sum;
    }

    public int subtract (int a, int b){
        int sub=a-b;
        return sub;
    }

    public int multiply(int a, int b){
        int multi=a*b;
        return multi;
    }

    public int divide(int a, int b){
        int div=a/b;
        return div;
    }
    public void checkChoice(String choice, Calculator_Choice_Project_2 obj){
        if(choice.equals("+")){
            System.out.println("Addition of Number:- "+obj.addition(12,23));
        } else if (choice.equals("-")){
            System.out.println("Subtraction of number :- "+ obj.subtract(36,11));
        } else if (choice.equals("*")){
            System.out.println("Multiply of number :- "+ obj.multiply(12,8));
        } else if (choice.equals("/")) {
            System.out.println("Divide of number :- "+obj.divide(36,2));
        }
    }

    public static void main(String[] args) {
     Calculator_Choice_Project_2 obj=new Calculator_Choice_Project_2();
     obj.checkChoice("+",obj);
     obj.checkChoice("-",obj);
     obj.checkChoice("*",obj);
     obj.checkChoice("/",obj);
    }
}
