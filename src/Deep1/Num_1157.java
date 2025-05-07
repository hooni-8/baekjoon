package Deep1;

import java.util.Scanner;

public class Num_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] c = text.toLowerCase().toCharArray();

        int[] arr = new int[26];

        for (int i = 0; i < c.length; i++) {
            int tmp = (int) c[i];
            arr[tmp - 97] += 1;
        }

        int max = arr[0];
        int maxIdx = 0;
        boolean bl = false;

        for (int j = 1; j < arr.length; j++) {
            if (max == arr[j]) {
                bl = true;
            }
            if (max < arr[j]) {
                max = arr[j];
                maxIdx = j;
                bl = false;
            }
        }

        System.out.println(bl ? "?" : (char) Character.toUpperCase(maxIdx + 97));

    }
}
