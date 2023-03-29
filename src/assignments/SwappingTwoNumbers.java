package assignments;

public class SwappingTwoNumbers {
    public static void main(String []args){
        int a=20;
        int b=30;
        // swap two numbers without creating third variable
        a=a+b;// that means a=50
        b=a-b;//that means b=20
        a=a-b;// that means a=30
        System.out.println("swap variable a: "+a);
        System.out.println("swap variable b: "+b);
    }
}
