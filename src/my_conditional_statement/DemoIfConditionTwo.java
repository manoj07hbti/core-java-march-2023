package my_conditional_statement;

public class DemoIfConditionTwo {
    public static void main(String[] args) {

        //to check division
        int marks;
        marks=70;
        if(marks>=60){
            System.out.println("Student gets first division ;"+marks);
        }
        marks=33;
        if(marks<60){
            System.out.println("Student does not clear the exam ;"+marks);
        }
        //to check price
        int price;
        price=6000;
        if(price>=5000){
            System.out.println("product is costly ;"+price);
        }
        price=4000;
        if(price<5000){
            System.out.println("it is a average price product ;"+price);
        }
        //to check country
        String country;

        country="India";
        if(country=="India"){
            System.out.println("Person is Indian");
        }
        country="USA";
        if(country=="India"){
            System.out.println("Person is not Indian");
        }


    }


}
