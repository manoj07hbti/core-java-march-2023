package conditional_statements;

public class NotOperator {

    public static void main(String[] args) {

        int age;
        age=21;

      /*  if(age>=18){
            System.out.println("Eligible for voting .....");
        }else {
            System.out.println("Not Eligible for voting ....");
        }*/

        if(!(age<18)){
            System.out.println("Eligible for voting .....");
        }else {
            System.out.println("Not Eligible for voting ....");
        }

        String city="DELHI";

       /* if(city=="AGRA"){
            System.out.println("Person belongs to AGRA");
        }else {
            System.out.println("Person do not belongs to AGRA");
        }*/

        if(!(city!="AGRA")){
            System.out.println("Person belongs to AGRA");
        }else {
            System.out.println("Person do not belongs to AGRA");
        }


    }
}
