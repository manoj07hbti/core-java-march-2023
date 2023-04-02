package conditional_statment_project;

public class AndOperatorProject {
    public static void main(String[] args) {
        int Science_Marks;
        String Stream;
        // Logical Operator Condition 1-- True--True= True
    Science_Marks=60;
    Stream="Science";

    if(Science_Marks<65 & Stream=="Science"){
        System.out.println("Student Get 60% In Sicence Stream");
    }else {
        System.out.println("Student did not get 60% in Science Stream..");
    }

        // Logical Operator Condition 2-- True--False= False
        int Arts_Marks;
    Arts_Marks=58;
    Stream="Arts";
    if (Arts_Marks>55 & Stream=="Science"){
        System.out.println("Student Get 60 % in Science Stream");
    }else {
        System.out.println("This Student did not get 60 % in Science Stream");
    }

      // Logical Operator Condition 3-- False--True= False
     Science_Marks=60;
     Stream="Science";
     if(Science_Marks>63 & Stream=="Science"){
        System.out.println("This student choose to science stream..");
    }else {
        System.out.println("This Student does not choose this Stream.");
    }

    // Logical Operator Condition 4-- False--False= False
    Arts_Marks=55;
     Stream="Arts:";
     if (Arts_Marks>60 & Stream=="Science"){
         System.out.println("THis Student choose Arts Stream..");
     }else {
         System.out.println("This Student did not choose Arts Stream..");
     }

     //Project2 Checking Voting Eligible Criteria & State
        // Logical Operator Condition 1-- True--True= True
        int Age;
     String State;
     Age=18;
     State="Uttar Pradesh";
     if (Age<20 & State=="Uttar Pradesh"){
         System.out.println("This person is eligible for voting & belongs to Uttar Pradesh.. ");
     }else {
         System.out.println("This person is not eligible for voting..");
     }

        // Logical Operator Condition 2-- True--False= False

     Age=18;
     State="Madhya Paradesh";
     if (Age<19 & State=="Uttar Pradesh"){
         System.out.println("This person is eligible for voting & belongs to Uttar Pradesh..");
     }else {
         System.out.println("This person did not Belong to U.P and not eligible for voting");
     }
        // Logical Operator Condition 3-- False--True= False
        Age=18;
     State="Uttar Pradesh";
     if(Age<17 & State=="Uttar Pradesh"){
         System.out.println("This person is eligible for voting & belongs to Uttar Pradesh");
     }else{
         System.out.println("This person did not Belong to U.P and not eligible for voting");
     }
        // Logical Operator Condition 4-- False--False= False
     Age=18;
     State="Uttar Pradesh";
     if(Age<16 & State=="Madhya Pradesh"){
         System.out.println("This person is eligible for voting & belongs to Uttar Pradesh");
        }else {
         System.out.println("This person did not Belong to U.P and not eligible for voting");
     }
    }
}





















