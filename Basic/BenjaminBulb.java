import java.util.*;
public class BenjaminBulb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noOfBulbs = scn.nextInt();
        benjaminBulb(noOfBulbs);
        scn.close();
    }
    public static void benjaminBulb(int noOfBulbs){
        for(int i = 1; i<=noOfBulbs; i++){
            if(i*i <= noOfBulbs){
                System.out.println(i*i);
            }
        }
    }
}
