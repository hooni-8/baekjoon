package Iteration;

import java.util.Scanner;

public class Num_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < i; z++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
