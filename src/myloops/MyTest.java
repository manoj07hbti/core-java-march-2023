package myloops;

public class MyTest {
    public static void main(String[] args) {

        int number = 234;
        System.out.print("List of even numbers from 123 to " + number + " ");
        for (int i = 123; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print("even number " + i + " , ");
            } else {
                System.out.println("odd number" + i);
            }
        }
        int num = 234;
        System.out.println(" the numbers which are divide by 5 123 to " + num + "");
        for (int i = 123; i <= num; i++) {
            if (i % 5 == 0) {
                System.out.println("number divide by five " + i);
            }
        }
        int age;
        String city;

        age = 18;
        city = "up";
if(age>=18 & city=="up"){
    System.out.println("Person is eligible for voting");
}else{
    System.out.println("Person is not eligible for voting");
}

    }

}