package CharacterString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String a = br.readLine();

            System.out.println(a.charAt(0) + "" + a.charAt(a.length() - 1));
        }
    }
}
