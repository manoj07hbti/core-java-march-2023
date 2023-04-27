package class_and_object.input_parameters;

public class Eligible_voter_InputParameter {
    public void EligibleVoter(int age,String city,String name){
        if(age>=18 && city.equals("AGRA")){
            System.out.println(name+" from "+city +" is eligible for voting in AGRA ");
        }else{
            System.out.println(name+" from "+city +" is not eligible for voting in AGRA");
        }
    }

    public static void main(String[] args) {
        Eligible_voter_InputParameter obj=new Eligible_voter_InputParameter();
        obj.EligibleVoter(10,"delhi","VINAY");
        obj.EligibleVoter(26,"AGRA","AMAN");
    }
}
