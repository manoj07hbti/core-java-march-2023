package Return_Type_Method;

import java.util.Scanner;

public class Calculator_App {


    public int add(int a,int b){
        int sum=a+b;
        return sum;

    }

    public int sub(int a,int b){
        int sub=a-b;
        return sub;


    }

    public int mul(int a,int b){
        int mul=a*b;
        return mul;

    }

    public int div(int a,int b){
        int div=a/b;
        return div;

    }
    public static void main(String[] args) {
        Calculator_App obj=new Calculator_App();
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;

        while (flag){
            System.out.println("Plz enter value A");
            int a=scanner.nextInt();
            System.out.println("Plz enter value b");
            int b=scanner.nextInt();

            System.out.println("+,-,*./");
            Scanner scanner1=new Scanner(System.in);
            String Choice=scanner1.nextLine();

            if (Choice.equals("+")){
                System.out.println("Addition "+obj.add(a,b));
            }else if (Choice.equals("-")){
                System.out.println("Sub "+obj.sub(a,b));
            } else if (Choice.equals("*")){
                System.out.println("Mul "+obj.mul(a,b));
            } else if (Choice.equals("/")){
                System.out.println("Div "+obj.div(a,b));
            }
            System.out.println("y");
            String new_Choice=scanner1.nextLine();
            if (new_Choice.equals("y")){
                flag=false;

            }





        }




    }
}
