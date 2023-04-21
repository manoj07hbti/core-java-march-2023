package data_manipulation;

public class FindCube {

    // making method Syntax: access specifier return type method_name(){ code}
    public void makeCube(){
        int num=7;
        int cube=num*num*num;
        System.out.println("this is cube method: " +cube);
    }
    public static void main(String[]args){
        FindCube obj=new FindCube();
        obj.makeCube();
    }

}
