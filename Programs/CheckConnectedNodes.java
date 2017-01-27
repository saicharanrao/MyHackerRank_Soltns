//QuickFind Algorithm

import java.util.Scanner;


public class ClassOne {

	public static void main(String args[]){
		Scanner cs=new Scanner(System.in);
		int n=cs.nextInt();
		int j,k,m;
		ClassTwo obj=new ClassTwo(n);
		
		System.out.println("Enter the no of pairs of Nodes:");
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
		return (ar[p]==ar[q]);
		
	}
	
	public void union(int p,int q){
		int a=ar[p];
		int l=ar[q];
		
		for(int i=0;i<ar.length;i++){
			if(ar[i]==a)ar[i]=q;
		}
	}
	public void print(){
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
}
