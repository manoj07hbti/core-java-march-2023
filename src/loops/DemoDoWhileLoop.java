package loops;

public class DemoDoWhileLoop {

    public static void main(String[] args) {

        //SYNTAX do {
        //       CODE
        //          INCR/DECR
        //       } while(condition);

        int i=1;
        do{
            System.out.println("This is my Do While Loop ...."+i);
            i++;
        }while (i<=10);


        int j=20;

        do{
            System.out.println("This is Decrement do while loop ..."+j);
            j--;
        }while (j>0);

    }
}
