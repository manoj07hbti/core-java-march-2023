package class_and_object.method_Return_OutputParm;
import java.util.Scanner;

public class CalcApp_with_Whileloop {
    public int addition(int a , int b){
        int sum=a+b;
        return sum;
    }
    public int subtraction(int a,int b){
        int sub=a-b;
        return sub;
    }
    public int multiplication(int a,int b){
        int multi=a*b;
        return multi;
    }
    public int division(int a,int b){
        int div=a/b;
        return div;
    }
    public static void main(String[] args){
        CalcApp_with_Whileloop obj=new CalcApp_with_Whileloop();
        Scanner scanner=new Scanner(System.in);

        boolean flag=true;
        while(flag) {
            System.out.println("ENTER THE VALUE OF A");
            int a = scanner.nextInt();

            System.out.println("ENTER THE VALUE OF B");
            int b = scanner.nextInt();

            Scanner scanner1=new Scanner(System.in);
            System.out.println("ENTER THE SYMBOL TO PERFORM OPERATION FROM +,-,*,/");
            String choice = scanner1.nextLine();

            if (choice.equals("+")) {
                System.out.println("THE ADDITION OF A AND B : " + obj.addition(a, b));
            } else if (choice.equals("-")) {
                System.out.println("THE SUBTRACTION OF A AND B : " + obj.subtraction(a, b));
            } else if (choice.equals("*")) {
                System.out.println("THE MULTIPLICATION OF A AND B : " + obj.multiplication(a, b));
            } else {
                System.out.println("THE DIVISION OF A AND B : " + obj.division(a, b));
            }

            System.out.println("Do you want to exit the calculator,\nif yes enter Y\nif no press any key");
            Scanner scanner2=new Scanner(System.in); //
            String newChoice = scanner2.nextLine();
            if (newChoice.equals("Y")||newChoice.equals("y"))
                flag = false;
        }

    }
}
