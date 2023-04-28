package class_and_object.creating_Method;

public class Police_with_Method {
    //creating new method
    public void fir(){
        System.out.println("POLICE REPORTS FIR");
    }
    public void cases(){
        System.out.println("POLICE SOLVE CASES");
    }
    public void arrest(){
        System.out.println("POLICE ARREST CRIMINALS");
    }

    public static void main(String[] args) {
        Police_with_Method obj=new Police_with_Method();
        obj.cases();
        obj.fir();
        obj.cases();
    }
}
