package demo_array;

public class DistanceArray {
    public static void main(String[] args) {

        int dis[]={45,89,47,458,3654,98,56,23,69};
        System.out.println("distance array at index 2 dis is :"+dis[2]);

        //for loop
        for (int i=0;i< dis.length;i++){
            System.out.println("distance array for loop: "+dis[i]);

        }
        // while loop
        int i=0;
        while (i< dis.length){
            System.out.println("distance array with while loop"+dis[i]);
        }
    }
}
