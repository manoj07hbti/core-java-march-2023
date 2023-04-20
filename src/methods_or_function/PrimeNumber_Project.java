package methods_or_function;

public class PrimeNumber_Project {
    public void primeNumber(){
        int number=9;
        if (number/1==0 && number/9==0){
            System.out.println("Given Number is Prime Number:- "+number);
        }else {
            System.out.println("Given Number is not Prime Number :- "+number);
        }
    }

    public void primeNumber2(){
        int number=23;
       if(number/1==0){
           if (number/23==0){
               System.out.println("Given Number is Prime Number"+number);
           }
       }
    }
    public static void main(String[] args) {
        PrimeNumber_Project obj=new PrimeNumber_Project();
        obj.primeNumber();
        obj.primeNumber2();
    }
}
