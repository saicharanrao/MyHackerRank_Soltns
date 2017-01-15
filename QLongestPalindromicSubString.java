import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
    	Scanner cs= new Scanner(System.in);
    	String h = cs.nextLine();
    	String i=lengthOfLongestSubstring(h);
    }
public static String lengthOfLongestSubstring(String s) {
	String s1,h1 = null,max=null;
	StringBuilder sb=null;
	int l=s.length();
	int i,j,k,max1=0,y=0;
	if(s.length()<2)return s;
	max=s.charAt(0)+"";
	for(i=0;i<l-1;i++){
		j=i+1;
		while(j<l){
			
		
		if(j<l&& s.charAt(i)==s.charAt(j)){
		//System.out.println(i+" "+j);
			s1 = s.substring(i,j+1);
		
			if((s1.length())>max1&&s1.length()>1){
			sb=new StringBuilder(s1);
			//System.out.println(s1);
			
			if((sb.toString()).equalsIgnoreCase(sb.reverse().toString())){
				h1=sb.toString();
				 
				
				if((h1.length())>max1){max=h1;
				max1=h1.length();
				}
			
		}}
	}
		j++;}}
	//System.out.println("-- "+max);
	
    return max;
    }
}
