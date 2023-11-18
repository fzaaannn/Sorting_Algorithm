package sort;

public class PracticeSort {
	 public static void bubbleSort( int arr[]) {
		  int n= arr.length;
		 for( int i=0;i<n-1;i++) {
			  for( int j=0; j<n-i-1;j++) {
				  if(arr[j]>arr[j+1]) {
					  int temp=arr[j];
					  arr[j]= arr[j+1];
					  arr[j+1]=temp;
				  }
			  }
		 }
		  
	 }
	  public static void SelectionSort(int arr[]) {
		   int n=arr.length;
		  for( int i=0;i<n;i++) {
			  int smallest=i;
			   for( int j=i+1;j<n;j++) {
				   if(arr[j]<arr[smallest]) {
					   smallest=j;
				   }
			   }
			   int temp=arr[i];
			    arr[i]=arr[smallest];
			    arr[smallest]=temp;
		  }
	  }
	   public static void insertionSort( int arr[]) {
		    int n= arr.length;
		   for( int i=1;i<n;i++) {
			    int curr=arr[i];
			   int j=i-1;
			   while(j>=0 && arr[j]>curr) {
				  
				   arr[j+1]=arr[j];
				   j--;
			   }
			   arr[j+1]=curr;
		   }
	   }
	    public static void mergeSort(int arr[], int si, int ei) {
	    	 while(si>=ei) {
	    		 int mid=si+(ei-si)/2;
	    		 mergeSort(arr,si,mid);
	    		 mergeSort(arr,mid+1,ei);
	    		 merge(arr,si,ei,mid);
	    	 }
	    	
	    }
	     public static void merge(int arr[], int si, int ei, int mid) {
	    	  int i=si;
	    	   int j=mid+1;
	    	    int a[]= new int[ei-si+1];
	    	    int k=0;
	    	     while(i<=mid && j<=ei) {
	    	    	 if(arr[i]<arr[j]) {
	    	    		 a[k++]=arr[i++];
	    	    	 }
	    	    	 else {
	    	    		 a[k++]=arr[j++];
	    	    	 }
	    	     }
	    	      while(i<=mid) {
	    	    	  a[k++]=arr[i++];
	    	      }
	    	      while(j<=ei) {
	    	    	  a[k++]=arr[j++];
	    	      }
	    	       for(i=si,k=0;k<a.length;k++,i++) {
	    	    	   arr[i]=a[k];
	    	       }
	    	 
	     }
	      public static void quickSort(int arr[], int si, int ei) {
	    	  if(si>=ei) {
	    		  int idx=partitioning(arr,si,ei);
	    		  quickSort(arr,si,idx-1);
	    		  quickSort(arr,si,idx+1);
	    	  }
	      }
	       public static int partitioning(int arr[], int si, int ei) {
	    	  int idx=si-1;
	    	  int pivot=arr[ei];
	    	  for( int i=0;i<ei;i++) {
	    		 
	    		   if(arr[i]<=pivot) {
	    			   idx++;
	    			   int temp=arr[i];
	    			   arr[i]=arr[ei];
	    			  arr[ei]=temp;
	    		   }
	    		  
	    	  }
	    	   idx++;
	    	  int temp=pivot;
	    	  arr[ei]=arr[idx];
	    	  arr[idx]=temp;
	    	   return idx;
	       }
	  public static void display(int arr[]) {
		   for( int i=0;i<arr.length;i++) {
			   System.out.print(arr[i]+" ");
		   }
	  }

	public static void main(String[] args) {
		 int arr[]= {2,-5,1,23,4};
		 System.out.println("Bubble_Sort");
		 bubbleSort(arr);
		 display(arr);
		 System.out.println();
		 System.out.print("Selection_Sort");
		 SelectionSort(arr);
		 System.out.println();
		 display(arr);
		 System.out.println();
		 System.out.println("Insertion_Sort");
		 insertionSort(arr);
		 display(arr);
		 System.out.println();
		 System.out.println("Merge_Sort");
		 mergeSort(arr,0,arr.length);
		 display(arr);
		 System.out.println();
		 System.out.println("Quick_Sort");
		 quickSort(arr,0,arr.length-1);
		 display(arr);
		 
	}

}
