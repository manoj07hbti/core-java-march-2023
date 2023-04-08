package assignment_loops;

public class FindOddEvenNumDoWhileLoop {
    public static void main(String[] args) {
        int i = 1; // initial value
        do {
            if (i % 2 == 0)// check even num
                System.out.println("Even num " + i);
            else {
                System.out.println("Odd num " + i);// print odd num
            }
                i++;
            }
            while (i <= 100) ; // declare last value
        }
    }

