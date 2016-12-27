import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        
        int gy,gm,gd,ly,lm,ld,fine=0;
        gy=y1; gm =m1; gd=d1;
        ly = y2; lm=m2; ld=d2;
        
        if(gy < ly){
        fine = 0;
    }
    else if(gy > ly){
        fine = 10000;
    }
    else if(gy == ly){
        if(gm < lm){
            fine = 0;
        }
        else if(gm > lm){
            fine = 500 * (gm - lm);
        }
        else if(gm == lm){
            if(gd <= ld){
                fine = 0;
            }
            else if(gd > ld){
                fine = 15 * (gd - ld);
            }
        }
    }
        System.out.println(fine);
    }
}
