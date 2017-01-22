#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    char* s = (char *)malloc(512000 * sizeof(char));
    scanf("%s",s);
    char* t = (char *)malloc(512000 * sizeof(char));
    scanf("%s",t);
    int k; 
    scanf("%d",&k);
    int sl = strlen(s); int tl = strlen(t); int diffi=0;  

int i,m;
for(i=0;s[i]&&t[i]&&s[i]==t[i];i++); //going till matching
diffi=i; 
m = sl+tl-2*diffi;

((k>=m&&(k-m)%2==0)||(sl+tl<=k))?printf("Yes"):printf("No");
    return 0;
}
/*
You have a string, , of lowercase English alphabetic letters. You can perform two types of operations on :

Append a lowercase English alphabetic letter to the end of the string.
Delete the last character in the string. Performing this operation on an empty string results in an empty string.
Given an integer, , and two strings,  and , determine whether or not you can convert  to  by performing exactly  of the above operations on . If it's possible, print Yes; otherwise, print No.

Input Format

The first line contains a string, , denoting the initial string. 
The second line contains a string, , denoting the desired final string. The third line contains an integer, , denoting the desired number of operations.
*/