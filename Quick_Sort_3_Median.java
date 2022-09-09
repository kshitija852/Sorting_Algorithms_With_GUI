package Sorting;

public class Quick_Sort_3_Median {
	
	 void swap(int[] arr, int i, int j)
	    {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	
	 int medianOf3(int[] arr, int left, int right) {
			int center = (left + right) / 2;

			if (arr[left] > arr[center])
				swap(arr, left, center);

			if (arr[left] > arr[right])
				swap(arr, left, right);

			if (arr[center] > arr[right])
				swap(arr, center, right);

			swap(arr, center, right - 1);
			return arr[right - 1];
		}
	    
	    void manualSort(int[] intArray, int left, int right) {
			int size = right - left + 1;
			if (size <= 1)
				return;
			if (size == 2) {
				if (intArray[left] > intArray[right])
					swap(intArray, left, right);
				return;
			} else {
				if (intArray[left] > intArray[right - 1])
					swap(intArray, left, right - 1);
				if (intArray[left] > intArray[right])
					swap(intArray, left, right);
				if (intArray[right - 1] > intArray[right])
					swap(intArray, right - 1, right);
			}
		}

	    int partition(int[] intArray, int left, int right, double pivot) {
			int leftPtr = left;
			int rightPtr = right - 1;
			while (true) {
				while (intArray[++leftPtr] < pivot)
					;
				while (intArray[--rightPtr] > pivot)
					;
				if (leftPtr >= rightPtr)
					break;
				else
					swap(intArray, leftPtr, rightPtr);
			}
			swap(intArray, leftPtr, right - 1);
			return leftPtr;
		}
	    
	    void sort(int[] arr, int left, int right) {
			int size = right - left + 1;
			if (size <= 3)
				manualSort(arr, left, right);
			else {
				double median = medianOf3(arr, left, right);
				int partition = partition(arr, left, right, median);
				sort(arr, left, partition - 1);
				sort(arr, partition + 1, right);
			}
		}

	

}
