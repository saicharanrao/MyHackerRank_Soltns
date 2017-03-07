import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger stval;
        BigInteger mod = new BigInteger("2");
        BigInteger ten = new BigInteger("10");
        BigInteger one = new BigInteger("1");

        BigInteger bg=new BigInteger(sc.next());
        int c;
        c=sc.nextInt();
        if(bg.remainder(mod).intValue() == 0)
            {
            bg=bg.subtract(one);
            bg=bg.divide(mod);
            bg=bg.multiply(ten);
            bg=bg.add(one);
            stval = new BigInteger(bg.toString());
        }
        else
            {
            bg=bg.divide(mod);
            bg=bg.multiply(ten);
            stval = new BigInteger(bg.toString());
        }
        c = (c-1)*2;
        String str = String.valueOf(c);
        System.out.println(stval.add(new BigInteger(str)));
    }
}
/*	Output Grid Format
..............

..............

20 22 24 26 28

11 13 15 17 19

10 12 14 16 18

 1  3  5  7  9

 0  2  4  6  8
 
 */


