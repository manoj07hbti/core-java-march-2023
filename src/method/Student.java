package method;

public class Student {

    public void  read(){

        System.out.println("student is reading");
    }

    public void eat(){

        System.out.println("Student eating the food");
    }

    public void sleep(){
        System.out.println("student is sleeping");
    }

    public void play(){
        System.out.println("student is playing");
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.read();
        obj.eat();
        obj.sleep();
        obj.play();
    }
}
