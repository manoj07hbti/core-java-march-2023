package nested_if;

public class NestedIfDemo {
    public static void main(String[] args) {

        int age;
        age = 16; // Must be 18 years for drives license..

        if (age > 0) ;
        {

            if (age >= 18) {
                System.out.println("the license will be  made for a person" + age);
            } else {
                System.out.println("the license will not be made for a person " + age);
            }
        }
        age =5;
        if(age>0){

            if(age>=18) {
                System.out.println("Adhar card will be   created " + age);



            }else{
                System.out.println("Adhar card will not be  created"+age);
            }
        }

    }
}















