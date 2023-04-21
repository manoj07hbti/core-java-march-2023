package assignment;


public class SwappingAssignment {
    public static void main(String[] args){
        //program for swapping two number without third variable
        int a=50;
        int b=200;
        System.out.println("a ="+a +" b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping");
        System.out.println("a = "+a + " b = "+b);
    }

}
