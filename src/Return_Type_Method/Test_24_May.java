package Return_Type_Method;

import java.util.Scanner;

public class Test_24_May {

    public int add (int a, int b) {
        int sum =a+b;
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
        Test_24_May obj=new Test_24_May();
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;

        while (flag){
            System.out.println("plz enter value A");
            int a=scanner.nextInt();
            System.out.println("plz enter value B");
            int b=scanner.nextInt();

            System.out.println("plz enter your choice");
            Scanner scanner1=new Scanner(System.in);
            int Choice=scanner1.nextInt();
            if (Choice==10){
                System.out.println("add"+obj.add(a,b));
            }else if (Choice==20){
                System.out.println("sub"+obj.sub(a,b));
            }else if (Choice==30){
                System.out.println("mul"+obj.mul(a,b));
            }else if (Choice==40){
                System.out.println("div"+obj.div(a,b));
            }


            Scanner scanner2=new Scanner(System.in);
            System.out.println("yes");
            String new_Choice1=scanner2.nextLine();
            if (new_Choice1.equals("yes")){
                flag=false;
            }
        }
    }
}
