import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner cs=new Scanner(System.in);
    	long n1,n2,i,j=0;
    	n1=cs.nextInt();
    	n2=cs.nextInt();
    	
    	for(i=n1;i<=n2;i++){
    		if(kaprekar(i)){
    			System.out.print(i+" ");
                j++;
            }
    	}
        if(j==0)System.out.println("INVALID RANGE");
    	
    }
    public static boolean kaprekar(long i){
    	
    	long temp=0,temp1=0,a1,b1,c1,d1;
    	long h=i*i;
    	String j=Long.toString(h);
    	if(i==1)return true;
    	if(j.length()==1)return false;
    	//System.out.println(j.substring(0, (j.length()/2))+" "+j.substring(j.length()/2));
    	a1=Long.parseLong(j.substring(0, (j.length()/2)));
    	 b1 =Long.parseLong(j.substring(j.length()/2));
    	if(a1==0||b1==0)return false;
    	temp=a1+b1;
    	if(j.length()%2==0){
    		
    		if(temp==i)return true;
    	}
    	else{
    		c1=Long.parseLong(j.substring(0, (j.length()/2)+1));
       	 d1 =Long.parseLong(j.substring((j.length()/2)+1));
       	if(c1==0||d1==0)return false;
    		temp1 = c1+d1;
    		if(temp==i||temp1==i)return true;
    	}
		return false;
    	
    }
}
/*

A modified Kaprekar number is a positive whole number  with  digits, such that when we split its square into two pieces - a right hand piece  with  digits and a left hand piece  that contains the remaining  or  digits, the sum of the pieces is equal to the original number (i.e.  +  = ).

Note: r may have leading zeros.

Here's an explanation from Wikipedia about the ORIGINAL Kaprekar Number (spot the difference!): In mathematics, a Kaprekar number for a given base is a non-negative integer, the representation of whose square in that base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar number, because 45² = 2025 and 20+25 = 45.

The Task 
You are given the two positive integers  and , where  is lower than . Write a program to determine how many Kaprekar numbers are there in the range between  and  (both inclusive) and display them all.
*/