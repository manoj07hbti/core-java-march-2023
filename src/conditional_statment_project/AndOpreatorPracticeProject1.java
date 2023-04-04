package conditional_statment_project;

public class AndOpreatorPracticeProject1 {
    public static void main(String[] args) {
        int Price;
        String Jeans;
        Price=450;
        Jeans="Levis";
        //And operator 1st Condition- True--True= True
        if (Price>=450 & Jeans=="Levis"){
            System.out.println("Levis Jeans in Budget Price");
        }else {
            System.out.println("Jeans Brand & Price did not match ");
        }
            //And operator 2nd Condition- True--False= False

            Jeans="Tommy Hilfiger";
            if(Price>=450 & Jeans=="Levis"){
                System.out.println("Levis Jeans in Budget Price");
            }else{
                System.out.println("Jeans Brand & Price did not match");
            }

        //And operator 3rd Condition- False--True= False
            Price=500;
            if(Price>=600 & Jeans=="Tommy Hilfiger"){
                System.out.println("Levis Jeans in Budget Price");
            }else {
                System.out.println("Jeans Brand & Price did not match");
            }

        //And operator 3rd Condition- False--False= False

        Price=550;
        if (Price>=650 & Jeans=="Tommy Hilfiger"){
            System.out.println("Levis Jeans in Budget Price");
        }else{
            System.out.println("Jeans Brand & Price did not match");
        }

    }

}
