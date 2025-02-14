package Patterns;

import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int star = 1;
        int space = n / 2;
        int value = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            int colValue = value;
            for (int k = 1; k <= star; k++) {
                System.out.print(colValue + "\t");
                if (k <= star / 2) {
                    colValue++;
                } else {
                    colValue--;
                }

            }
            if (i <= n / 2) {
                star += 2;
                space -= 1;
                value++;
            } else {
                star -= 2;
                space += 1;
                value--;
            }
            System.out.println();
        }
    }
}