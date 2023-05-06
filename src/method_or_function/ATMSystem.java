package method_or_function;

public class ATMSystem {
    //checkPassword
    public boolean checkPassword(String password) {

        if (password.equals("4567")) {

            return true;
        } else {

            System.out.println("Unauthorized User ");
            return false;
        }

    }

    // welcomeScreen

    public String welcomeScreen() {

        String message = "Welcome to Stat Bank ATM Bank ....";

        return message;
    }

    public static void main(String[] args) {
        ATMSystem obj = new ATMSystem();

        if (obj.checkPassword("4567")) {

            String msg = obj.welcomeScreen();
            System.out.println(msg);
        }
    }
}