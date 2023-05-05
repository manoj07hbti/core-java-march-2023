package method;

public class Dog {

    public void bark(){
        System.out.println("dog is barking");
    }
    public void eat(){
        System.out.println("dog eating the food");
    }
    public void run(){
        System.out.println("dog is running");
    }
    public void play(){
        System.out.println(" dog is playing");
    }



    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();
        obj.eat();
        obj.run();
        obj.play();
    }
}
