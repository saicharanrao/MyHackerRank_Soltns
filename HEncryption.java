
/*
 * An English text needs to be encrypted using the following encryption scheme. 
First, the spaces are removed from the text. Let  be the length of this text. 
Then, characters are written into a grid, whose rows and columns have the following constraints:

, where  is floor function and  is ceil function
For example, the sentence if man was meant to stay on the ground god would have given us roots after removing spaces is  characters long, so it is written in the form of a grid with 7 rows and 8 columns.

ifmanwas  
meanttos          
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots
Ensure that 
If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. .
The encoded message is obtained by displaying the characters in a column, inserting a space, and then displaying the next column and inserting a space, and so on. For example, the encoded message for the above rectangle is:

imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

You will be given a message in English with no spaces between the words. The maximum message length can be characters. Print the encoded message.

Here are some more examples:

Sample Input:

haveaniceday
Sample Output:

hae and via ecy
Sample Input:

feedthedog    
Sample Output:

fto ehg ee dd
Sample Input:

chillout
Sample Output:

clu hlt io
 */
 import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Solution 
{
	public static void main(String args[])
	{
		Scanner cs=new Scanner(System.in);	 
		String s=cs.nextLine();
		double n=s.length();
		
		int col = (int)(Math.ceil(Math.sqrt(n)));
		int row=(int)(Math.floor(Math.sqrt(n)));
		if(col*row<n)row++;
		//System.out.println(col+" "+row);
		int p=0;
		String t[]=new String[col*row];
		for(int i=0;i<col;i++){
			p=i;
			for(int j=0;j<row;j++){
				System.out.print(s.charAt(p));
				p+=col;
				if(p>=n)break;
			}
			System.out.print(" ");
		}
	} 
}
