/*
Consider an array of  integers, , where all but one of the integers occur in pairs. In other words, every element in  occurs exactly twice except for one unique element.

Given , find and print the unique element.

Input Format

The first line contains a single integer, , denoting the number of integers in the array. 
The second line contains  space-separated integers describing the respective values in .

Constraints

It is guaranteed that  is an odd number.
, where .
Output Format

Print the unique number that occurs only once in  on a new line.

Sample Input 0

1
1
Sample Output 0

1
Explanation 0 
The array only contains a single , so we print  as our answer.

Sample Input 1

3
1 1 2
Sample Output 1

2
Explanation 1 
We have two 's and one . We print , because that's the only unique element in the array.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int lonelyInteger(int[] a) {
        HashMap<Integer,Integer> td= new HashMap<Integer,Integer>();
        for(int token=0;token<a.length;token++){
        if (td.containsKey(a[token])) {
				td.put(a[token], (((Integer)td.get(a[token]))+1));
			} else {
				td.put(a[token], 1);
			}
    }
        
        for (Map.Entry<Integer, Integer> entry : td.entrySet()) 
		{
			
			Integer ECount=entry.getValue();
			if (ECount == 1)
			{
				return entry.getKey();
			}
		}
        return 1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
