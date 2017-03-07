/*
For example: str = “abateatas” and pattern = “tea”. Then output should be the anagrams of “tea” contained as a substring in str. So, the desired output = {“ate”, “eat”, “tea”}.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        	Scanner cs=new Scanner(System.in);
        	System.out.println("ENter the pattern:");
        	String pat = cs.nextLine();
        	System.out.println("Enter the original String:");
        	String org= cs.nextLine();
        	pat=pat.toLowerCase();
        	org=org.toLowerCase();
        	findCount(pat,org);
    }

	private static void findCount(String pat, String org) {
		// TODO Auto-generated method stub
		
		int p =pat.length();
		int o=org.length();
		int count=0;
		if(p==0||o==0||o<p)
			System.out.println(0);
		else{
			for(int i=0;i<o-p+1;i++){
				if(check(pat,org.substring(i,i+p))){
					count++;
					System.out.println(org.substring(i,i+p));
				}
			}
		}
		System.out.println(count);
	}

	private static boolean check(String pat, String org) {
		// TODO Auto-generated method stub
		
		int patC[] = new int[26];
		int orgC[] = new int[26];
		
		for(int i=0;i<pat.length();i++){
			patC[(int)pat.charAt(i)-97]++;
			orgC[(int)org.charAt(i)-97]++;
		}
		
		for(int i=0;i<pat.length();i++){
			if(patC[i]!=orgC[i]){
				return false;
				
			}
		}
		return true;
		
		
	}
}