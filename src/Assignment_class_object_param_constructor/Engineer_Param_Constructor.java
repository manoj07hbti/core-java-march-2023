package Assignment_class_object_param_constructor;

public class Engineer_Param_Constructor {

    String Engineer;
    int side;
    String UnderEngineer;

    public Engineer_Param_Constructor(String engineer, int side, String underEngineer) {
        Engineer = engineer;
        this.side = side;
        UnderEngineer = underEngineer;
    }

    public static void main(String[] args){
        Engineer_Param_Constructor obj1= new Engineer_Param_Constructor("Rahul",40,"Saurav");
        System.out.println(" engineer:- "+obj1.Engineer+" side:- "+obj1.side+" underEngineer:- "+obj1.UnderEngineer);

        Engineer_Param_Constructor obj2= new Engineer_Param_Constructor("Rohit",77,"life");
        System.out.println(" engineer:- "+obj2.Engineer+" side:- "+obj2.side+" underEngineer:- "+obj2.UnderEngineer);

        Engineer_Param_Constructor obj3= new Engineer_Param_Constructor("Hunk",8,"SRK");
        System.out.println(" engineer:- "+obj3.Engineer+" side:- "+obj3.side+" underEngineer:- "+obj3.UnderEngineer);

        Engineer_Param_Constructor obj4= new Engineer_Param_Constructor("Chennai",9,"Bottle");
        System.out.println(" engineer:- "+obj4.Engineer+" side:- "+obj4.side+" underEngineer:- "+obj4.UnderEngineer);

        Engineer_Param_Constructor obj5= new Engineer_Param_Constructor("Gt",6,"Tiifin");
        System.out.println(" engineer:- "+obj5.Engineer+" side:- "+obj5.side+" underEngineer:- "+obj5.UnderEngineer);
    }
}
