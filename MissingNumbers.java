import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/missing-numbers
public class Solution {
	static HashMap<Integer,Integer> t1= new HashMap<Integer,Integer>();
	static HashMap<Integer,Integer> t2= new HashMap<Integer,Integer>();
    
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    int a,b,i,j,u;
    Scanner cs=new Scanner(System.in);
    a=cs.nextInt();
    
    
    /*
     * First use a hashmap.
     * Store both the sets
     * Now using a map iterator check each numbers frequency in the other set. Here second>=first always
     * Whose freq is greater add that to list
     * print that list
     */
    for(i=0;i<a;i++){
    	u=cs.nextInt();
    	if (t1.containsKey(u)) {
			t1.put(u, (((Integer)t1.get(u))+1));
		} else {
			t1.put(u, 1);
		}
    }
    	b=cs.nextInt();
    	for(i=0;i<b;i++){
        	u=cs.nextInt();
        	if (t2.containsKey(u)) {
    			t2.put(u, (((Integer)t2.get(u))+1));
    		} else {
    			t2.put(u, 1);
    		}
        }
    	List<Integer> missing = new ArrayList<>();
    	for (Map.Entry<Integer, Integer> entry : t2.entrySet()) 
		{
			
			Integer ECount=entry.getValue();
			int number = entry.getKey();
			//System.out.println();
			if (t1.get(number) == null ||t1.get(number) < ECount) {
	                missing.add(number);
	                //System.out.println(number);
	            }
		}
    	Collections.sort(missing);
    	for (int item : missing) {
            System.out.print(item + " ");
        }
    	
    }
}