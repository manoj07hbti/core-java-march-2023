package data_manipulation;

public class PalindromeString {

    public static void main(String[] args) {
        String str= "MLM";
        String revstr="";

        for (int i=str.length()-1;i>=0;i--){
            revstr=revstr+str.charAt(i);

            }
        if (str.equals(revstr)){
            System.out.println(str + " is Palindrome string");
        }else {
            System.out.println(str + " is not Palindome string");
        }


    }
}
