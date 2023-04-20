package methods_or_function;

public class Cube_Project {

    //Make a Function which can print any number cube======================================
    public void makeCube(){
        int number=7;

        int cube=number*number*number;
        System.out.println("Cube of Given Numner is:- "+cube);
    }

    public static void main(String[] args) {
        Cube_Project obj=new Cube_Project();
        obj.makeCube();
    }
}
