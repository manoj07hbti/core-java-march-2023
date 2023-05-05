package Return_Type_Method;

public class Calculator_based_choice {

    // Calculator Based on Choice
    public int add(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public int sum(int a,int b){
        int sub=a - b;
        return sub;

    }

    public int mul(int a,int b){
        int mul=a * b;
        return mul;

    }

    public int div(int a,int b){
        int div=a /b;
        return div;

    }

    public static void main(String[] args) {
        Calculator_with_return_type obj=new Calculator_with_return_type();

        int choice=3;
        if (choice==1){
            System.out.println("Add number A and B: "+obj.add(7890,5467));
        }else if(choice==2){
            System.out.println("Sub number A and B: "+obj.sub(7654,87));
        } else if (choice==3){
            System.out.println("Multiple Number A and B: "+obj.mul(987,87));
        }else{
            System.out.println("Division Number A amd B: "+obj.div(88888,9));
        }


    }
}