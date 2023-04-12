package andopretor;

public class OddAndEvenNumberByDoWhileLoop {
    public static void main(String[]args){
        int i = 1;
        do {
            if (i % 2 == 0)// check even number
                System.out.println("even number " + i);
            else {
                System.out.println("odd number " + i);
            }
            i++;
        }
        while(i<=60);
            }
        }
