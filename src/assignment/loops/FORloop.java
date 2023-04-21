package assignment.loops;

public class FORloop {
    public static void main(String[] args){

        // demo for loop

        for(int i=1;i<=20;i++){
            System.out.println(" this line will print till " +i);
        }

        //printing table of 5 in for loop

        int num=5;
        System.out.println("TABLE OF 5");
        for(int j=1;j<=num;j++){

            System.out.println(" 5 X "+j +" = " +num*j);
        }

        // printing table of 10

        int number=10;
        System.out.println("TABLE OF 10");
        for(int k=1;k<=number;k++){

            System.out.println("10 X "+k +" = " +number*k);
        }

        // PRINT ALL EVEN NUMBER BETWEEN 1 TO 100


        System.out.println("LIST OF EVEN NUMBERS BETWEEN 1 TO 100");
        for(int i=1;i<=100;i++){

            //  % is used for remainder
            if(i%2==0){
                System.out.println( +i );
            }
        }
    }
}
