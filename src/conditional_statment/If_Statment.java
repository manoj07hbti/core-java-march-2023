package conditional_statment;

public class If_Statment {
    public static void main(String[] args) {

        int age = 12;

        if (age<=18) {
            System.out.println("person is not younger.."+age);

        }
        String name = "khushboo";
        if (name=="khushboo"){
            System.out.println("this is girl name");
        }
        String city= "firozabad";
        if (city!= "agra"){
            System.out.println("khushboo is not belong to agra");
        }

        int price=5000;
        if (price>=4000){
            System.out.println("product is not costly");
        }
        int marks=31;
        if (marks>=33){
            System.out.println("student is cleared exam"+marks);
        }
    }
}