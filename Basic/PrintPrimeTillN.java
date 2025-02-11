import java.util.*;
class printPrimeTillN {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        ArrayList<Integer> ans = primeTillN(low, high);
        for(int i = 0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
        scn.close();
    }
    public static ArrayList<Integer> primeTillN(int low, int high){
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i = low; i<=high; i++){
        if(isPrime(i)){
            ans.add(i);
        }
       }
       return ans;
    }
    public static boolean isPrime(int number){
        if(number<1){
            return false;
        }
        for(int i = 2; i*i<=number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
