import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
    	int n;
    	
    	Scanner cs=new Scanner(System.in);
    	n=cs.nextInt();
    	int array[]=new int[n];
    	for(int i=0;i<n;i++)
    		array[i]=cs.nextInt();
    	
    	mergesort(array);
    	for(int i=0;i<n;i++)
    		System.out.println(array[i]);
        }

	private static void mergesort(int[] array) {
		// TODO Auto-generated method stub
		int temp[]=new int[array.length];
		mergesort(array,temp,0,array.length-1);
		
	}

	private static void mergesort(int[] array, int[] temp, int i, int j) {
		// TODO Auto-generated method stub
		if(array.length<=1)return;
		if(i>=j)return;
		int middle = (i+j)/2;
		mergesort(array,temp,i,middle);
		mergesort(array,temp,middle+1,j);
		merge(array,temp,i,j);
	}

	private static void merge(int[] array, int[] temp, int leftStart, int rightEnd) {
		// TODO Auto-generated method stub
		int leftEnd = (leftStart+rightEnd)/2;
		int rightStart = leftEnd+1;
		int size=rightEnd-leftStart+1;
		
		int left=leftStart;
		int right = rightStart;
		int index=leftStart;
		
		while(left<=leftEnd&&right<=rightEnd){
			if(array[left]<=array[right]){
				temp[index]=array[left];
				left++;
			}
			else{
				temp[index]=array[right];
				right++;
			}
			index++;
		}
		System.arraycopy(array, left, temp, index, leftEnd-left+1);
		System.arraycopy(array, right, temp, index, rightEnd-right+1);
		System.arraycopy(temp, leftStart, array, leftStart, size);
		
		
		
		
		
	}
    
}
