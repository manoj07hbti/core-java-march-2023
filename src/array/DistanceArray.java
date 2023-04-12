package array;

public class DistanceArray {
    public  static void main(String[]args){

        int dis[]={22,45,78,700,800,500};

        System.out.println("distance array at index 2 dis is : "+dis[2]);
        // for loop

        for (int i=0;i< dis.length;i++){

            System.out.println("distance array for loop: " +dis[i]);
        }
        // while loop
        int i=0;
        while (i< dis.length){
            System.out.println("distance array while loop: " +dis[i]);
            i++;
        }
        // do while loop
        i=0;
        do {
            System.out.println("distance array do while loop: " +dis[i]);
            i++;
        }while (i< dis.length);

        // advance for loop
         for (int var:dis) {
            System.out.println("distance array advance loop: " +var);
        }

    }
}
