package loop;

public class Assignment {
    public static void main(String[] args) {


        int marks []={66,87,23,56,89,45,28,89};

        for (int var: marks){
            System.out.println("get student marks.."+var);

            if (var<33){
                break;
            }
        }
        //// assignment
        String languages []= {"java","python","c","c++","HTML","Dotnet","Gerkin","GoLang","VB"};

        for (String var : languages){

            if (var=="HTML"){
                continue;
            }

            System.out.println("print Language is backend language " + var);
        }
    }
}
