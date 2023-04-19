package methods_or_functions;

public class DemoMethod {


    public void makeSquare(){
        int number=9;

        int square=number*number;

        System.out.println("Square of given number is :"+square);

    }

    public void voting(){

        int age=21;
        String city="Agra";

        if(age>=18 && city.equals("Agra")){
            System.out.println("Eligible for voting ....");
        }else {
            System.out.println("Not Eligible for voting ...");
        }

    }

    public void checkEvenOdd(){

        for (int i=1; i<=20; i++){

            if(i%2==0){
                System.out.println(" Even number : "+i);
            }else {
                System.out.println(" Odd Number : "+i);
            }
        }

    }
    public static void main(String[] args) {

        DemoMethod obj= new DemoMethod();
        obj.makeSquare();

        obj.voting();

        obj.checkEvenOdd();

    }
}
