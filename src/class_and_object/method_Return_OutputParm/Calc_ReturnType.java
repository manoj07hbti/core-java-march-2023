package class_and_object.method_Return_OutputParm;

public class Calc_ReturnType {

    //creating method
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int subtraction(int a,int b){
        int sub=a+b;
        return sub;
    }
    public int multiplication(int a,int b){
        int multi=a*b;
        return multi;
    }
    public double division(int a,int b){
        int div=a/b;
        return div;
    }

    public static void main(String[] args) {
        Calc_ReturnType obj=new Calc_ReturnType();

        int choice=2;
        if(choice==1){
            System.out.println("THE ADDITION OF A AND B : "+obj.add(48,55));
        } else if (choice==2){
            System.out.println("THE SUBTRACTION OF A  AND B : "+obj.subtraction(78,15));
        } else if (choice==3) {
            System.out.println("THE MULTIPLICATION OF A AND B : "+obj.multiplication(78,55));
        }else{
            System.out.println("THE DIVISION OF A AND B : "+obj.division(99,5));
        }
    }
}
