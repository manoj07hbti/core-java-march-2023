package not_operator;

public class NotOperator {
    public static void main(String[]args){
        // here we  are checking whether he is a teacher or police

        String Qualification = "PHD";
        if(!(Qualification!="PHD")){
            System.out.println("person is eligible for for a teacher post");

        }else {
            System.out.println("person is not eligible for for a teacher post");
        }
        String city ="Agra";
        if(!(city!="Agra")) {
            System.out.println("person belong to Agra");
        }else {
            System.out.println("person does not belong to Agra");
        }
    }
}
