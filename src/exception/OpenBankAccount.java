package exception;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class OpenBankAccount {
    public void openaccount(int rs) throws LessAmountException {
        // minimum ammount should be 10000 to open account
        if (rs>=10000){
            System.out.println("Amount is sufficient for open account in HDFC Bank");
        }else throw new LessAmountException("Amount is not sufficient for open account in HDFC Bank");
    }

    public static void main(String[] args) {
        OpenBankAccount obj=new OpenBankAccount();
        Scanner scr=new Scanner(System.in);

        System.out.println("please deposit amount ");
        int rs =scr.nextInt();
        try {
            obj.openaccount(rs);
        } catch (LessAmountException e) {
            throw new RuntimeException(e);
        }

    }
}
