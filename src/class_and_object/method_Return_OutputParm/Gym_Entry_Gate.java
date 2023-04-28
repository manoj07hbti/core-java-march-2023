package class_and_object.method_Return_OutputParm;

public class Gym_Entry_Gate {
    public boolean checkGatePassword(String password){
        if(password.equals("8894")){
            return true;
        }else{
            System.out.println("UNAUTHORISED MEMBER PLEASE CONTACT GYM RECEPTION");
            return false;
        }
    }
    public String welcomeScreen(){
       String message = "HEY MEMBER WELCOME TO THE GYM" ;
        return message;
    }

    public static void main(String[] args) {
        Gym_Entry_Gate obj=new Gym_Entry_Gate();
        if(obj.checkGatePassword("884")){
            String welcomeMsg= obj.welcomeScreen();
            System.out.println(welcomeMsg);
        }
    }
}
