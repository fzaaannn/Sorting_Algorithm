package sort;
import java.util.*;
public class Selection_Sort {
	 void selection( int a[]) {
		  int count =0;
		 for( int i=0;i<a.length-1;i++) {
			 int s=i;
			 for( int j=i+1;j<a.length;j++) {
				 if(a[j]<a[s]) {
					 count++;
					 s=j;
				 }
				 else {
					 
				 }
			 }
			int temp=a[i];
			a[i]=a[s];
			a[s]=temp;
		 }
		  for( int i=0;i<a.length;i++) {
			  System.out.print(a[i]+" ");
		  }
		  System.out.println("count is"+ count);
	 }

	public static void main(String[] args) {
	Scanner scn= new Scanner ( System.in);
	 System.out.println("Enter size of an array");
	int n= scn.nextInt();
	 int a[]= new int [n];
	 System.out.println("Enter the elemnt");
	  for( int i=0;i<n;i++) {
		   a[i]= scn.nextInt();
		   }
	  Selection_Sort s= new Selection_Sort();
	  s.selection(a);
	
	
scn.close();
	}

}
