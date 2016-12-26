import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
       
        char g[][]=new char[n][n];
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		g[i][j]=grid[i].charAt(j);
        	}
        }
        
        for(int i=1;i<n-1;i++){
        	for(int j=1;j<n-1;j++){
        		if((g[i][j]>g[i-1][j])&&(g[i][j]>g[i][j-1])&&(g[i][j]>g[i][j+1])&&(g[i][j]>g[i+1][j])){
        			g[i][j]='X';
        		}
        	}
        	
        }
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		System.out.print(g[i][j]);
        	}
        	System.out.println();
        }
        
        
    }
}
