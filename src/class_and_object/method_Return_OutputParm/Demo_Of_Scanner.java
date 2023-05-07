package class_and_object.method_Return_OutputParm;

import java.util.Scanner;

public class Demo_Of_Scanner {
    public void userInput(){
        Scanner scanner=new Scanner(System.in); // object of scanner class created
        System.out.println("ENTER YOUR NAME");
        String name = scanner.nextLine();//the method will STRING input
        System.out.println("THE ENTERED NAME IS "+name);

        //for INTEGER input
        System.out.println("ENTER YOUR AGE : ");
        int age = scanner.nextInt();
        System.out.println("ENTERED AGE IS : "+age);

        //for DOUBLE datatype input
        System.out.println("ENTER YOUR SALARY");
        double salary= scanner.nextDouble();
        System.out.println("ENTERED SALARY IS :"+salary);
    }

    public static void main(String[] args) {
        Demo_Of_Scanner obj=new Demo_Of_Scanner();
        obj.userInput();
    }

}
