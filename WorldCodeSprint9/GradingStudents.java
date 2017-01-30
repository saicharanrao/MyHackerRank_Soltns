import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            
            if(grade<38||grade==100||(grade%5==0))
                System.out.println(grade);
            else{
            	if(grade%5>=3)
            		grade=grade+(5-(grade%5));
            	System.out.println(grade);
            }
            
        }
    }
}
/*
HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to 1-100 .
Any  less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round  up to the next multiple of .
If the value of  is less than 38 , no rounding occurs as the result will still be a failing grade.
For example, 84 will be rounded to  85 but 29 will not be rounded because the rounding would result in a number that is less than 40.

Given the initial value of  for each of Sam's  students, write code to automate the rounding process. For each , round it according to the rules above and print the result on a new line.

Input Format

The first line contains a single integer denoting  (the number of students). 
Each line  of the  subsequent lines contains a single integer, , denoting student 's grade.

Constraints

Output Format

For each  of the  grades, print the rounded grade on a new line.

Sample Input 0

4
73
67
38
33
Sample Output 0

75
67
40
33
*/