package Assignment_class_object_Default;

public class employee_class_method_call {
    String employee="TeamLeader";
    int member=20;
    String Company="KPMIT";

    public void Employee_Member(){
        System.out.println("The Employee In Factory");
    }
    public void Employee_Percantage(){
        System.out.println("The Employee in Percantage");
    }
    public void Employee_Login(){
        System.out.println("The Employee In login");
    }
    public void Employee_Team_Leader(){
        System.out.println("The employee in TeamLeader");
    }
    public void Employee_PunchIn(){
        System.out.println("The Employee in PunchIn");
    }
    // How to use Default Constructor;


    public static void main(String[] args) {
        employee_class_method_call obj1= new employee_class_method_call();
        System.out.println("obj1:-"+obj1.employee+"obj1:-"+obj1.member+"obj1:-"+obj1.Company);

        employee_class_method_call obj2= new employee_class_method_call();
        System.out.println("obj2:-"+obj2.employee+"obj2:-"+obj2.member+"obj2:-"+obj2.Company);

        employee_class_method_call obj3= new employee_class_method_call();
        System.out.println("obj3:-"+obj3.employee+"obj3:-"+obj3.member+"obj3:-"+obj3.Company);

        employee_class_method_call obj4= new employee_class_method_call();
        System.out.println("obj4:-"+obj4.employee+"obj4:-"+obj4.member+"obj4:-"+obj4.Company);

        employee_class_method_call obj5= new employee_class_method_call();
        System.out.println("obj5:-"+obj5.employee+"obj5:-"+obj5.member+"obj5:-"+obj5.Company);

        employee_class_method_call obj6= new employee_class_method_call();
        System.out.println("obj6:-"+obj6.employee+"obj6:-"+obj6.member+"obj6:-"+obj6.Company);

        employee_class_method_call obj7= new employee_class_method_call();
        System.out.println("obj7:-"+obj7.employee+"obj7:-"+obj7.member+"obj7:-"+obj7.Company);

        employee_class_method_call boj8= new employee_class_method_call();
        System.out.println("obj8:-"+boj8.employee+"obj8"+boj8.member+"obj8"+boj8.Company);

        employee_class_method_call obj= new employee_class_method_call();
        obj.Employee_Login();
        obj.Employee_Percantage();
        obj.Employee_Member();
        obj.Employee_PunchIn();
        obj.Employee_Team_Leader();

    }
}
