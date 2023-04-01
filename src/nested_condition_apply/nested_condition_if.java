package nested_condition_apply;

public class nested_condition_if {
    public static void main(String[] args) {
       int marks=33;

       if (marks>0){
           if (marks>=32){

               System.out.println("passed in class");
           }else {
               System.out.println("not passed im class");
           }
           }else {
           System.out.println("he is passed out in class");
       }



       int product=5000;

       if (product>4000) {

           if (product > 4500) {

               System.out.println("Product is aevrage medium range");
           } else {

               System.out.println("Product is very high range ");
           }
           }else {
               System.out.println("Product is very range nd too high ");
           }

            int dob=17-11-1997;

            if (dob<17-11-2000) {

                if (dob < 17 - 11 - 1999) {

                    System.out.println("Born on 1997");
                } else {

                    System.out.println("born not 1997");
                }
            }else {
                System.out.println("Born was fixed is not date ");
            }


            String country="French";

            if (country=="India"){
                if (country=="both"){
                    System.out.println("live in this first condition");
                }else {
                    System.out.println("not live in this second condition");
                }
                }else {

                System.out.println("third Condition is appylying in this line ");
            }



















    }




}
