package sort;
import java.util.*;
public class Bubble_Sort {
	public void bubble(int arr[]) {
		int n=arr.length;
	for( int i=0;i<n-1;i++) {
		for( int j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				//swap
				 int temp=arr[j+1];
				 arr[j+1]=arr[j];
				 arr[j]=temp;
			}
			else {
				
			}
		}
	}
	for( int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
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
		  Bubble_Sort b= new Bubble_Sort();
		  b.bubble(a);
		 
scn.close();
	}

}
