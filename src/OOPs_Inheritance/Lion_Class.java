package OOPs_Inheritance;

public class Lion_Class extends Animal_Class{

    public void Roar(){
        System.out.println("Loin is Roar");
    }

    public static void main(String[] args) {
        Lion_Class obj=new Lion_Class();
        obj.Eat();
        obj.Roar();
    }
}

