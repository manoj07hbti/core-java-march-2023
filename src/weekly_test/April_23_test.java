package weekly_test;

public class April_23_test {

    // NUMBER DIV BY 180 SHOULD NOT BE ODD

    public void evenorodd(){
        for(int i=1;i<=180;i++){
            if(i%11==0 && i%2==0){
                    System.out.println(+i +" IS DIVISIBLE BY 11 AND ITS NOT ODD NUMBER");

            }
        }
    }

    public void primeinrange(){
        int min=10,max=20,flag=0;
        for(int n=min;n<=max;n++){
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n +"");
            }
            flag=0;
        }
    }
    public static void main(String[] args) {
        April_23_test obj=new April_23_test();
        obj.evenorodd();
        obj.primeinrange();
    }
}
