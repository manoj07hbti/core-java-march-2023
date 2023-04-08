package for_loop_And_while_loop;

public class even_number_and_Odd_no_for_while_loops {

    public static void main(String[] args) {

        // for loop even and odd no for_loop;

        int number=100;
        System.out.println("even number from 1 to"+number+" ");
        for (int p=1; p<=number; p++){

        // logic to check if the number even or not
        // if p%2 is equal to zero the number is even
            if (p%2==0){
                System.out.println("even numebr"+p+" ");
            }else {
                System.out.println("odd number"+p);
            }
        }
    }
}