package method_or_function;

public class CalcWithReturnType_Choice {
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public int addition(int a, int b){

        int sum=a+b;

        return sum;
    }

    public int sub(int a, int b){

        int sub=a-b;

        return sub;
    }

    public double divide(int a, int b){

        double output=(double) a/b;

        return output;
    }
    public int multi(int a , int b){

        int multi = a*b;

        return multi;
    }
    public void checkOperation(int choice,CalcWithReturnType_Choice obj ){
         // TODO CALL ADDI
        if(choice==1){
            System.out.println("Addition is : "+obj.addition(8564,75));
            // TODO CALL SUB
        } else if(choice==2){
            System.out.println("Subtraction is "+obj.sub(4500,685));
            // TODO CALL MULTI
        }else if(choice==3) {
            System.out.println("Multi is " + obj.multi(55, 4));
            // TODO CALL DIVIDE
        }else if(choice==4) {
            System.out.println("Divide is "+obj.divide(115,4));
        }

    }

    public static void main(String[] args) {

        CalcWithReturnType_Choice obj = new CalcWithReturnType_Choice();
        obj.checkOperation(2, obj);
        obj.checkOperation(1, obj);
        obj.checkOperation(4, obj);
        obj.checkOperation(3,obj);
    }
    }
