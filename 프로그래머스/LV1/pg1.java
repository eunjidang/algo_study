package 프로그래머스.LV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class pg1 {

    public static void main(String args[]){
        String[] name =  {"may", "kein", "kain", "radi"};
        int[] yearing = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] result = new int[photo.length];

        Map<String,Integer> list=  new HashMap<>();
        for(int i=0;i<name.length;i++){
            list.put(name[i], yearing[i]);
        }

        for(int i=0; i<photo.length;i++){
            for(int j=0;j<photo[i].length;j++){
                if(list.containsKey(photo[i][j])){
                     result[i]+=list.get(photo[i][j]);
                }
            }
        }

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
