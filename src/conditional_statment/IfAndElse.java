package conditional_statment;

public class IfAndElse {
    public static void main(String[] args) {
        int age=12;
        if(age>=18){
            System.out.println("person is younger");
        }
        else {
            System.out.println("person is child");
        }
        String city="Firozabad";
        if(city=="Agra"){
            System.out.println("khushboo is belongs to agra");
        }
        else {
            System.out.println("khushboo is not belongs to agra");
        }
        int price= 3000;
        if (price<=5000){
            System.out.println("product is not costly");
        }
        else {
            System.out.println("product is costly");
        }
        int marks=59;
        if (marks>=60){
            System.out.println(" student is first division");
        }
        else {
            System.out.println("Student is not first division");
        }
        double cost=55.8;
        if (cost>=50.5){
            System.out.println("product is costly");
        }
        else {
            System.out.println("product is not costly");
        }
    }
}
