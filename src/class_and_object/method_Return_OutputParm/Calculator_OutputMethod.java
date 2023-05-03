package class_and_object.method_Return_OutputParm;

public class Calculator_OutputMethod {
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int sub(int a,int b){
        int sub=a+b;
        return sub;
    }
    public int multi(int a,int b){
        int multi=a*b;
        return multi;
    }
    public double div(int a ,int b){
        double div=a*b;
        return div;
    }

    public static void main(String[] args) {
        Calculator_OutputMethod obj=new Calculator_OutputMethod();

        int addResult = obj.add(78,56);
        System.out.println("the sum of a and b : "+addResult);

        int subResult=obj.sub(1000,53);
        System.out.println("the subtraction of a and b : "+subResult);

        int multiResult=obj.multi(78,52);
        System.out.println("the multiplication of a and b : "+multiResult);

        double divResult = obj.div(73,2);
        System.out.println("the division of a and b : "+divResult);

    }
}
