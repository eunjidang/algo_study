package 문자열;

import java.util.Scanner;

/*
*
* 1. 문제가 주어졌을 때, 소문자/대문자를 어떻게 판별할 수 있을까?
* -> ASCII 테이블
* 2. 소문자 -> 대문자, 대문자 -> 소문자
* */
public class BOJ2744 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ex = sc.next();

        for(int i=0;i<ex.length();i++){
            //ascii 이용하기
            char ch = ex.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                System.out.print((char)('a'+ch - 'A'));
                // System.out.println((char)'a' + ch - 'A');
            else
                System.out.print((char)('A'+ch - 'a'));
               // System.out.println((char)'A' + ch - 'a');
        }
    }
}
