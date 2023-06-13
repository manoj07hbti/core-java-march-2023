package exception;

import java.util.Scanner;

public class VotingApp {

    public void dovoting(int age) throws AgeNotEligibleException {
        if(age<18){
            throw new AgeNotEligibleException("voter should be greater than or equal to 18");
        }else{
            System.out.println("WELCOME TO VOTING APP...");
        }
    }

    public static void main(String[] args){
        VotingApp obj=new VotingApp();
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=scanner.nextInt();

        try {
            obj.dovoting(age);
        } catch (AgeNotEligibleException e) {
            throw new RuntimeException(e);
        }
    }
}
