package methods_or_function;

public class PrimeNumber_Project {

    public void primeNumber(){
        int number=9;
        int count=0;
        for(int i=1;i<=number;i++)
       if(number%i==0){
           count++;
           }
        if(count==2){
            System.out.println("Given Number is  a Prime Number :- "+ number);
        }else {
            System.out.println("Given Number is not a Prime Number:- "+ number);
        }
       }

    public void primeNumber2(){
        int number=31;
        int count=0;
        for(int i=1;i<=number;i++)
            if(number%i==0){
                count++;
            }
        if(count==2){
            System.out.println("Given Number is  a Prime Number :-"+ number);
        }else {
            System.out.println("Given Number is not a Prime Number:-  "+ number);
        }
    }

    public static void main(String[] args) {
        PrimeNumber_Project obj=new PrimeNumber_Project();
        obj.primeNumber();
        obj.primeNumber2();
    }
}
