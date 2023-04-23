package Assignment_Call_Method;

public class Method_Class_Assignment_Full {
    public void cube(){
        int a=9;
        int value=a*a*a;
        System.out.println("Value Of the Cube:"+value);
    }

    public void even_odd(){
        int value=9;
            if (value % 2==0){
                System.out.println(" This number is prime: ");

            }else {
                System.out.println(" This number is odd number: ");
            }
        }

    public void palindrome_No(){
        int num=4334,reverseNum=0,remainder;
        // store the number to Original Num
        int originalNum =num;
        while (num !=0){
            remainder =num %10;
            reverseNum =reverseNum * 10+remainder;
            num /=10;
        }
        if (originalNum==reverseNum){
            System.out.println(originalNum+" is Palindrome...");
        }else {
            System.out.println(originalNum+" is not palindrome.....");
        }
    }
    public static void main(String[] args) {
        Method_Class_Assignment_Full obj=new Method_Class_Assignment_Full();
        obj.cube();
        obj.even_odd();
        obj.palindrome_No();

    }
}
