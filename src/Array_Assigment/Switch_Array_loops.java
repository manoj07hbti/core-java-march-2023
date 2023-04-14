package Array_Assigment;

import jdk.nashorn.internal.ir.CaseNode;

public class Switch_Array_loops {
    public static void main(String[] args) {
        int month=6;

        switch (month){
            case 1 :
                System.out.println("Month is january");
                break;
            case 2:
                System.out.println("Month is Feb");
                break;
            case 3:
                System.out.println("Month is March");
                break;
            case 4:
                System.out.println("Month is April");
                break;
            case 5:
                System.out.println("Month is May");
                break;
            case 6:
                System.out.println("Month is June");
                break;
            case 7:
                System.out.println("Month is July");
                break;
            case 8:
                System.out.println("Month is august");
            case 9:
                System.out.println("Month is sep");
                break;
            case 10:
                System.out.println("month is october");
                break;
            case 11:
                System.out.println("month is nov");
                break;
            case 12:
                System.out.println("month is dec");
                break;
            default:
                System.out.println("Invalid Month , Enter correct Month ");
        }

        // Condition Day;
        int Day =5;
        switch (Day){

            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
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
                System.out.println("Invalid Day, Correct Day");

        }


    }
}
