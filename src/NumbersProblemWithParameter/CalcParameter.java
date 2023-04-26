package NumbersProblemWithParameter;

public class CalcParameter {
    public void addition(int a, int b){
        int add=a+b;
        System.out.println(" addition is " +add);
    }
    public void substraction(int a, int b){
        int sub=a-b;
        System.out.println("subtractin is " + sub);
    }
    public void multiplication(int a, int b){
        int mult=a*b;
        System.out.println( "multiplication is " +mult);
    }
    public void percretage(int a, int b){
        double percent=(a*b)/100;
        System.out.println( "percentage is "+ percent);
        }

    public static void main(String[] args) {
        CalcParameter obj=new CalcParameter();
        obj.addition(4,6);
        obj.substraction(50,20);
        obj.multiplication(5,4);
        obj.percretage(500,30);
    }

}



