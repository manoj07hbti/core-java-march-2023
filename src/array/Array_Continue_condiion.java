package array;

public class Array_Continue_condiion {

    public static void main(String []args){
        // Array Continue ; condition
        String programming_language []={"Java" , "Python" , "C ", "C++" , "Dotnet","HTML", "GoLang" , "Gerkin" , " VB "};

        for (String var:programming_language){

            if (var=="HTML"){
                System.out.println("Langauage is backend Language");

                continue;
            }


        }

    }

}

