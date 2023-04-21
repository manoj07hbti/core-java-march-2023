package methods_or_funtions;

public class Method_For_Cube {


public void make_cube(){
  int a=4;
  int cube=a*a*a;
  System.out.println(" cube of the given number:-"+cube);
}

    public static void main(String[] args) {
        Method_For_Cube obj=new Method_For_Cube();
        obj.make_cube();

    }
}
