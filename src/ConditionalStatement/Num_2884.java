package ConditionalStatement;

import java.util.Scanner;

public class Num_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int hour = Integer.parseInt(input[0]);
        int min = Integer.parseInt(input[1]);

        if (min >= 45) {
            min -= 45;
        } else {
            min = (min + 60) - 45;
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
        }

        System.out.print(hour + " " + min);
    }
}
