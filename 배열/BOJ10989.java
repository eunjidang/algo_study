package 배열;

import java.io.*;
import java.util.Scanner;

public class BOJ10989 {
    //백만단위 이상이면 BufferdReader를 쓰자
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001]; //1~10000까지를 인덱스로 쓸 것
        for(int i=0;i<N;i++)
            cnt[ Integer.parseInt(br.readLine())]++;

        for(int i=1;i<=10000;i++)
            while(cnt[i] --> 0){ //cnt[i]가 존재할 때까지
                bw.write(i + "\n");
            }
        bw.flush();
    }

}
