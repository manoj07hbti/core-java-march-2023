package conditional_statment_project.conditional_statment_if;

public class ProjectIfAndElseConditionPractice {
    public static void main(String[]args){
        int Marks;
        Marks=85;
        if (Marks >60) {
            System.out.println("First division:" + Marks);
        }else {
            System.out.println("this is not first division:"+Marks);

            Marks =45;
            if (Marks >40) {
                System.out.println("First division:" + Marks);
            }else {
                System.out.println("this is not first division:"+Marks);

                int price;
                price = 8000;
                if (price > 6000) {
                    System.out.println("this is costly item:" + price);
                }else{
                    System.out.println("this item is in average:"+price);

                    price= 3000;
                    if (price > 4000) {
                        System.out.println("this is costly item: " + price);
                    }else {
                        System.out.println("this item is in average");

                        String city;
                        city = "Agra";
                        if (city == "Agra") ;
                        System.out.println("this person is from India");
                    }else {
                        System.out.println("this person is not from India ");
                        int age;
                        age=15;
                        if (age >= 5) {
                            System.out.println("this person is eligiable for bot:"+age);
                        }

                    }
                }



            }
        }
    }
}




