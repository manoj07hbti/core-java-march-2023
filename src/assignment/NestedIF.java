package assignment;

public class NestedIF {
    public static void main(String[] args){
        int marks=60;
        if(marks>0){
            if(marks>=33){
                System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
        }else{
        System.out.println("THE ENTERED MARKS IS NOT VALID");}


        int price=5000;
        if(price>1000){
            if(price>=5000){
                System.out.println("COSTLY");
            }else{
                System.out.println("AVERAGE");
            }
        }
    }
}
