package Assignment_Call_Method;

public class Assignment_Calculator_App {

    public void addition(){
        int a=65;
        int b=34;

        int sum=a+b;
        System.out.println(" Addition: "+sum);
    }

    public void subtraction(){
        int g=90;
        int u=20;

        int sub=g-u;
        System.out.println(" Subtraction: "+sub);
    }

    public void Divided(){
        int h=68;
        int n=22;

        int div=h/n;
        System.out.println(" Divided: "+div);
    }

    public void Multiple(){
        int b=89;
        int c=34;

        int mul=b*c;
        System.out.println(" Multiple: "+mul);
    }

    public void percantage(){
        int l=6;
        int e=9;

        int per= (l*e)/100;
        System.out.println(" Percantage: "+per );
    }
    public static void main(String[] args) {

        Assignment_Calculator_App obj=new Assignment_Calculator_App();
        obj.addition();
        obj.subtraction();
        obj.Divided();
        obj.Multiple();
        obj.percantage();



    }
}
