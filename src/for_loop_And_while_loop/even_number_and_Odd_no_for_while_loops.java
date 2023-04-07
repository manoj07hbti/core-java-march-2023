package for_loop_And_while_loop;

public class even_number_and_Odd_no_for_while_loops {

    public static void main(String[] args) {

        // Print Even and Odd in For Loops;

        for (int p=100; p>=0; p--){
            System.out.println("even no"+p+"="+p);
            p--;
        }


        for (int D=99; D>=0; D--) {
            System.out.println("Odd NO" + D + "=" + D);
            D--;
        }

        // Print Even and Odd in while loops;

        int v=100;
        while (v>=0){
            System.out.println("Even no"+v+"="+v--);
            v--;
        }

        int c=99;
        while (c>=0){
            System.out.println("Odd no"+c+"="+c--);
            c--;
        }







    }


}
