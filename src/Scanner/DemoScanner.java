package Scanner;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class DemoScanner {

    // This method will take String input:
    public void userInput () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String name = scanner.nextLine();
        System.out.println("You have entered name as " + name);

        ///     input reading  ///           ///
        System.out.println("Please enter you age ");
        int age = scanner.nextInt();
        System.out.println("You have entered age as " + age);


        ///    reading decimal value ///      ///
        System.out.println("Please enter your salary: ");
        double salary= scanner.nextDouble();
        System.out.println("You have entered salary as "+salary);


    }

    public static void main(String[] args) {
        DemoScanner obj= new DemoScanner();
        obj.userInput();

    }

    }



