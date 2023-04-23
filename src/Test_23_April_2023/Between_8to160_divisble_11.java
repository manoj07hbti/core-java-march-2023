package Test_23_April_2023;

public class Between_8to160_divisble_11 {
    public static void main(String[] args) {
        int num =160;
        System.out.println(" even number from 8 to "+num+" ");
        for (int i =8; i<=num;i++){
            if (i % 2==0 && i % 11==0){
                System.out.println(+i);
            }
        }
    }
}





