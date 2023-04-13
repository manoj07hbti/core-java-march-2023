package loops;

public class Break_loop_Project {
    public static void main(String[] args) {

        //Using Break Loop for Printing Student Marks if dint Get 30 % Marks Break;
        //Project 1

        int marks[]={45,49,68,38,40,77,30,88,78,67};
            for(int var:marks){
                System.out.println("Student Get- "+var+ " Marks");
                if (var<33){
                    break;
                }
            }

        //Using Break Loop for Printing Student Marks if dint Get 30 % Marks Break;
        //Project 2

            String stream[]={"Science","Arts","Commerce","Biology","Computers"};
            for (String var:stream){
                System.out.println("Student Stream:-"+ var);
                if (var=="Biology"){
                 break;
                }
            }
            }
        }
