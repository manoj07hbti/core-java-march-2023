package methods_or_functions;

public class ATMSystem {

    //checkPassword
    public boolean checkPassword(String password){

        if(password.equals("123")){

          return true;
        }else {

            System.out.println("Unauthorized User ");
            return false;
        }

    }

    // welcomeScreen

    public String welcomeScreen(){

        String message="Welcome to SBI ATM Bank ....";

        return message;
    }

    public static void main(String[] args) {
        ATMSystem obj= new ATMSystem();

       if( obj.checkPassword("123")){

          String msg= obj.welcomeScreen();
           System.out.println(msg);
       }

    }
}
