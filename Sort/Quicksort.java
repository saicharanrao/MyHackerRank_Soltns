import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int ar[]=new int[q];
        for(int i=0;i<q;i++)
        	ar[i]=in.nextInt();
        try{
        quickSort(ar,0,ar.length-1);
        }
        catch(Exception e){
        	
        }
        for(int y:ar)
      	  System.out.println(y);
    }
    
    
    static int partition(int arr[], int left, int right)
    {
          int i = left-1,temp;
          for(int j=left;j<right;j++){
        	  if(arr[j]<arr[right]){
        		  i++;
        		   temp=arr[i];
        		  arr[i]=arr[j];
        		  arr[j]=temp;
        	  }
        	  
          }
          temp=arr[right];
          arr[right]=arr[i+1];
          arr[i+1]=temp;
          
          return i+1;
    }
     
    static void quickSort(int arr[], int left, int right) {
          int index = partition(arr, left, right);
          if (left < index - 1)
                quickSort(arr, left, index - 1);
          if (index < right)
                quickSort(arr, index, right);
         
          
    }
}
