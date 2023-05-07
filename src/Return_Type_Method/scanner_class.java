package Return_Type_Method;

import java.util.Scanner;

public class scanner_class {
    public void Input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Plz mention your name");
        String name=scanner.nextLine();
        System.out.println("My Name is "+name);

        System.out.println("plz mention your age ");
        int age=scanner.nextInt();
        System.out.println("my age is "+age);

        System.out.println("plz mention your salary");
        double salary=scanner.nextDouble();
        System.out.println("My salary is "+salary);
    }

    public static void main(String[] args) {
        scanner_class obj= new scanner_class();
        obj.Input();
    }
}
