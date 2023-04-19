package Assignment_class_object_Default;

import com.sun.media.jfxmediaimpl.HostUtils;

public class Engineer_class_method_class {
    String Engineer="Robert";
    int Side=9;
    String UnderEngineer="Louis";

    public void Engineer_Side(){
        System.out.println("The Engineer in Side");
    }
    public void Engineer_Location(){
        System.out.println("The Engineer in Location");
    }
    public void Engineer_Saalry(){
        System.out.println("The Engineer In Saalry");
    }
    public void Engineer_Website_Clone(){
        System.out.println("The Engineer is Website Clone");
    }
    public void Engineer_Number(){
        System.out.println("The Engineer is NUmber");
    }

    public static void main(String[] args) {
        Engineer_class_method_class obj1= new Engineer_class_method_class();
        System.out.println(" obj1:-"+obj1.Engineer+" obj1:- "+obj1.Side+" obj1:- "+obj1.UnderEngineer);

        Engineer_class_method_class obj2= new Engineer_class_method_class();
        System.out.println(" obj2:-"+obj2.Engineer+" obj2:- "+obj2.Side+" obj2:- "+obj2.UnderEngineer);

        Engineer_class_method_class obj3= new Engineer_class_method_class();
        System.out.println(" obj3:-"+obj3.Engineer+" obj3:- "+obj3.Side+" obj3:- "+obj3.UnderEngineer);

        Engineer_class_method_class obj4= new Engineer_class_method_class();
        System.out.println(" obj4:-"+obj4.Engineer+" obj4:- "+obj4.Side+" obj4:- "+obj4.UnderEngineer);

        Engineer_class_method_class obj5= new Engineer_class_method_class();
        System.out.println(" obj5:-"+obj5.Engineer+" obj5:- "+obj1.Side+" obj5:- "+obj5.UnderEngineer);

        Engineer_class_method_class obj6=new Engineer_class_method_class();
        System.out.println(" obj6:-"+obj6.Engineer+" obj6:- "+obj6.Side+" obj6:- "+obj6.UnderEngineer);

        Engineer_class_method_class obj= new Engineer_class_method_class();
        obj.Engineer_Location();
        obj.Engineer_Number();
        obj.Engineer_Saalry();
        obj.Engineer_Side();
        obj.Engineer_Website_Clone();



    }
}
