package Return_Type_Method;

import java.util.Scanner;

public class Cal_Scanner_ {
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
    public void CheckOperation(Cal_Scanner_ obj){
        Scanner scanner=new Scanner(System.in);

        System.out.println("+,-,*,/");
        String Choice=scanner.nextLine();

        System.out.println("Value of A ");
        int a=scanner.nextInt();

        System.out.println("Value of B ");
        int b=scanner.nextInt();

        if (Choice.equals("+")){
            System.out.println("Add "+a+"and"+b+":"+obj.add(a,b));
        }else if (Choice.equals("-")){
            System.out.println("Sub "+a+"and"+b+":"+obj.sub(a,b));
        }else if (Choice.equals("*")){
            System.out.println("Mul "+a+"and"+b+":"+obj.mul(a,b));
        }else if (Choice.equals("/")){
            System.out.println("Div "+a+"and"+b+":"+obj.div(a,b));
        }

    }

    public static void main(String[] args) {
        Cal_Scanner_ obj=new Cal_Scanner_();
        obj.CheckOperation(obj);
    }

}
