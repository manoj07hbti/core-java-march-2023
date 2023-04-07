package assignment_loops;

public class FindOddNumUsingForLoop {
    public static void main(String[]args){
        // declare initial
        int num=1;
        // apply for loop
        for (num=1;num<=100;num++){
            // check odd num
            if (!(num%2==0)){
                System.out.println("for loop "+num);
            }
        }
    }
}
