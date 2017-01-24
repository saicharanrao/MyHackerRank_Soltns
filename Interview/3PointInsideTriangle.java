import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
    	   if (isInside(0, 0, 20, 0, 10, 30, 10, 15))
    	     System.out.println("Inside");
    	   else
    		   System.out.println("Not Inside");
    	 
    	   
    	}
    	    
    static float area(int x1, int y1, int x2, int y2, int x3, int y3)
	{
	   return (float) Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
	}
	 
	 
	static Boolean isInside(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y)
	{   
	   /*  ABC */
	   float A = area (x1, y1, x2, y2, x3, y3);
	 
	   /*  PBC */  
	   float A1 = area (x, y, x2, y2, x3, y3);
	 
	   /*   PAC */  
	   float A2 = area (x1, y1, x, y, x3, y3);
	 
	   /*   PAB */   
	   float A3 = area (x1, y1, x2, y2, x, y);
	   
	   /* Check if sum of A1, A2 and A3 is same as A */
	   return (A == A1 + A2 + A3);
	}

	
}