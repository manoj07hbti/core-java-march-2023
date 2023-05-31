package OOPs_Inheritance;

public class Patient_Class extends Doctor_class{
    public void Surgery(){
        System.out.println("surgery");
    }

    public static void main(String[] args) {
        Patient_Class obj=new Patient_Class();
        obj.Surgery();
        obj.Nurse();
    }
}

