package 프로그래머스.LV1;

import java.util.Arrays;

public class pg4 {
    public static int solution(int n, int m, int[] section) {
        int paint = 0;

        //언제까지? section 범위를 벗어날 때까지
        int idx = 0;
        int step = 0;
        while(true){
            if(step >= Arrays.stream(section).max().getAsInt()) break;
            step += section[idx]+m-1;
            paint++;
            idx++;
        }


        return paint;
    }
    public static void main(String args[]){
        int[] example = {1, 2, 3, 4};
        int n = 4;
        int m = 1;
        int sol = solution(n,m,example);
        System.out.println(sol);

    }
}
