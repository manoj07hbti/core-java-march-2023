package methods_or_functions;

public class CalcWithReturnType {

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
    public void checkOperation(int choice,CalcWithReturnType obj ){

        if(choice==1){
            System.out.println("Addition is : "+obj.addition(23,45));
        } else if(choice==2){
            System.out.println("Subtraction is "+obj.sub(34,4));
        }else if(choice==3){
            //TODO call multi
        } else {
            //TODO call divide
            System.out.println("Divide is "+obj.divide(10,3));
        }

    }

    public static void main(String[] args) {

        CalcWithReturnType obj= new CalcWithReturnType();
        obj.checkOperation(2,obj);
        obj.checkOperation(1,obj);
        obj.checkOperation(4,obj);



    }
}
