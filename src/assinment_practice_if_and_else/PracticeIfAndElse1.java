package assinment_practice_if_and_else;

import com.sun.prism.shader.AlphaOne_LinearGradient_AlphaTest_Loader;

public class PracticeIfAndElse1 {
    public static void main(String[] args) {
        int marks;
        marks=70;
        if (marks > 60) {
            System.out.println("first division" + marks);
        }else {
            System.out.println("this is not first division " + marks);
        }

            marks=50;
            if (marks > 60) {
                System.out.println("first division" + marks);
            }else {
                System.out.println("this is not first division " + marks);

                int price;
                price = 8000;
                if (price > 6000) {
                System.out.println("this is costly item" + price);
            }else{
            System.out.println("this is average item" + price);
        }

                price = 4000;
                if (price > 6000) {
                    System.out.println("this is costly item" + price);
                }else {
                    System.out.println("this is average item" + price);
                }

                String city="AGRA";

                if(city=="AGRA"){
                    System.out.println("Person belongs to Agra ...");
                } else {
                    System.out.println("Person does not belongs to Agra ...");


                int age =18;
                if(age>=18){
                    System.out.println("person is eligible for voting"+age);
                    {else{
                        System.out.println("person is not eligible for voting"+age);
                    }

                }


            }

    }

}
