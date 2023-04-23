package Assignment_Call_Method;

public class Using_Parameter_Method_call {
    // Using Method with Parameter Cube

    public void cube(int a){
        int cube=a*a*a;
        System.out.println(" Assingment cube:" +cube);

    }

    public void addition(int a,int b, int c,int d){
        int sum=a+b+c+d;
        System.out.println(" Addition with integer "+ sum);

    }

    public void subtraction(int c,int h){
        int sub=c-h;
        System.out.println(" Subtraction with Integer "+ sub);

    }

    public void Multiple(int a,int v){
        int Mul=a*v;
        System.out.println(" Multiple with Integer "+ Mul);

    }

    public void Divided(int a, int h){
        int Div=a/h;
        System.out.println(" Divided with Integer "+Div);

    }
    public static void main(String[] args) {
        Using_Parameter_Method_call obj=new Using_Parameter_Method_call();
        obj.cube(12);
        obj.cube(7);
        obj.cube(134);

        //Addition with Integer
        obj.addition(65,78,78,89);
        obj.addition(675,9876,4534,42363);
        obj.addition(98876,6765,97876,87656);

        // Substraction with Integer
        obj.subtraction(8987,766);
        obj.subtraction(987765,67788);

        // Multiple with Integer
        obj.Multiple(544,876);
        obj.Multiple(9876,87765);

        // Divided with integer
        obj.Divided(98,2);
        obj.Divided(10000,60);

    }
}
