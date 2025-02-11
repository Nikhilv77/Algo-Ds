import java.util.*;
public class RotateANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int rotation = scn.nextInt();
        System.out.println(rotateNumber(number, rotation));
        scn.close();
    }
    public static int rotateNumber(int number, int rotation){
     
        int count = getCount(number);
        if(rotation==0||rotation==count)
        return number;
        rotation = rotation % count;
        if(rotation < 0){
        rotation = rotation + count;
    }
       int numberToBreak = (int)Math.pow(10,rotation);
       int endDigits = number % numberToBreak;
       number = number / numberToBreak;
       return (endDigits * (int)Math.pow(10,getCount(number))) + number;

    }
    public static int getCount(int number){
        int count = 0;
        while(number != 0){
            number /= 10;
            count++;
        }
        return count;
    }
}
