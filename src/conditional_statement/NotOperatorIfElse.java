package conditional_statement;

public class NotOperatorIfElse {

    public static void main(String[] args) {

        // true=false
        //  false= true

        String city="agra";

        if (city!="delhi"){
            System.out.println("taj mahal in agra");
        }else{
            System.out.println("taj is not  mahal in agra");
        }

        double price=56.4;
        if (!(price>=56.8)){
            System.out.println("product is costly");
        }else {
            System.out.println("product is not more costly");
        }
    }
}
