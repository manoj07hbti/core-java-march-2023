package assignments;

public class Assign_ifAndElseCondition {

    public static void main(String[] args) {
        int marks;
        marks = 70;
        if (marks > 60) {
            System.out.println("First didvision: " + marks);
        } else {
            System.out.println("this is not First didvision: " + marks);
        }

        marks = 50;
        if (marks > 60) {
            System.out.println("First didvision: " + marks);
        } else {
            System.out.println("this is not First didvision: " + marks);
        }
        int price;
        price = 7000;
        if (price > 5000) {
            System.out.println("this is costly item: " + price);
        } else {
            System.out.println("this is average item: " + price);
        }
        price = 3000;
        if (price > 5000) {
            System.out.println("this is costly item: " + price);
        } else {
            System.out.println("this is average item: " + price);
        }
        String city;
        city = "LUCKNOW";
        if (city == "LUCKNOW") {
            System.out.println("person is indian:" + city);
        } else {
            System.out.println("person is not indian:" + city);
        }
        city = "Las Vegas";
        if (city == "LUCKNOW") {
            System.out.println("person is indian:" + city);
        } else {
            System.out.println("person is not indian:" + city);
        }
        int age;
        age = 4;
        if (age >= 5) {
            System.out.println("passanger is eligiable for ticket:" + age);

        } else {
            System.out.println("passanger is not eligiable for ticket:" + "age: "+age + " years");

        }
    }
}
