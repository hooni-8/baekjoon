package Deep1;

import java.util.Scanner;

public class Num_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {

            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }

            for (int k = 2; k <= i; k++) {
                System.out.print("*");
            }

            for (int z = 0; z < i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = N; i >= 1; i--) {
            for (int j = N + 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = i; k > 2; k--) {
                System.out.print("*");
            }

            for (int z = i - 1; z > 0; z--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
