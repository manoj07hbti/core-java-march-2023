package class_and_object;

public class Calculator_with_Method {
    public void add(){
        int a=22,b=85;
        int sum= a+b;
        System.out.println("sum of A and B : "+sum);
    }
    public void multiply(){
        int a=66,b=71;
        int multi=a*b;
        System.out.println("multiplication of A and B : "+multi);
    }
    public void sub(){
        int a=88,b=94;
        int sub=a-b;
        System.out.println("subtraction of A and B : "+sub);
    }
    public void div(){
        int a=789,b=74;
        double div=a/b;
        System.out.println("division of A and B : "+div);
    }
    public void percent(){
        int a=50000,b=15;
        int percent=(a*b)/100;
        System.out.println("percentage of A and B : "+percent );
    }
    public void square(){
        int a=42;
        int square=a*a;
        System.out.println("square of A : "+square);
    }
    public void cube(){
        int a=343;
        int square=a*a*a;
        System.out.println("cube of A : "+square);
    }

    public static void main(String[] args) {
        Calculator_with_Method obj=new Calculator_with_Method();
        obj.add();
        obj.div();
        obj.multiply();
        obj.sub();
        obj.percent();
        obj.square();
        obj.cube();
    }
}
