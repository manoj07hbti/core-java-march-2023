package methods_or_function;
// make the Calculator with Choice Project & Also using the type casting method & Make the Project
public class Calculator_Choice_Project {
    public int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int subtract(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int multiply(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public double divide(int a, int b) {    // Using of Type Casting for Change the Datatype value
        double div =(double) a / b;
        return div;
    }
    public void checkChoice(int choice,Calculator_Choice_Project obj){
        if (choice == 1) {
            System.out.println("Addition of Number :- " + obj.addition(24, 23));
        } else if (choice == 2) {
            System.out.println("Subtract of Number :- " + obj.subtract(34, 12));
        } else if (choice == 3) {
            System.out.println("Multiply of Number is:- " + obj.multiply(12, 8));
        } else if (choice==4) {
            System.out.println("Divide of Number is:- "+obj.divide(100,12));
        }
    }

    public static void main(String[] args) {
        Calculator_Choice_Project obj=new Calculator_Choice_Project();
        obj.checkChoice(2,obj);
        obj.checkChoice(1,obj);
        obj.checkChoice(3,obj);
        obj.checkChoice(4,obj);
        }
    }

