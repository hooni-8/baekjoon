package Iteration;

import java.util.Scanner;

public class Num_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        int num = sc.nextInt();

        long total = 0;

        for (int i = 0; i < num; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            total = (A * B) + total;
        }

        System.out.print(total == X ? "Yes" : "No");

    }
}
