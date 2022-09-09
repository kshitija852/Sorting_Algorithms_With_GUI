package Sorting;

public class Quick_Sort {
	
	void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    	
	int partition(int[] array, int low, int high)
    {
        
        int pivot = array[high];
        
        int i = (low - 1);
     
        for(int j = low; j <= high - 1; j++)
        {
             
            if (array[j] < pivot)
            {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }
	
	 void quickSort(int[] array, int low, int high)
	    {
	        if (low < high)
	        {
	            int par = partition(array, low, high);
	     
	            quickSort(array, low, par - 1);
	            quickSort(array, par + 1, high);
	        }
	    }
	 
	 

}
