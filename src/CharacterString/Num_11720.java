package CharacterString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String number = br.readLine();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum = sum + ((int) number.charAt(i) - 48);
        }

        System.out.print(sum);
    }
}
