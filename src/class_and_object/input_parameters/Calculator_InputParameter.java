package class_and_object.input_parameters;

public class Calculator_InputParameter {
    public void add(int a,int b){
        int sum=a+b;
        System.out.println(a + "+" +b + " = " +sum);
    }
    public void sub(int a, int b){
        int sub=a-b;
        System.out.println(a +"-"+b+" = "+sub);
    }
    public void multi(int a,int b){
        int multi=a*b;
        System.out.println(a+"*"+b +" = " +multi);
    }
    public void div(int a,int b){
        int div=a/b;
        System.out.println(a+"/"+b+" = "+div);
    }
    public void percentage(int a,int b){
        int percent=(a*b)/100;
        System.out.println(percent);
    }
    public static void main(String args[]){
        Calculator_InputParameter obj=new Calculator_InputParameter();
        obj.add(80,45);
        obj.div(45,5);
        obj.multi(15,5);
        obj.sub(108,77);
        obj.percentage(1080,10);
    }
}