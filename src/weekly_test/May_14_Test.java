package weekly_test;

import java.util.Scanner;

public class May_14_Test {
    // Calculator app
    public int addition(int a, int b){
        int sum = a+b;
        return sum;
    }
    public int subtraction(int a,int b){
        int sub=a-b;
        return sub;
    }
    public int multiplication(int a, int b){
        int multi = a*b;
        return multi;
    }
    public double division(int a,int b){
        double div=a/b;
        return div;
    }
    public void CheckOperation(May_14_Test obj){
        Scanner scanner1=new Scanner(System.in); // creating first object of scanner
        Scanner scanner2=new Scanner(System.in); // creating second object of scanner
        for(int i=1;i>0;i++) {
            System.out.println("ENTER THE VALUE OF A");
            int a = scanner1.nextInt(); // for input of A

            System.out.println("ENTER THE VALUE OF B");
            int b = scanner1.nextInt(); // for input of B

            System.out.println("ENTER THE NUMBER OF OPERATOR FOR CALCULATION");
            System.out.println("3 FOR SUBTRACTION\n6 for SUBTRACTION\n9 FOR MULTIPLY\n12 FOR DIVIDE");
            int choice = scanner1.nextInt(); // input value for operation5


            if (choice == 3) {
                System.out.println("THE ADDITION OF " + a + " AND " + b + " :" + obj.addition(a, b));
            } else if (choice == 6) {
                System.out.println("THE SUBTRACTION OF " + a + " AND " + b + " :" + obj.subtraction(a, b));
            } else if (choice == 9) {
                System.out.println("THE MULTIPLICATION OF " + a + " AND " + b + " :" + obj.multiplication(a, b));
            } else if (choice == 12) {
                System.out.println("THE DIVISION OF " + a + " AND " + b + " :" + obj.addition(a, b));
            } else {
                System.out.println("PLEASE ENTER THE CORRECT OPERATION NUMBER ");
            }

            System.out.println("DO YOU WANT TO EXIT THE CALCULATOR ? IF YES PRESS (Y), IF NO PRESS ANY KEY");
            String newChoice=scanner2.nextLine();
            if(newChoice.equals("Y") ||newChoice.equals("y")){
                break;
            }
        }
    }
    public static void main(String[] args){
        May_14_Test obj=new May_14_Test();
        obj.CheckOperation(obj);
    }

}
