package CharacterString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int j = 0; j < text.length(); j++) {
            int tmp = (int) text.charAt(j) - 97;

            if (arr[tmp] == -1) {
                arr[tmp] = j;
            }
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }

    }
}
