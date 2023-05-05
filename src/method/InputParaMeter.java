package method;

public class InputParaMeter {

    public void squareValue(int a ){
      int square=a*a;
        System.out.println( " find square value ...... "+square);
    }
    public void que(int a){
  int que= a*a*a;
        System.out.println(" find que of ..."+que);
    }

    public void voting(int age , String city){

        if (age>=18&& city.equals("pune")){
            System.out.println(" if parson age is greater then 18 so parson is eligible for voting in pune");
        }else {
            System.out.println("if parson age is less  then 18 so parson is not eligible for voting in pune");
        }
    }

    public void votingData(int age , String city, String name){

        if (age>=18&& city.equals("pune")){
            System.out.println(name+" is eligible for voting in pune");
        }else {
            System.out.println(name+" is not eligible for voting in pune");
        }
    }


    public static void main(String[] args) {
        InputParaMeter obj= new InputParaMeter();
        obj.squareValue(100);
        obj.que(2);
        obj.voting(25,"pune");
        obj.voting(15,"mumbai");
        obj.votingData(32,"pune","sana");
        obj.votingData(16,"agra","neha");

    }


}
