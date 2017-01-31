import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner cs=new Scanner(System.in);
		int n=cs.nextInt();
		int length,breadth;
		for(int i=0;i<n;i++){
			length=cs.nextInt();
			breadth=cs.nextInt();

			int NumSquares=findNumSquares(length,breadth);
			System.out.println(NumSquares);
		}
	}

	private static int findNumSquares(int length, int breadth) {
		// TODO Auto-generated method stub

		int min,max=0,temp,sum=0;

		int product = length*breadth;

		if(length==breadth)
			return 1;
		else{

			min=Math.min(length, breadth);

			for(int i=1;i<=min;i++){
				if((product%(i*i)==0)&&((length)%i==0)&&((breadth)%i==0)){
					temp=product/(i*i);
					//System.out.println(i);
					if(i>max)sum=temp;

				}
			}
		}
		return sum;
	}
}