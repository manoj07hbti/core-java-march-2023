package method_or_function;

public class Cube_With_Return_Type {

    // Make a cube with return type :
    public int cube (int a , int b ,int c) {

        int cube = a * b * c;
        return cube;
    }

    public static void main(String[] args) {
        Cube_With_Return_Type obj = new Cube_With_Return_Type();
   int out = obj.cube(9,9,9);
   System.out.println("cube is = "+out);
    }

    }

