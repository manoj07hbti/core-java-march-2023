package methods_or_funtions;

public class Calculator_With_Return_Type {

    public int addition(int a, int b){

        int sum=a+b;

        return sum;
    }

    public int sub(int a, int b){

        int sub=a-b;

        return sub;
    }
public int multiply( int a, int b){
        int multi=a*b;
        return multi;
}
    public double divide(int a, int b){

        double output=(double) a/b;

        return output;
    }
    public void checkCondition(int choice,Calculator_With_Return_Type obj ){

        if(choice==1){
            System.out.println("Addition is : "+obj.addition(20,30));
        } else if(choice==2){
            System.out.println("Subtraction is: "+obj.sub(40,25));
        }else if(choice==3){
            System.out.println("Multiply is: "+obj.multiply(3,4));
        } else if(choice==4) {
            System.out.println("Divide is: "+obj.divide(15,7));
        }

    }

    public static void main(String[] args) {

        Calculator_With_Return_Type  obj= new Calculator_With_Return_Type();
        obj.checkCondition(1,obj);
        obj.checkCondition(2,obj);
        obj.checkCondition(3,obj);
        obj.checkCondition(4,obj);


    }
}
