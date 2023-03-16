import java.io.IOException;
import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        //데이터 갯수가 아주 많을 때 수 정렬하기

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(count);
        for (int i = 0; i < n; i++) {

            bw.write(String.valueOf(count[i]) + "\n");
        }
        bf.close();
        bw.flush();
        bw.close();
    }



}

