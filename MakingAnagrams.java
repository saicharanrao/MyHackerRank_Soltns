
/*
Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number?

Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.

This challenge is also available in the following translations:

Chinese
Russian
Input Format

The first line contains a single string, . 
The second line contains a single string, .

Constraints

It is guaranteed that  and  consist of lowercase English alphabetic letters (i.e.,  through ).
Output Format

Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

Sample Input

cde
abc
Sample Output

4
Explanation

We delete the following characters from our two strings to turn them into anagrams of each other:

Remove d and e from cde to get c.
Remove a and b from abc to get c.
We must delete  characters to make both strings anagrams, so we print  on a new line.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
		
		// Declare an array for both strings to store frequency of letter in its respective index
    	int ar[]=new int[26];
    	int ar1[]=new int[26];
    	int temp=0,sum=0;
    	
		// Storing frequency of letter at its index Ex: Alphabet 'a' (97-97 = 0)
    	for(int i=0;i<first.length();i++){
    		ar[(int)(first.charAt(i))-97]++;
    		
    	}
    	for(int i=0;i<second.length();i++){
    		ar1[(int)(second.charAt(i))-97]++;
    		
    	}
    	
		//To make given string anagram remove the difference number of characters
    	for(int j=0;j<26;j++){
    		temp=temp+Math.abs(ar[j]-ar1[j]);
    		
    		
    	}
    	
		return temp;
      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		//Taking the Input
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
