package weekly_test;

public class April_9_Test {

    public static void main(String[] args) {

        //print even and odd number between 123 and 234

        System.out.println("LIST OF EVEN AND ODD NUMBERS BETWEEN 123 AND 234 ");
        for(int i=123;i<=234;i++){

            //  % is used for remainder
            if(i%2==0){
                System.out.println("EVEN "+i );
            }else{
                System.out.println("ODD " +i);
            }
        }
        for(int i=123;i<=234;i++){
            if(i%5==0){
                System.out.println(+i +" DIVISIBLE BY 5");
        }}

    }
}

