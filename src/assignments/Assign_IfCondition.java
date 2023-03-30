package assignments;

public class Assign_IfCondition {

    public static void main(String[] args) {
        //SYNTAX :  if(expression){ CODE }
        int marks = 65; // variablre declaration
        if (marks >= 60) {
            System.out.println("first division: " + marks);
            marks = 32; // if marks is equal and lower than 33
            if (marks <= 33) {
                System.out.println("you have not cleared exam: " + marks);
                marks = 35; // if marks is equal and greater than 33 than cleared exam else not to be exucute code
                if (marks >= 34) {
                    System.out.println("you have cleared exam: " + marks);

                    int price = 5000;
                    price = 5100; // price is equal & greater than 5k
                    if (price >= 5000) {
                        System.out.println("product is costly: " + price);
                    }
                    price = 4000;
                    if (price < 5000) {
                        System.out.println("product is average price: " + price);
                    }

                    // we apply if condition on city
                    String city;
                    city = "Bareilly";
                    if (city == "Bareilly") {
                        System.out.println("person belong to India: " + city);

                        String Big_city = "London";
                        if (Big_city == "London") {
                            System.out.println("person not indian: " + Big_city);

                            Big_city = "London";
                            if (Big_city=="Kolkata"){
                                System.out.println("person not indian: "+Big_city);
                            }


                        }
                    }
                }
            }
        }
    }
}
