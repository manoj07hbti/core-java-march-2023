package Assignment_class_object_param_constructor;

public class Employee_class_Param_constructor {
    String Employee;
    int Member;
    String Company;

    public Employee_class_Param_constructor(String employee, int member, String company) {
        Employee = employee;
        Member = member;
        Company = company;
    }

    public static void main(String[] args) {
        Employee_class_Param_constructor obj1= new Employee_class_Param_constructor("rohit",20,"Lotus");
        System.out.println(" employee:- "+obj1.Employee+" member:- "+obj1.Member+" company:- "+obj1.Company);

        Employee_class_Param_constructor obj2= new Employee_class_Param_constructor("Mayank",70,"KPI");
        System.out.println("employee:- "+obj2.Employee+" member:- "+obj2.Company+" company:- "+obj2.Company);

        Employee_class_Param_constructor obj3= new Employee_class_Param_constructor("Gaurav",78,"Capgemini");
        System.out.println(" employee:- "+obj3.Employee+" member:- "+obj2.Company+" company:- "+obj3.Company);

        Employee_class_Param_constructor obj4= new Employee_class_Param_constructor("kaushal",76,"Teach_mahindra");
        System.out.println(" employee:- "+obj4.Employee+" member:- "+obj4.Member+"company:- "+obj4.Company);

        Employee_class_Param_constructor obj5= new Employee_class_Param_constructor("shivam",45,"Covrage");
        System.out.println(" employee:- "+obj5.Employee+" member:- "+obj5.Member+" company:- "+obj5.Company);

        Employee_class_Param_constructor obj6= new Employee_class_Param_constructor("Mayank",90,"biotech");
        System.out.println(" employee:- "+obj6.Employee+" member:- "+obj6.Member+" company:- "+obj6.Company);



    }
}
