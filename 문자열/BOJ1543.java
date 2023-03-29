package 문자열;

import java.util.Scanner;

public class BOJ1543 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine(); //공백 포함은 nextLine
        String word = sc.nextLine();

        int cnt = 0;
        int start_idx = 0;
        while(true){
            int idx = doc.indexOf(word, start_idx);
            if(idx < 0) break;
            cnt++;
            start_idx = idx + word.length();
        }

//방법1
//        for(int i=0;i<doc.length();i++){
//            boolean match = true;
//            for(int j=0;j<word.length();j++){
//                if(i+j >= doc.length()
//                    || doc.charAt(i+j) != word.charAt(j)){
//                    match = false;
//                    break;
//                }
//            }
//            if(match) {
//                cnt++;
//                i += word.length()-1;
//            }
//        }
        System.out.println(cnt);
    }
}
