package exception;

import java.util.Scanner;

public class AccountOpeningApp {
    public void openingAmount(int amount) throws LessAmountException{
        if(amount<5000){
            throw new LessAmountException("Account opening balance should be more than 5000");
        }else{
            System.out.println("WELCOME NEW ACCOUNT USER...");
        }
    }

    public static void main(String[] args) {
        AccountOpeningApp obj=new AccountOpeningApp();
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE OPENING BALANCE FOR ACCOUNT");
        int amount = scanner.nextInt();

        try {
            obj.openingAmount(amount);
        } catch (LessAmountException e) {
            throw new RuntimeException(e);
        }
    }
}
