package NumbersProblemWithParameter;

public class FindCube {
    public void makeCube(int n){
        int cube=n*n*n;
        System.out.println("cube of this num is :" +cube);
    }

    public static void main(String[] args) {
        FindCube obj=new FindCube();
        obj.makeCube(5);
        obj.makeCube(10);
        obj.makeCube(7);

    }

}
