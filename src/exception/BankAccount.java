package exception;

import java.util.Scanner;

public class BankAccount {



        public void account(int rs) throws LessAmountException {
            // minimum amount should be 5000 to open account
            if (rs>=5000){
                System.out.println("Amount is able for open account in  Bank");
            }else throw new LessAmountException("Amount is not able for open account in PNB Bank");
        }

        public static void main(String[] args) {
            BankAccount obj=new BankAccount();
            Scanner sc=new Scanner(System.in);

            System.out.println("please deposit amount ");
            int rs =sc.nextInt();
            try {
                obj.account(rs);
            } catch (LessAmountException e) {
                throw new RuntimeException(e);
            }

        }
    }


