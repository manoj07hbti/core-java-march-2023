package loops;

public class DemoWhileLoop {

    public static void main(String[] args) {

        //SYNTAX:  while (condition){
        //            //code
        //			increment/decrement;
        //         }

        int i=1;
        while (i<=5){
            System.out.println("Hello World While Loop "+i);
            i++;
        }

        int j=5;
        while (j>0){
            System.out.println("Decrement While Loop ..."+j);
            j--;
        }

    }
}
