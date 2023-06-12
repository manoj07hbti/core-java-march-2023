package exception;

import java.util.Scanner;

public class VotingApp {

    public void doVoting(int age) throws AgeNotEligibleException {

        if (age < 18) {
            throw new AgeNotEligibleException("Voter age should be greater than or equal to 18");
        } else {
            System.out.println("Welcome to Voting App..");
        }
    }

    public static void main(String[] args) {

        VotingApp obj = new VotingApp();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter you age : ");
        int age=scanner.nextInt();

        try {
            obj.doVoting(age);
        } catch (AgeNotEligibleException e) {
            throw new RuntimeException(e);
        }


    }
}
