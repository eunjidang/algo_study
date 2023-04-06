package 프로그래머스.LV1;

import java.util.Arrays;

public class pg3 {

    public static int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;

        int wallpaperHeight = wallpaper.length;
        int wallpaperWidth = wallpaper[0].length();

        for(int i=0; i<wallpaperHeight; i++){
            for(int j=0; j<wallpaperWidth; j++){
                if(wallpaper[i].charAt(j) == '#'){
                    lux = Math.min(lux,i);
                    luy = Math.min(luy,j);
                    rdx = Math.max(rdx,i);
                    rdy = Math.max(rdy,j);
                }
            }
        }

        return new int[]{lux,luy,rdx+1,rdy+1};
    }
    public static void main(String args[]){
        String[] example = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        int[] sol = solution(example);
        for(int i=0;i<sol.length;i++){
            System.out.println(sol[i]);
        }
    }


}
