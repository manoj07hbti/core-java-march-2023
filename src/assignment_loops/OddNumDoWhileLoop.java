package assignment_loops;

public class OddNumDoWhileLoop {
    public static void main(String[]args){
        int k=1;// declare initial value
        do {if (!(k%2==0))// check odd condition
            System.out.println("Odd num do while loop "+ k);
            k++;// increment operater
        }while (k<=100);
    }
}
