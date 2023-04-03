package conditional_statment_project.conditional_statment_if;

public class ProjectIfCondition2 {
    public static void main(String[]args){

//SYNTAX: if (expression){code}
        int marks =65;//variable declaration
        if (marks >=60){
            System.out.println("first division:"+marks);
            marks = 32;//if marks is equal and lower than 33
            if ( marks <=33){
                System.out.println("you have not cleared exam"+marks);


            }
        }
    }
}
