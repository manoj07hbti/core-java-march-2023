package nested_if;

public class NestedIfDemo {
    public static void main(String[]args){

        int age;
        age = 16; // Must be 18 years for drives license..

           if (age>0);{

              if (age>=18) {
                  System.out.println("the license will be  made for a person"+age);
              } else {
                  System.out.println("the license will not be made for a person " + age);
              }
              String city= "Dehli";

              if (city=="Agra"){

                  if (age>=18) {

                      System.out.println("Eligible for voting in Agra...");
                  } else {
                      System.out.println("Not Eligible for  voting");

                  }
                  }


              }
              }
    }
}




