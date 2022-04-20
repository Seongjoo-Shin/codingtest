package practice;

public class Sort {

	public static void main(String[] args) {
//		int[] arr = {8,54,99,3,2,1,0};
//		bubbleSort(arr);
//		selectionSort(arr);
//		insertionSort(arr);
//		for(int i : arr)
//			System.out.print(i+" ");
		
        int[] arr1 = {11,4,8,5,9,21,7,15,1,13};
        
        quickSort(arr1, 0, arr1.length - 1);
        
        
        for (int i : arr1) 
            System.out.print(i+ " ");
        System.out.println(" - 최종 결과");
	}
	
	public static void bubbleSort(int[] arr) {
		int length = arr.length;
		for(int i=0; i<length; i++) {
			for(int j=0; j<length-1; j++) {
				if(j+1 < length && arr[j] > arr[j+1]) {
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
			System.out.print(i + "번째 과정 : ");
			for(int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
	
	public static void selectionSort(int[] arr) {
		int length = arr.length;
		for(int i=0; i<length; i++) {
			int min = i;
			
			for(int j=i+1; j<length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			if(min != i) {
				arr[min] = arr[min] + arr[i];
				arr[i] = arr[min] - arr[i];
				arr[min] = arr[min] - arr[i];
			}
			
			System.out.print((i+1) + "번째 과정 : ");
			for(int x : arr) {
				System.out.print(x + " ");
			}System.out.println();
		}
	}
	
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int position = i;
			
			while(position > 0 && key <arr[position-1]) {
				arr[position] = arr[position-1];
				position--;
			}
			
			arr[position] = key;
			
			System.out.print((i+1) + "번째 과정 : ");
			for(int x : arr) {
				System.out.print(x + " ");
			}System.out.println();

		}
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		int part2 = partion(arr, start, end);
		if(start<part2-1) {
			quickSort(arr, start, part2-1);
		}
		
		if(part2 < end) {
			quickSort(arr, part2, end);
		}
	}
	
	public static int partion(int[] arr, int start, int end)  {
    	printProcess(arr);
    	int pivot = arr[(start+end)/2];
    	System.out.println(" -- s,p,e : " +start +" "+(start+end)/2+" "+end + " - pivot="+pivot);
    	while(start<=end) {	
    		while(arr[start] < pivot) start++;
    		while(arr[end] > pivot) end--;
    		if(start<=end) {	
    			swap(arr,start,end);
    			start++;
    			end--;
    		}
    	}
    	return start;
	}
	
    public static void printProcess(int[] arr) {
    	for(int i : arr)
    		System.out.print(i+" ");
    }
    
    public static void swap(int[] arr, int a, int b){
    	int tmp = arr[a];
    	arr[a] = arr[b];
    	arr[b] = tmp;
    }
}
