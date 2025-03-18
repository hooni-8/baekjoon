package ConditionalStatement;

import java.util.Scanner;

public class Num_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int time = sc.nextInt();

        int hour = Integer.parseInt(input[0]);
        int min = Integer.parseInt(input[1]);

        int sum = min + time;

        min = sum % 60;
        hour = hour + (sum / 60);

        if (hour >= 24) {
            hour = hour % 24;
        }

        System.out.print(hour + " " + min);

    }
}
