package loop;

public class EvenOrOddNumberWithWhileLoop {
    public static void main(String[] args) {


        int j= 1;
        int num=100;
        while (j<num){
            if ( j %2==0) {
                System.out.println(" print even number.." + j);
            } j++;


        }
        // print odd number

        int i=1;
        while (i<num){
            if (i %2!=0){
                System.out.println("print odd numbers.."+i);
            }
            i++;
        }

    }
}
