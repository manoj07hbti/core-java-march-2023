package conditional_statment_project;

public class OrOperatorProject {
    public static void main(String[] args) {

        String Brand;
        int RAM;
        Brand="IBM";
        RAM=8;
        // Or Operator Condition 1st- True--True= True
        if (RAM>=8 || Brand=="IBM"){
            System.out.println("IBM laptop with comes approx 8GB RAM");
        }else {
            System.out.println("Did not recognize laptop configuration");
        }

        // Or Operator Condition 2nd- False--True= True

        RAM=4;
        if(RAM>=6 || Brand=="IBM"){
            System.out.println("IBM laptop with comes approx 8GB RAM");
        }else {
            System.out.println("Did not recognize laptop configuration");
        }

        // Or Operator Condition 3rd- True--False= True

        RAM=6;
        if (RAM>=5 || Brand=="Dell"){
            System.out.println("IBM laptop with comes approx 8GB RAM");
        }else {
            System.out.println("Did not recognize laptop configuration");
        }

        // Or Operator Condition 3rd- True--False= True

        Brand="Lenovo";

        if(RAM>=12 || Brand=="IBM"){
            System.out.println("IBM laptop with comes approx 8GB RAM");
        }else {
            System.out.println("Did not recognize laptop configuration");
        }
    }
}
