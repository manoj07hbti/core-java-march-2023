package loop;

public class PrintTableWithForLoop {
    public static void main(String[] args) {

        int a = 5;

        for (int i=1;i<=10;i++){

            System.out.println("print table of 5 * "+i +" = "+ a*i);
        }

        int b = 20;
        for (int i =1; i<=10; i++ ){

            System.out.println( " print table 0f 20 * " + i + " = "+b*i);
        }
    }
}