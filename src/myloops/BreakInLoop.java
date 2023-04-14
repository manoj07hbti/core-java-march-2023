package myloops;

public class BreakInLoop {
    public static void main(String[] args) {
        int marks []={40,50,60,45,65,38,46,78,33,78,54,66,88};
        for(int var:marks){
System.out.println("Printing in advance loop :"+var);
if(var==33){
    break;
}
        }


    }
}
