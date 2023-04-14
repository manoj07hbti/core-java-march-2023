package assignment;

public class CONTINUEandBREAKkeyword {
    public static void main(String[] args) {
        String languages[] = {"Java","Python","C","C++","Dotnet","HTML","GoLang","Gerkin","VB"};
        for(String var:languages){
            if(var.equals("HTML")){
                continue;
            }
            System.out.println(var +" LANGUAGE IS BACKEND LANGUAGE");
        }

        // BREAK KEYWORD ASSIGNMENT

        int marks[] = {45,88,65,99,11,56,23,48,23,58,32,95};

        for(int var:marks){
            System.out.println("MARKS : " +var);
            if(var<33){
                break;
            }
        }
    }
}
