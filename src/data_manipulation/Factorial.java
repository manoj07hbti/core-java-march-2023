package data_manipulation;

public class Factorial {
    public static int FindFactorial(int n){
        if (n==1)
        {
            return 1;
        }else return n*FindFactorial(n-1);
    }
    public static void main(String[]args){
        System.out.println(" factorial of this number is :" + FindFactorial(4));
    }
}
