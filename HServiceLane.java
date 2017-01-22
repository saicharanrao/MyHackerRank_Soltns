import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
       int a;
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
        	 int min=4;
            int i = in.nextInt();
            int j = in.nextInt();
            
            for(a=i;a<=j;a++){
            	if(width[a]<min)min=width[a];
            }
            if(min>0&&min<4)
            	System.out.println(min);
            else
            	System.out.println(3);
        }
        
        
    }
}
/*
Calvin is driving his favorite vehicle on the 101 freeway. He notices that the check engine light of his vehicle is on, and he wants to service it immediately to avoid any risks. Luckily, a service lane runs parallel to the highway. The length of the service lane is  units. The service lane consists of  segments of equal length and different width.

Calvin can enter to and exit from any segment. Let's call the entry segment as index  and the exit segment as index . Assume that the exit segment lies after the entry segment () and . Calvin has to pass through all segments from index  to index  (both inclusive).
*/