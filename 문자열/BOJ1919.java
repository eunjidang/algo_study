package 문자열;

import java.util.Scanner;

/*
* 애너그램
* */
public class BOJ1919 {

    public static int[] get_alphabet_count(String t){
        int[] count = new int[26];
        for(int i=0;i<t.length();i++)
            count[t.charAt(i) - 'a']++;
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] a_count = get_alphabet_count(a);
        int[] b_count = get_alphabet_count(b);

        int sum = 0;
        for(int i=0;i<26;i++){
            sum += Math.abs(a_count[i] - b_count[i]);
        }
        System.out.println(sum);
    }

}
