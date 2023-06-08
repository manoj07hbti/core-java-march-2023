package assignment;

public class Fibonacci_Series {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 FIBONACCI SERIES
        int a=0, b=1, c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=
                10;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
