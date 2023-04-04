package conditional_statment_project;

public class NotOperatorProject {
    public static void main(String[] args) {
        String Grocery;
        Grocery="Sugar";

    //Not Operator use- Statement False--Covert True;

        if(!(Grocery!="Sugar")){
            System.out.println("Grocery Product is Sugar");
        }else {
            System.out.println("Grocery Product is not Sugar");
        }

        //Not Operator use- Statement True--Covert False;
        int Marks;
        Marks=45;
        if(!(Marks>=40)){
            System.out.println("Student Clear the Exam--");
        }else {
            System.out.println("Student did not clear the exam..");
        }

        //Using Both True & False Condition using And Operator;
        //Using True Condition--Convert False
        String Fruit;
        int Amount;
        Fruit="Apple";
        Amount=80;
        if(!(Fruit=="Apple" & Amount>=70)){
            System.out.println("1 Kg Apple Cost is approx 80 rs..");
        }else {
            System.out.println("Apple not in reasonable price..");
        }

        //Using Both True & False Condition using And Operator;
        //Using False Condition--Convert True

        Fruit="Mango";
        Amount=100;
        if(!(Fruit=="Apple" & Amount<=70)){
            System.out.println("1 Kg Mango Cost is approx 80 rs..");
        }else {
            System.out.println("Mango not in reasonable price..");
        }

        }
    }

