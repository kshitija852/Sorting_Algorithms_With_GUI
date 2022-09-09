package Sorting;


public class Selection_Sort {

	public void sort(int array[])
	{
		int size = array.length;
		
		for (int i = 0; i < size; i++) {

			int min = i;
			for (int j = i + 1; j < size; j++)
				if (array[j] < array[min])
					min = j;

			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
}
