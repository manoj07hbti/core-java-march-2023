package conditional_statement;

public class NextedIfElse {
    public static void main(String[] args) {

    int age = 16;

        if(age>0)

    {

        if (age >= 18) {
            System.out.println("parson eligible for voting");
        } else {
            System.out.println("not eligible for voting");
        }
    }else

    {
        System.out.println("enter velide number for age");

    }

    String city = "agra";

        if(city=="agra"){
        if (age >= 19) {
            System.out.println("parson is eligible for the voting in agra");
        } else {
            System.out.println("parson is not eligible for the voting in agra");
        }
    }
            else

    {
        System.out.println("enter right data for voting");
    }

}}
