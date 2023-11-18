package sort;
import java.util.*;
public class Quick_Sort {
	 public static void quickSort(int a[], int si, int ei) {
		 if(si<ei) {
			 int idx=partition(a,si,ei);
			 quickSort(a,si,idx-1);
			 quickSort(a,idx+1,ei);
		 }
	 }
	  public static int  partition(int a[], int si, int ei) {
		  int i=si-1;
		  int pivot=a[ei];
		for( int j=si;j<ei;j++) {
			
			 if(a[j]<=pivot) {
				 //swap
				 i++;
				 int temp=a[j];
				 a[j]=a[i];
				 a[i]=temp;
				 
			 }
			
		}
		i++;
		int temp=pivot;
		a[ei]=a[i];
		a[i]=temp;
		 return i;
	  }

	public static void main(String[] args) {
	Scanner scn= new Scanner( System.in);
	System.out.println("ENter Size Of Element");
	int n= scn.nextInt();
	int arr[]= new int[n];
	System.out.println("Enter Elements");
	for( int i=0;i<n;i++) {
		arr[i]= scn.nextInt();
	}
	quickSort(arr,0,n-1);
	 for( int i=0;i<n;i++) {
		 System.out.print(arr[i]);
	 }
scn.close();
	}

}
