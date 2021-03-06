/*
Given a 2D array of digits, try to find the occurrence of a given 2D pattern of digits. For example, consider the following 2D matrix:

1234567890  
0987654321  
1111111111  
1111111111  
2222222222  
Assume we need to look for the following 2D pattern:

876543  
111111  
111111
If we scan through the original array, we observe that the 2D pattern begins at the second row and the third column of the larger grid (the  in the second row and third column of the larger grid is the top-left corner of the pattern we are searching for).

So, a 2D pattern of  digits is said to be present in a larger grid , if the latter contains a contiguous, rectangular 2D grid of digits matching with the pattern , similar to the example shown above.

Input Format

The first line contains an integer, , which is the number of test cases.  test cases follow, each having a structure as described below: 
The first line contains two space-separated integers,  and , indicating the number of rows and columns in the grid , respectively. 
This is followed by  lines, each with a string of  digits, which represent the grid . 
The following line contains two space-separated integers,  and , indicating the number of rows and columns in the pattern grid . 
This is followed by  lines, each with a string of  digits, which represent the pattern .

Constraints

 
 
 

Output Format

Display 'YES' or 'NO', depending on whether (or not) you find that the larger grid  contains the rectangular pattern . The evaluation will be case sensitive.

Sample Input

2
10 10
7283455864
6731158619
8988242643
3830589324
2229505813
5633845374
6473530293
7053106601
0834282956
4607924137
3 4
9505
3845
3530
15 15
400453592126560
114213133098692
474386082879648
522356951189169
887109450487496
252802633388782
502771484966748
075975207693780
511799789562806
404007454272504
549043809916080
962410809534811
445893523733475
768705303214174
650629270887160
2 2
99
99
Sample Output

YES
NO
Explanation

The first test in the input file is:

10 10
7283455864
6731158619
8988242643
3830589324
2229505813
5633845374
6473530293
7053106601
0834282956
4607924137
3 4
9505
3845
3530
As one may see, the given 2D grid is indeed present in the larger grid, as marked in bold below.

7283455864  
6731158619  
8988242643  
3830589324  
2229505813  
5633845374  
6473530293  
7053106601  
0834282956  
4607924137  
The second test in the input file is:

15 15
400453592126560
114213133098692
474386082879648
522356951189169
887109450487496
252802633388782
502771484966748
075975207693780
511799789562806
404007454272504
549043809916080
962410809534811
445893523733475
768705303214174
650629270887160
2 2
99
99
The search pattern is:

99
99
This cannot be found in the larger grid.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int i,j,k,l = 0,ind1 = 0,ind2=0;
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            
            i=0;ind1 = 0;ind2=0;
            while(i<R){
            	if(G[i].contains(P[0])){
            		ind1=G[i].indexOf(P[0]);
            		//System.out.println("ind1 "+ind1);
            		//break;
            	
            	
            
            //System.out.println("i = "+i);
            
            k=0;l=0;
            for(j=i;j<i+r;j++){
            	if((G[j].contains(P[k]))&&(G[j].indexOf(P[k])==G[i].indexOf(P[0], G[j].indexOf(P[k]))))l++;
            	k++;
            	
            }
            if(l==r)ind2=1;
            	}
            i++;
            }
           // System.out.println("l = "+l);
            if(ind2==1)System.out.println("YES");
            else System.out.println("NO");
            
            
            
        }
    }
}
