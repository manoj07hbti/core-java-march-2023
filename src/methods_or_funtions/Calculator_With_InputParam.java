package methods_or_funtions;

public class Calculator_With_InputParam {
public void add(int a , int b){
    int sum=a+b;
    System.out.println("addition of given number: "+sum);

}
public void sub( int a , int b){
    int subtract=a-b;
    System.out.println("Subtract of given number: "+subtract);
}
public void multi(int a , int b){
    int multiply=a*b;
    System.out.println("Multiply of given number: "+multiply);
}
public void div(int a , int b){
    int divide=a/b;
    System.out.println("Division of given number: "+divide);
}

    public static void main(String[] args) {
        Calculator_With_InputParam obj=new Calculator_With_InputParam();
        obj.add(30 ,30);
        obj.sub(40,20);
        obj.multi(20,30);
        obj.div(20,10);
    }
}
