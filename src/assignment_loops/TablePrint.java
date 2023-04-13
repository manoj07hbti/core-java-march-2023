package assignment_loops;

public class TablePrint {
    public static void main(String[] args) {
        int number = 5;
        for (int i=1;i<=10;i++) {

            System.out.println("5 X " + i + " =" + number * i);
        }

        int j = 1;
        while(j<=10){

            System.out.println("while loop 5 X "+j + "="+number*j);
            j++;


        }
    }
}
