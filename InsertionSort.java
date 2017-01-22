import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int ar[]=new int[n];
        for(int i=1;i<=n;i++)
        	ar[i-1]=in.nextInt();
      int ar1[]=  sort(ar,n);
      for(int i=1;i<=n;i++)
    	  System.out.println(ar1[i-1]);
    }

	private static int[] sort(int[] ar, int n) {
		// TODO Auto-generated method stub
		int i,j,k,key;
		for(j=1;j<ar.length;j++){
			i=j-1;
			key = ar[j];
			while(i>=0&&ar[i]<key ){
				ar[i+1]=ar[i];
				i--;
			}
			
			ar[i+1]=key;
		}
		
		
		
		return ar;
	}
}

//Change ar[i]>key and you get descending order