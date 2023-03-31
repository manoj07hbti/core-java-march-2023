package assignment;

public class IfElseCondition {
    public static void main(String[] args) {
        //if condition program

        int marks=60;
        if(marks==60){
            System.out.println("FIRST DIVISION");
        }
        marks=77;
        if(marks==33){
            System.out.println("EXAM NOT CLEARED");
        }

        int price=5000;
        if(price==5000){
            System.out.println("COSTLY PRODUCT");
        }
        price=3000;
        if(price<5000){
            System.out.println("AVERAGE PRICE PRODUCT");
        }
        String country="india";
        if(country=="india") {
            System.out.println("YOU ARE INDIAN");
        }
        country="japan";
        if(country=="japan"){
            System.out.println("YOU ARE NOT INDIAN");
        }

        //IF AND ELSE CONDITION
        marks=60;
        if(marks>60){
            System.out.println("FIRST DIVISION");
        }else{
            System.out.println("NOT FIRST DIVISION");
        }
        marks=33;
        if(marks>33){
            System.out.println("EXAM CLEARED");
        }else{
            System.out.println("EXAM NOT CLEARED");
        }

        price=5000;
        if(price>=5000){
            System.out.println("COSTLY");
        }else{
            System.out.println("AVERAGE PRICE");
        }

        country="india";
        if(country=="india"){
            System.out.println("YOU ARE INDIAN");
        }else{
            System.out.println("YOU ARE NOT INDIAN");
        }
}}
