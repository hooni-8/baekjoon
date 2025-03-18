package ConditionalStatement;

import java.util.Scanner;

public class Num_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        int answer = 0;

        if (A == B && B == C) {
            answer = 10000 + (A * 1000);
        } else if (A == B || A == C || B == C) {
            if (A == B || A == C) {
                answer = 1000 + (A * 100);
            } else {
                answer = 1000 + (B * 100);
            }
        } else {
            answer = Math.max(Math.max(A, B), C) * 100;
        }

        System.out.print(answer);
    }
}
