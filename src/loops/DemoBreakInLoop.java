package loops;

public class DemoBreakInLoop {

    public static void main(String[] args) {

        for (int i=0; i<5; i++){

            System.out.println("Printing my loop "+i);
            if(i==2){
                break;
            }
        }

        int j=0;
        while (j<10){

            if(j==5){
                break;
            }
            System.out.println("Printing While loop "+j);
            j++;
        }

    }
}
