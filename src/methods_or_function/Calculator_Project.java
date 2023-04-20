package methods_or_function;

public class Calculator_Project {
    public void addition(){
        int a=10;
        int b=12;
        int sum=a+b;
        System.out.println("Addtion of Given Number:- "+sum);
    }
    public void subtract(){
        int a=20;
        int b=11;
        int sub=a-b;
        System.out.println("Subtract of Given Number :- "+ sub);
    }

    public void multiply(){
        int a=12;
        int b=8;
        int multi=a*b;
        System.out.println("Multiply of Given Number :- "+multi);
    }

    public void divide(){
        int a=20;
        int b=2;
        int div=a/b;
        System.out.println("Divivde of Given Number :- "+div);
    }

    public void percentage(){
        int a=70;
        int b=30;
        int percentage=(a*b)/100;
        System.out.println("Percentage of Given Number :- "+percentage);
    }

    public static void main(String[] args) {
        Calculator_Project obj=new Calculator_Project();
        // Addition Funtion Calling=============================
        obj.addition();

        //Subtract Function Calling===============================
        obj.subtract();

        //Multiply Function Calling===============================

        obj.multiply();

        //Divide Function Calling===============================

        obj.divide();

        //Percentage Function Calling===============================

        obj.percentage();
    }
}
