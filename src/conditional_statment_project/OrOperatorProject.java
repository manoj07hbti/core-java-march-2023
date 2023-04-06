package conditional_statment_project;

public class OrOperatorProject {
    public static void main(String[] args) {

        String Brand;
        int ram;
        Brand="IBM";
        ram=8;
        // Or Operator Condition 1st- True--True= True
        if (ram>=8 || Brand=="IBM"){
            System.out.println("IBM laptop with comes approx 8GB RAM");
        }else {
            System.out.println("Did not recognize laptop configuration");
        }

        // Or Operator Condition 2nd- False--True= True

        ram=4;
        if(ram>=6 || Brand=="IBM"){
            System.out.println("IBM laptop with comes approx 8GB RAM");
        }else {
            System.out.println("Did not recognize laptop configuration");
        }

        // Or Operator Condition 3rd- True--False= True

        ram=6;
        if (ram>=5 || Brand=="Dell"){
            System.out.println("IBM laptop with comes approx 8GB RAM");
        }else {
            System.out.println("Did not recognize laptop configuration");
        }

        // Or Operator Condition 4th- False--False= False

        Brand="Lenovo";

        if(ram>=12 || Brand=="IBM"){
            System.out.println("IBM laptop with comes approx 8GB RAM");
        }else {
            System.out.println("Did not recognize laptop configuration");
        }
    }
}
