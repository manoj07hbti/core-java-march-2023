package andopretor;

public class AndOperatorDemo {
    public static void main(String[]args){
        int price;
        String shirt;
        price=650;
        shirt= "Cotton";

        //And operator 1st Condition- True--True=True
        if (price>=650 & shirt=="Cotton") {
            System.out.println("Cotton shirt is limit price");

          }else {
            System.out.println("Cotton shirt price is not limit");
        }
           // And operator 2nd condition- True -- False=     False

        shirt="Peter England";
        if(price>=650 & shirt== "Cotton"){
            System.out.println("Cotton shirt is limit price");

        }else {
            System.out.println("Cotton shirt price is not limit");
        }

        // And operator 3rd condition- False-- True=     False..

        price=550;
        if (price>=600 & shirt== "Peter England") {
            System.out.println("Cotton shirt price is not limit");
        }else {

            System.out.println("Cotton shirt price is not limit");
        }

        // And operator 4th condition- False-- False=     False..

        price =450;

        if (price>=550 & shirt== "Peter England") {
            System.out.println("Cotton shirt price is not limit");

        }else {

            System.out.println("Cotton shirt price is not limit");
        }


        }

    }
}
