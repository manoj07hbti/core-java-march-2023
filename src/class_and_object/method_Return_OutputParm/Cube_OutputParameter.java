package class_and_object.method_Return_OutputParm;

public class Cube_OutputParameter {
    public int makeCube(int number){
        int cube=number*number*number;
        return cube;
    }

    public static void main(String[] args) {
        Cube_OutputParameter obj=new Cube_OutputParameter();
        int result = obj.makeCube(12);
        System.out.println(result);
    }
}
