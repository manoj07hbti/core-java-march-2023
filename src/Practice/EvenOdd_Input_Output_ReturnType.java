package Practice;

public class EvenOdd_Input_Output_ReturnType {
    // using input with return type for making this programme===============
    public boolean evenOdd(int number){
        if (number%2==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        EvenOdd_Input_Output_ReturnType obj=new EvenOdd_Input_Output_ReturnType();
        for (int i=0; i<=100;i++)
        if (obj.evenOdd(i)){
            System.out.println("Even Number:-"+i);
        }else{
            System.out.println("Odd Number:- "+i);
        }
    }
}
