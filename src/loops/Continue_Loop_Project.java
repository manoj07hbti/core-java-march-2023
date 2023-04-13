package loops;

public class Continue_Loop_Project {
    public static void main(String[] args) {

        //Using Continue Statement for Printing Java Courses Project
        String language[]={"Java","Python","C","C++","DotNet","HTML","GoLang","Gerkin"};
        for (String var:language){
            if (var=="HTML"){
                continue;
            }
            System.out.println("Language is backend language :- "+var);
        }
    }
}
