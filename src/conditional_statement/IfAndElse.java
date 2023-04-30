package conditional_statement;

public class IfAndElse {

    public static void main(String[] args) {
        int age=18;

        if (age>=10){
            System.out.println("parson is child..");
        }
        else {
            System.out.println("parson is old");
        }

        String name= "Rahul";
        if (name=="khushboo"){
            System.out.println("this is girls name....");

        }else {
            System.out.println("this is boy name");
        }
        double marks=75.5;
        if (marks<=76.8){
            System.out.println("student is pass with first division ");
        }
        else {
            System.out.println("Student pass with second division");
        }

        int price = 5000;
        if (price>=5000){
            System.out.println("product is not costly");
        }
        else {
            System.out.println("product is costly");
        }
    }
}
