import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner cs=new Scanner(System.in);
    	int n,i,j,k,l;
    	n=cs.nextInt();
    	k=cs.nextInt();
    	int ar[]=new int[n];
    	for(i=0;i<n;i++){
    		ar[i]=cs.nextInt();
    	}
    	int temp1=0,page=1;
    	for(i=0;i<n;i++){
    		
    		int temp=1;
    		while(temp<=ar[i]){
    			if(page==temp){
    				temp1++;
    			}
    			//System.out.println(temp+" "+page+" "+temp1);
    			if((temp%k==0)&&temp!=ar[i])page++;
    			
    			
    			temp++;
    			
    		}
    		
    		page++;
    	}
    	System.out.println(temp1);
    }
}
/*
Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters.

There are  chapters in Lisa's workbook, numbered from  to .
The -th chapter has  problems, numbered from  to .
Each page can hold up to  problems. There are no empty pages or unnecessary spaces, so only the last page of a chapter may contain fewer than  problems.
Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
The page number indexing starts at .
Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's located. Given the details for Lisa's workbook, can you count its number of special problems?

Note: See the diagram in the Explanation section for more details.

Input Format

The first line contains two integers  and  — the number of chapters and the maximum number of problems per page respectively. 
The second line contains  integers , where  denotes the number of problems in the -th chapter.

Constraints

Output Format

Print the number of special problems in Lisa's workbook.

Sample Input

5 3  
4 2 6 1 10
Sample Output

4

*/