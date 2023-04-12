package conditional_statements;

public class DemoSwitch {

    public static void main(String[] args) {

        int day=9;

        switch (day){

            case 1:  //if(day==1)
                System.out.println("Day is Monday");
                break;
            case 2: //if(day==2)
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;

            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;

            default:
                System.out.println("Invalid day , please enter correct day number ");



        }


    }
}
