package CharacterString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int revA = 0;
        int revB = 0;

        while (A != 0) {
            int dA = A % 10;
            revA = revA * 10 + dA;
            A /= 10;
        }

        while (B != 0) {
            int dB = B % 10;
            revB = revB * 10 + dB;
            B /= 10;
        }

        System.out.print(Math.max(revA, revB));
    }
}
