package sort;
import java.util.*;
public class Insertion_Sort {

	public void insertion( int a[]) {
		int n = a.length;
		for( int i=1;i<n;i++) {
		int curr=a[i];
		int k=i-1;
		while(k>=0 && a[k]>curr) {
			
			a[k+1]=a[k];
			k--;
		}
		a[k+1]=curr;
		}
		
		  for( int i=0;i<a.length;i++) {
			  System.out.print(a[i]+" ");
		  }
	 }
	public static void main(String[] args) {
		Scanner scn= new Scanner (System.in);
		 System.out.println("Enter size of an array");
		int n= scn.nextInt();
		 int a[]= new int [n];
		 System.out.println("Enter the elemnt");
		  for( int i=0;i<n;i++) {
			   a[i]= scn.nextInt();
			   }
		  Insertion_Sort i= new Insertion_Sort();
		  i.insertion(a);
		  scn.close();
		  
	}

}
