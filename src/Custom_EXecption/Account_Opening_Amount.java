package Custom_EXecption;

import java.util.Scanner;

public class Account_Opening_Amount {
    public void OpeningAccountBalance(int Amount) throws Less_Than_Amount_Exception{
        if (Amount<5000){
            throw new Less_Than_Amount_Exception("Account Opening Balance more than 5000");
        }else {
            System.out.println("Account New Opening with balance ");
        }
    }

    public static void main(String[] args) {
        Account_Opening_Amount obj=new Account_Opening_Amount();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Balance for account opening");
        int Amount=scanner.nextInt();

        try {
            obj.OpeningAccountBalance(Amount);
        }catch (Less_Than_Amount_Exception e){
            throw new RuntimeException(e);


        }
    }
}
