package assignment.loops;

public class WHILEloop {
    public static void main(String[] args){

       //table of 5 with while loop
        int i=1;
        int number=5;
        System.out.println("TABLES OF 5 WITH WHILE LOOP ");
        while(i<=10) {

            System.out.println("5 X " + i +" = " +number*i );
            i++;
        }


        // table of 10 with while loop
        int num=10;
        int k=1;
        System.out.println("TABLE OF 10 WITH WHILE LOOP");
        while(k<=10){
            System.out.println("10 X " +k +" = "+num*k);
            k++;
        }


        //EVEN NUMBER BETWEEN 1 TO 100 WITH WHILE LOOP

        System.out.println("EVEN NUMBER BETWEEN 1 TO 100 WITH WHILE LOOP");
        int j=1;
        while(j<=100) {
            if (j % 2 == 0) {
                System.out.println(+j);
            }
            j++;
        }
        }


    }
