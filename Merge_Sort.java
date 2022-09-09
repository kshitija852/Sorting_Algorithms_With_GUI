package Sorting;

public class Merge_Sort {

	void merge(int[] array, int left, int mid, int right)
    {
        int a1 = mid - left + 1;
        int a2 = right - mid;
  
        int L[] = new int[a1];
        int R[] = new int[a2];
  
        for (int i = 0; i < a1; ++i)
            L[i] = array[left + i];
        for (int j = 0; j < a2; ++j)
            R[j] = array[mid + 1 + j];
  
        int i = 0, j = 0;
  
        int k = left;
        while (i < a1 && j < a2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
  
        while (i < a1) {
            array[k] = L[i];
            i++;
            k++;
        }
  
        while (j < a2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
  
    void sort(int arr[], int left, int right)
    {
        if (left < right) {
            
            int mid = left+ (right-left)/2;
  
           
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
  
            
            merge(arr, left, mid, right);
        }
    }
  
}
