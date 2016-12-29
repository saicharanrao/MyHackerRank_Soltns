/* Consider two points,  and . We consider the inversion or point reflection, , of point  across point  to be a  rotation of point  around .

Given  sets of points  and , find  for each pair of points and print two space-separated integers denoting the respective values of  and  on a new line.

Input Format

The first line contains an integer, , denoting the number of sets of points. 
Each of the  subsequent lines contains four space-separated integers describing the respective values of , , , and  defining points  and .

Constraints

Output Format

For each pair of points  and , print the corresponding respective values of  and  as two space-separated integers on a new line.

Sample Input

2
0 0 1 1
1 1 2 2
*/
package sample;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner cs=new Scanner(System.in);
        n = cs.nextInt();
        int[] px= new int[n];
        int[] py= new int[n];
        int[] qx= new int[n];
        int[] qy= new int[n];
        int[] rx= new int[n];
        int[] ry= new int[n];
        
        for(int i=0;i<n;i++){
            
            px[i]=cs.nextInt();
            py[i]=cs.nextInt();
            qx[i]=cs.nextInt();
            qy[i]=cs.nextInt();
            
            int xdiff = px[i]-qx[i];
            int ydiff = py[i]-qy[i];
            //case1: px < qx , py < qy
            //case2: px = qx or  py = qy
            //case3: px > qx , py > qy
            //case4: px < qx , py > qy
            //case5: px > qx , py < qy
            
            if((px[i]<qx[i])&&(py[i]<qy[i])){
            	rx[i]= qx[i]+Math.abs(xdiff);
            	ry[i]= qy[i]+Math.abs(ydiff);
            }
            else if((px[i]==qx[i])&&(py[i]==qy[i])) 
            {
               rx[i]= qx[i];
               	ry[i]= qy[i];
           }
            else if((px[i]==qx[i])){
            	if(py[i]>qy[i]){
            		rx[i]= qx[i]-Math.abs(xdiff);
                	ry[i]= qy[i]-Math.abs(ydiff);
            	}
            	else if(py[i]<qy[i]){
            		rx[i]= qx[i]+Math.abs(xdiff);
                	ry[i]= qy[i]+Math.abs(ydiff);
            	}
            }
            else if((py[i]==qy[i])){
            	if(px[i]>qx[i]){
            		rx[i]= qx[i]-Math.abs(xdiff);
                	ry[i]= qy[i]-Math.abs(ydiff);
            	}
            	else if(px[i]<qx[i]){
            		rx[i]= qx[i]+Math.abs(xdiff);
                	ry[i]= qy[i]+Math.abs(ydiff);
            	}
            }
            else if((px[i] > qx[i])&&( py[i] > qy[i])){
            	rx[i]= qx[i]-Math.abs(xdiff);
            	ry[i]= qy[i]-Math.abs(ydiff);
            }
            else if((px[i] < qx[i])&&( py[i] > qy[i])){
            	rx[i]= qx[i]+Math.abs(xdiff);
            	ry[i]= qy[i]-Math.abs(ydiff);
            }
            else if((px[i] > qx[i])&&( py[i] < qy[i])){
            	rx[i]= qx[i]-Math.abs(xdiff);
            	ry[i]= qy[i]-Math.abs(ydiff);
            }
            
            
            
            
        }
        for(int i=0;i<n;i++){
        	System.out.println(rx[i]+" "+ry[i]);
        }
        
        
    }
}
