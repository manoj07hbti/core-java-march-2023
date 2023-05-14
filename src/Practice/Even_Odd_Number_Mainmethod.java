package Practice;

public class Even_Odd_Number_Mainmethod {
    // write this programme using main method===============
    public static void main(String[] args) {
        boolean flag=true;
        for (int i=0; i<=100;i++){
            if (i%2==0){
                System.out.println("Not a Prime Number:- "+i);
                flag=true;
            }
            else {
                System.out.println("Prime Number:- "+i);
                flag=false;
            }
        }
    }
}