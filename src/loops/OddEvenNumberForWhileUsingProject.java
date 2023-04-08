package loops;

public class OddEvenNumberForWhileUsingProject {
    public static void main(String[] args) {
        int Number=100;
        for (int i = 1;i <=Number;i++){
            if (i % 2 == 0){
                System.out.println("Even Number" +i+ ",");
            }else {
                System.out.println("Odd Number"+i);
            }
        }

    }
}
