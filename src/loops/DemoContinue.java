package loops;

public class DemoContinue {

    public static void main(String[] args) {

        String course[]={"Java","Spring", "Spring Boot","Cloud"};

        for(String var: course){

            if(var.equals("Spring")){
                continue;
            }
            System.out.println("Printing Java Developer course "+var);
        }


    }
}
