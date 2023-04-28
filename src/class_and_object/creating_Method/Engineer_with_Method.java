package class_and_object.creating_Method;

public class Engineer_with_Method {
    //crating method
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void civilMethod(){
        System.out.println("\nCIVIL ENGINEER CREATES BLUEPRINTS OF BUILDINGS AND CONSTRUCT THE BUILDING");
    }
    public void electric(){
        System.out.println("ELECTRICAL ENGINEER TAKE CARE OF ELECTRIC CIRCUITS ETC.");
    }
    public void mechanical(){
        System.out.println("MECHANICAL ENGINEER TAKE CARE OF AUTOMATION AND MACHINERY PARTS");
    }

    public static void main(String[] args) {
        Engineer_with_Method obj=new Engineer_with_Method();

        obj.civilMethod();
        obj.electric();
        obj.mechanical();
    }
}
