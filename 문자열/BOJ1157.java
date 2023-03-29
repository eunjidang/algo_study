package 문자열;

import java.util.Scanner;

public class BOJ1157 {


    public static int[] getAlphabetCount(String str){
        int[] alphabet = new int[26];
        for(int i=0;i<str.length();i++){
            alphabet[str.charAt(i) - 'A']++; //AABB {2,2,0,...}
        }
        return alphabet;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next().toUpperCase();
        int[] alphabet = getAlphabetCount(a);

        int max_count = -1;
        char max_alphabet = '?';
        for(int i=0;i<26;i++){
          if(alphabet[i] > max_count) {
              max_count = alphabet[i];
              max_alphabet = (char)('A' + i);
          }
          else if(alphabet[i] == max_count) max_alphabet = '?';
        }
        System.out.println(max_alphabet);
    }
}
