package shorting;

public class seletion_sort {
	public static void print(int[] arr) {
		for(int ele : arr)
			System.out.print(ele+" ");
		
		System.out.println();
	}

	public static void main(String[] args) {
	
	int[] arr = {10,-4,20,1,8,-6} ;
	int n = arr.length ;
	print(arr);
	System.out.println("after the sort");
	
	for(int i=0;i<n-1;i++) {
		 
		int min = Integer.MAX_VALUE ;
		int mindx = -1; 
		for(int j=i;j<n;j++) {
			if(arr[j]<min) {
				min = arr[j] ;
				mindx = j ;  // index of min value
			} }
		int temp = arr[i] ;
		arr[i] = arr[mindx] ;
		arr[mindx] = temp ;
	}
	print(arr);
	}

}
