package CharacterString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] text = br.readLine().split(" ");

        int cnt = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i] != "") {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}
