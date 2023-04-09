package myloops;

public class DoWhileLoopNumber {
    public static void main(String[] args) {


        int number = 1;
        do {
            System.out.println("all even number "+number +"");
            number++;
        }while(number<=100);{
            if(number%2==0){
                System.out.println("even number "+number +"");
            }else{
                System.out.println("odd number "+number +"");
            }
        }
    }
}



