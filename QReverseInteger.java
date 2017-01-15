import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final int INT_MAX = 2147483647;
	private static final int INT_MIN = -2147483648;
	//**** Make sure that if reverse crosses int limit make it to zero
	public static void main(String[] args) {
        
    	Scanner cs= new Scanner(System.in);
    	int x = cs.nextInt();
    	 
    	long sum=0,r,i;
        int h = Math.abs(x);
        
        while(h>0){
            r=h%10;
            h=h/10;
            sum=(sum*10)+r;
            if (sum > INT_MAX || sum < INT_MIN) {
                sum= 0;
            }
        }
        if(x>0)
        System.out.println((int)sum);
        else if(x<0)
        	System.out.println(sum*-1);
        else
        	System.out.println(sum);
        	
    }
}
