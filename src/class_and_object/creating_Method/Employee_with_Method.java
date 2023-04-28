package class_and_object.creating_Method;

public class Employee_with_Method {
    // CREATING NEW METHOD
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void projectsMethod(){
        System.out.println("EMPLOYEE COMPLETE THEIR PROJECTS");
    }
    public void rulesMethod(){
        System.out.println("EMPLOYEE FOLLOW THE RULES OF COMPANY");
    }
    public void timeMethod(){
        System.out.println("EMPLOYEE COMPLETE THEIR WORK ON TIME");
    }

    public static void main(String[] args) {
        //creating new object
        Employee_with_Method obj = new Employee_with_Method();

        //calling method
        obj.projectsMethod();
        obj.rulesMethod();
        obj.timeMethod();
    }

}
