package assignments;

public class SwappingTwoNumbers {
    public static void main(String []args){
        int a=20;
        int b=30;
        // swap two numbers without creating third variable
        a=a+b;// that means a=50
        b=a-b;//that means b=20
        a=a-b;// that means a=30
        System.out.println("swap variable a: "+a);
        System.out.println("swap variable b: "+b);

        // swap both numbers without creating third variable
        int m=15;
        int n=20;
        System.out.println("printing before swapping no. :"+m);
        System.out.println("printing before swapping no. :"+n);

        // swap both numbers without creating third variable by multiple & divide
        m=(m*n);//15*20=300
        n=m/n; // 300/20=15
        m=m/n; //300/15=20
        System.out.println("printing after swapping no. :"+m);
        System.out.println("printing after swapping no. :"+n);
    }
}
