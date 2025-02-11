import java.util.*;

public class pythagorasTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(isPythagoras(a, b, c));
        scn.close();
    }

    public static boolean isPythagoras(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if(max == a){
            if((b*b + c*c)==a*a){
                return true;
            }
        }
        else if(max == b){
            if((a*a + c*c)==b*b){
                return true;
            }
        }
        else if(max == c){
            if((a*a + b*b)==c*c){
               return true;
            }
        }
        return false;
    }
}
