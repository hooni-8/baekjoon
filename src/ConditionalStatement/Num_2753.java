package ConditionalStatement;

import java.util.Scanner;

public class Num_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if ((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
