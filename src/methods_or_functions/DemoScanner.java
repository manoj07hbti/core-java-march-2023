package methods_or_functions;

import java.util.Scanner;

public class DemoScanner {

    //This method will take String input
    public void userInput(){

        Scanner scanner=new Scanner(System.in);// created object of Scanner class
        System.out.println("Please enter your Name: ");
        String name= scanner.nextLine();// this method will read String input and give you
        System.out.println("You have entered name as "+name);

        // reading int input
        System.out.println("Please enter your Age: ");
       int age= scanner.nextInt();// it will read integer value and return
        System.out.println("You have entered age as :"+age);
        // reading decimal value

        System.out.println("Please enter your salary: ");
        double salary= scanner.nextDouble();
        System.out.println("You have entered salary as "+salary);

    }


    public static void main(String[] args) {

        DemoScanner obj= new DemoScanner();
        obj.userInput();


    }
}
