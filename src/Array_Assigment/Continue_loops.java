package Array_Assigment;

public class Continue_loops {
    public static void main(String[] args) {
        // Continue Array
        String Language[]={"Java","python","C","C++","Dotnet","HTML","Golang","Gerkin","VB"};
        for (String var: Language){
            if (var=="HTML"){
                System.out.println("Language is backend Language");
                continue;

            }
        }

    }
}
