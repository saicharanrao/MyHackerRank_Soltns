//QuickUnion.java

import java.util.Scanner;


public class ClassOne {

	public static void main(String args[]){
		Scanner cs=new Scanner(System.in);
		int n=cs.nextInt();
		int j,k,m;
		ClassTwo obj=new ClassTwo(n);
		
		System.out.println("Enter the no of pairs:");
		m=cs.nextInt();
		System.out.println("Enter the pairs:");
		for(int i=0;i<m;i++){
			j=cs.nextInt();
			k=cs.nextInt();
			obj.union(j,k);
		}
		obj.print();
	}
}


public class ClassTwo {
	
	private int ar[];
	public ClassTwo(int n){
		ar=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=i;
	}
	public boolean connected(int p,int q){
		return (root(p)==root(q));
		
	}
	private int root(int z){
		
		while(z!=ar[z])z=ar[z];
		return z;
	}
	
	public void union(int p,int q){
		int a=root(p);
		int l=root(q);
		ar[a]=l;
		
		
	}
	public void print(){
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
}
