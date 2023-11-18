package sort;
import java.util.*;
public class Merge_Sort {
	static int count=0; 
      public static void merge_sort(int a[], int si, int ei) {
    	  
    	   if(si>=ei) {

    		   return;
    	   }
    	  int mid=si+(ei-si)/2;
    	  merge_sort(a,si,mid);
    	  merge_sort(a,mid+1,ei);
    	  merge(a,si,ei,mid);
      }
       public static void merge(int a[], int si, int ei, int mid) {
    	   
    	   int arr[]= new int[(ei-si)+1];
    	   int i=si;
    	    int j=mid+1;
    	     int k=0;
    	     while(i<=mid && j<=ei) {
    	    	 if(a[i]<a[j]) {
    	    		
    	    		 arr[k++]=a[i++];
    	    	 }
    	    	 else {
    	    		count+=mid-i+1;
    	    		 arr[k++]=a[j++];
    	    	 }
    	     }
    	     while(i<=mid) {
    	    	
    	    	 arr[k++]=a[i++];
    	     }
    	     while(j<=ei) {
    	    	
    	    	 arr[k++]=a[j++];
    	     }
    	     
    	     //copying
    	     for(  k=0,i=si;k<arr.length;k++,i++) {
    	    	 a[i]=arr[k];
    	     }
       }
        public static void display(int a[]) {
        	for( int i=0;i<a.length;i++) {
        		System.out.print(a[i]+" ");
        	}
        }
	public static void main(String[] args) {
		Scanner scn= new Scanner( System.in);
		System.out.println("Enter number of Element");
		int n= scn.nextInt();
		int a[]= new int [n];
		 for( int i=0;i<n;i++) {
			  a[i]= scn.nextInt();
		 }
		 display(a);
		 merge_sort(a,0,n-1);
		 System.out.println();
		 System.out.println("After sorting");
		 display(a);
		  System.out.println();
		  System.out.println(count);
		 
		 
scn.close();
	}

}
