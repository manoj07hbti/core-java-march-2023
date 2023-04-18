package myloops;

public class Test2 {
    public static void main(String[] args) {

        System.out.print("List of even numbers from 123 to 234");
        for (int i = 123; i <= 234; i++) {
            if (i % 2 == 0 && i%5==0) {


                System.out.print("even number " + i + " , ");
            } else {
                if (i % 5 == 0) {
                    System.out.println(" odd number divide by five " + i);
                }

                System.out.println("odd number" + i);
            }

        }
    }
}


