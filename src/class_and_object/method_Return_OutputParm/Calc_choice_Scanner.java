package class_and_object.method_Return_OutputParm;

import java.util.Scanner;

public class Calc_choice_Scanner {
    public int addition(int a, int b){
        int sum = a+b;
        return sum;
    }
    public int subtraction(int a,int b){
        int sub = a-b;
        return sub;
    }
    public int multiplication(int a, int b){
        int multi = a*b;
        return multi;
    }
    public double division(int a,int b){
        double div = (double)a/b;
        return div;
    }
    public void checkOperation(Calc_choice_Scanner obj){
        Scanner scanner=new Scanner(System.in); // CREATING OBJECT OF SCANNER


        System.out.println("ENTER THE VALUE OF A : ");
        int a = scanner.nextInt();       //input for value of A

        System.out.println("ENTER THE VALUE OF B : ");
        int b = scanner.nextInt();      //input for value of B

        System.out.println("ENTER THE OPERATOR TO PERFORM OPERATION FROM + , - , * , / ");
        String choice= scanner.nextLine();     //input for operation

        if(choice.equals("+")){
            System.out.println("THE ADDITION OF "+a +" AND " +b +" : "+obj.addition(a,b ));
        }else if(choice.equals("-")){
            System.out.println("THE SUBTRACTION OF "+a +" AND " +b +" : " + obj.subtraction(a,b));
        }else if(choice.equals("*")) {
            System.out.println("THE MULTIPLICATION OF "+a +" AND " +b +" : "+ obj.multiplication(a,b));
        }else if(choice.equals("/")){
            System.out.println("THE DIVISION OF "+a +"AND" +b +" : "+obj.division(a,b));
        }else{
            System.out.println("PLEASE ENTER THE CORRECT INPUT ");
        }
    }

    public static void main(String[] args) {

        Calc_choice_Scanner obj=new Calc_choice_Scanner();
        obj.checkOperation(obj);
    }
}
