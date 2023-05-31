package OOPs_Inheritance;

public class Total_Employee extends Employee_Class {
    public void TE(){
        System.out.println("TE in Company");
    }

    public static void main(String[] args) {
        Total_Employee obj=new Total_Employee();
        obj.Senior();
        obj.TL();
        obj.TE();
    }
}
