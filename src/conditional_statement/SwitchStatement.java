package conditional_statement;

public class SwitchStatement {
    public static void main(String[] args) {

     int day =5;
     switch (day){

         case 1: ////if (day==1)
             System.out.println("day is monday ");
             break;
         case 2:
             System.out.println(" day is tuesday");
             break;


         case 3:
             System.out.println(" day is wednesday");
             break;

         case 4:
             System.out.println(" day is thursday");
             break;

         case 5:
             System.out.println(" day is friday");
             break;

         case 6:
             System.out.println(" day is saturday");
             break;

         case 7:
             System.out.println(" day is sunday");
             break;

         default:
             System.out.println(" case is invalid please write right code");
     }
    }
}
