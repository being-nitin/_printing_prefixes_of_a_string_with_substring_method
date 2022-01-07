package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Printing the substring;
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char c = prefix(s);
    }
     public static char prefix(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.substring(0,i+1));
        }
         return 0;
     }
}
