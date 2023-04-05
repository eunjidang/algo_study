package 문자열;

import java.util.Scanner;

public class BOJ13223re {

    //20:00:00 04:00:00 -> 08:00:00
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n_date_array = sc.next().split(":");
        String[] s_date_array = sc.next().split(":");

        //시, 분, 초로 계산 필요
        //모두 초로 변환
        int n_date = Integer.parseInt(n_date_array[0]) * 60 * 60
                            + Integer.parseInt(n_date_array[1]) * 60
                               + Integer.parseInt(n_date_array[2]);

        int s_date = Integer.parseInt(s_date_array[0]) * 60 * 60
                            + Integer.parseInt(s_date_array[1]) * 60
                                + Integer.parseInt(s_date_array[2]);

        int out_date = s_date - n_date;
        if(out_date <= 0) out_date += 24 * 3600; //하루가 이미 지남

        // 10000초 = 3600 * (2시간) + 2800초
        //         = 2시간 + 60 * (46분) + 40초
        //         = 2시간 46분 40초
        int out_date_h = out_date / 3600;
        int out_date_m = (out_date%3600) / 60;
        int out_date_s = out_date%60;

        System.out.printf("%02d:%02d:%02d", out_date_h, out_date_m, out_date_s);


    }
}
