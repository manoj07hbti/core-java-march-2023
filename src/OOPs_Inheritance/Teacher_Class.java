package OOPs_Inheritance;

public class Teacher_Class extends Student_class{
    public void student (){
        System.out.println("Class is Fav");
    }

    public static void main(String[] args) {
        Teacher_Class obj=new Teacher_Class();
        obj.Saurabh();
        obj.Rohit();
        obj.student();

    }
}
