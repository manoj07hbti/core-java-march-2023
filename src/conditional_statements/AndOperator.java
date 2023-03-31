package conditional_statements;

public class AndOperator {
    public static void main(String[] args) {

        int age;
        String city;

        //TRUE & TRUE = TRUE
        age=19;
        city="AGRA";

        if( age>=18 & city== "AGRA"){

            System.out.println("Person is eligible for voting in AGRA....");
        }else {
            System.out.println("Person is not eligible for voting in AGRA...");
        }

     //2.   TRUE & FALSE= FALSE
        age=18;
        city="Delhi";
        if( age>=18 & city== "AGRA"){

            System.out.println("Person is eligible for voting in AGRA....");
        }else {
            System.out.println("Person is not eligible for voting in AGRA...: 2.   TRUE & FALSE= FALSE");
        }

     //3.   FALSE & TRUE= FALSE

      age=17;
      city="AGRA";
        if( age>=18 & city== "AGRA"){

            System.out.println("Person is eligible for voting in AGRA....");
        }else {
            System.out.println("Person is not eligible for voting in AGRA...: 3.   FALSE & TRUE= FALSE");
        }

      //4.   FALSE & FALSE= FALSE
        age=1;
        city="Delhi";

        if( age>=18 & city== "AGRA"){

            System.out.println("Person is eligible for voting in AGRA....");
        }else {
            System.out.println("Person is not eligible for voting in AGRA...: 4.   FALSE & FALSE= FALSE");
        }


    }
}
