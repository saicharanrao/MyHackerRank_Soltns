import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int i,j=0,k;
    	Scanner cs=new Scanner(System.in);
    	int n=cs.nextInt();
    	int n1=cs.nextInt();
    	//cs.nextLine();
    	
    	int ar[]=new int[n];
    	int br[]=new int[n1];
    	for(i=0;i<n;i++)
    		ar[i]=cs.nextInt();
    	
    	for(j=0;j<n1;j++)
    		br[j]=cs.nextInt();
    	
    	HashSet<Integer>h1=new HashSet<Integer>();
    	
    	for(i=0;i<n;i++)
    		h1.add(ar[i]);
    	
    	for(j=0;j<n1;j++)
    	{
    		h1.remove(br[j]);
    	}
    	
    	Iterator iter = h1.iterator();
    	while (iter.hasNext()) {
    	    System.out.println(iter.next());
    	}
    	
    	
    	
    	//Process 2
    	ArrayList<Integer>al1 = new ArrayList<Integer>(); 
    	ArrayList<Integer>al2 = new ArrayList<Integer>(); 
    	for(i=0;i<n;i++)
    		al1.add(ar[i]);
    	
    	for(j=0;j<n1;j++)
    		al2.add(br[j]);
    	
    	ArrayList<Integer>c = al1; 

    	
    	c.removeAll(al2);
    	Iterator iter1 = c.iterator();
    	while (iter1.hasNext()) {
    	    System.out.println(iter1.next());
    	}
    	
    	
    	
    }

	
}