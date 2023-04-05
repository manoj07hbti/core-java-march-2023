package my_conditional_statement;

public class MyNotOperator {
    public static void main(String[] args) {
        int age;
        age=18;
        if(!(age<=17)){
            System.out.println("person is eligible for voting "+age);
        }else{
            System.out.println("person is not eligible for voting "+age);
        }
    }
}
