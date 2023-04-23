package mytest;

public class Test_To_Check_Factorial {
    public static void main(String[] args) {
        int i,fact=1;
        int number=4;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

    }
}
