import java.util.Scanner;
public class PrintFibonacci {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int limit = scn.nextInt();
        printFibonacci(limit);
        scn.close();
    }
    public static void printFibonacci(int limit){
        if(limit == 1){
            System.out.println(0);
        }
        else if(limit ==2){
            System.out.println(1);
        }
        else{
            int a = 0;
            int b = 1;
            for(int i = 0; i<limit; i++){
                System.out.println(a);
                int c = a + b;
                a = b;
                b = c;
            }
        }
    }
}
