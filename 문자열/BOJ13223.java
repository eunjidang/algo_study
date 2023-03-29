package 문자열;

import java.util.Scanner;

//틀렸음...왜?
public class BOJ13223 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String now_t = sc.nextLine();
        String start_t = sc.nextLine();

        String[] now_t_arr = now_t.split(":");
        String[] start_t_arr = start_t.split(":");
        int[] new_t_arr = new int[3];

        for(int i=now_t_arr.length-1; i>=0;i--){
            int std = 60;
            if(i==0) std = 24;
            if(Integer.parseInt(now_t_arr[i]) > Integer.parseInt(start_t_arr[i]) ) {
                new_t_arr[i] += std - Integer.parseInt(now_t_arr[i]) + Integer.parseInt(start_t_arr[i]);
                if(i!=0) new_t_arr[i-1] -= 1;
            }else{
                new_t_arr[i] += Integer.parseInt(start_t_arr[i]) - Integer.parseInt(now_t_arr[i]);
            }
        }

        String out = "";
        for(int i=0;i<new_t_arr.length;i++){
            if(new_t_arr[i] < 10) out += "0"+new_t_arr[i];
            else out += new_t_arr[i];
            if(i!= new_t_arr.length-1) out += ":";
        }
        System.out.println(out);
    }
}
