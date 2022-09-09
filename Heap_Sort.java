package Sorting;

public class Heap_Sort {
	
	void heapify(int array[], int n, int i)
    {
        int large = i; 
        int left = 2 * i + 1;
        int right = 2 * i + 2; 
 
        if (left < n && array[left] > array[large])
            large = left;
 
        if (right < n && array[right] > array[large])
            large = right;

        if (large != i) {
            int swap = array[i];
            array[i] = array[large];
            array[large] = swap;
 
            heapify(array, n, large);
        }
    }
	
	void sort(int arr[])
    {
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

}
