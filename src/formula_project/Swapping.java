package formula_project;

public class Swapping {
    public static void main(String[] args) {
        System.out.println("Before Swapping");
        int a=10;
        int b=15;
        a=a+b;// its mean value a=35
        b=a-b;//its mean value b= 10
        a=a-b;//its mean Value a=15
        System.out.println("Swap Variable a:- "+a);
        System.out.println("Swap variable b:- "+b);
    }
}
