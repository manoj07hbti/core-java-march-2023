package Practice;

public class Even_Odd_input_Noreturn {
    // using input param with No Return type
    public void eveOdd(int num){
     if (num%2==0){
         System.out.println("Not a prime number:- "+num);
     }else {
         System.out.println("Prime Number:- "+num);
     }
    }

    public static void main(String[] args) {
        Even_Odd_input_Noreturn obj=new Even_Odd_input_Noreturn();
        obj.eveOdd(101);
    }
}
