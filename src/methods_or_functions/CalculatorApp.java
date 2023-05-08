package methods_or_functions;

import java.util.Scanner;

public class CalculatorApp {

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
    public static void main(String[] args) {

        CalculatorApp obj= new CalculatorApp();
        Scanner scanner= new Scanner(System.in);
        boolean flag=true;

      while(flag){
          System.out.println("Please enter value of a: ");
          int a =scanner.nextInt();
          System.out.println("Please enter value of b: ");
          int b= scanner.nextInt();

          System.out.println("Please enter choice : + , - , * and / ");
          Scanner scanner1= new Scanner(System.in);
          String choice=scanner1.nextLine();

          if(choice.equals("+")){
              System.out.println("Addition is :"+ obj.addition(a,b));
          } else if (choice.equals("-")) {
              System.out.println("Subtraction  is :"+ obj.sub(a,b));
          } else if (choice.equals("*")) {
              //todo
          } else {
              System.out.println("Divide  is :"+ obj.divide(a,b));
          }

          System.out.println("Do you want to close Calculator App? press Y to exit or press any other key to continue");
         String new_choice=scanner1.nextLine();
         if(new_choice.equals("Y")){
             flag=false;
         }
      }

    }
}
