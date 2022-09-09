package Sorting;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Random;

import Sorting.Bubble_Sort;
import Sorting.Selection_Sort;
import Sorting.Insertion_Sort;
import Sorting.Merge_Sort;
import Sorting.Heap_Sort;
import Sorting.Quick_Sort;
import Sorting.Quick_Sort_3_Median;

public class Daa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long starttime, endtime;
		
		double time_taken;
		
		final DecimalFormat df = new DecimalFormat("0.0000000000");
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();

		int choice = 0;

		do 
		{
			System.out.println("Select the algorithm to be sorted:");
			System.out.println("1. Bubble Sort");
			System.out.println("2. Selection Sort");
			System.out.println("3. Insertion Sort");
			System.out.println("4. Merge Sort");
			System.out.println("5. Heap Sort");
			System.out.println("6. Quick Sort(Regular)");
			System.out.println("7. Quick Sort(3 Median)");
			System.out.println("8. Comparion between all the sorts ");

			choice = sc.nextInt();

			System.out.println("Enter the size of the array:");

			int size = sc.nextInt();
			
			IntStream ints = rand.ints(size, 0, Integer.MAX_VALUE).distinct();
			
			int[] array = ints.toArray();

			System.out.println();


			System.out.println("Elements before sorting:");

			for (int i = 0; i < size; i++) {
				System.out.print(" ");
				System.out.print(array[i]);
			}
			
		   System.out.println();
		   System.out.println();
			
		   switch(choice)
		   {
		   case 1:
			   
			   starttime = System.nanoTime();
			   
			   Bubble_Sort b1 = new Bubble_Sort();
			   
			   b1.sort(array);
			    
			   System.out.println("After sorting using Bubble Sort:");
			   
			   for(int i=0;i<size;i++)
			   {
				   System.out.print(" ");
				   System.out.print(array[i]);
			   }
			   
			   endtime = System.nanoTime();
			   
			   time_taken = endtime - starttime;
			  
			   time_taken = time_taken / 1000000000;
			   
			   System.out.println();
			   System.out.println();
			   
			   System.out.println(" Time taken by Bubble Sort: " + df.format(time_taken)
				+ " seconds for array with size " + size);
			   
			   System.out.println();
			   System.out.println();
		break;
		
		   case 2:
			   
               starttime = System.nanoTime();
			   
			   Selection_Sort s1 = new Selection_Sort();
			   
			   s1.sort(array);
			    
			   System.out.println("After sorting using Selection Sort:");
			   
			   for(int i=0;i<size;i++)
			   {
				   System.out.print(" ");
				   System.out.print(array[i]);
			   }
			   
			   endtime = System.nanoTime();
			   
			   time_taken = endtime - starttime;
			  
			   time_taken = time_taken / 1000000000;
			   
			   System.out.println();
			   System.out.println();
			   
			   System.out.println(" Time taken by Selection Sort: " + df.format(time_taken)
				+ " seconds for array with size " + size);
			   
			   System.out.println();
			   System.out.println();
		break;
		
		   case 3:
			   
			   starttime = System.nanoTime();
			   
			   Insertion_Sort i1 = new Insertion_Sort();
			   
			   i1.sort(array);
			   
			   System.out.println("After sorting using Insertion Sort:" );
			   
			   for(int i=0;i<size;i++)
			   {
				   System.out.print(" ");
				   System.out.print(array[i]);
				   				   
			   }
			   
			   endtime = System.nanoTime();
			   
			   time_taken = endtime - starttime;
			   
			   time_taken = time_taken / 1000000000;
			   
			   System.out.println();
			   System.out.println();
			   
			   System.out.println("Time taken by Insertion Sort" + df.format(time_taken)
			    + " seconds for array with size " + size);
			   
			   System.out.println();
			   System.out.println();
			   
			   break;
			   
		   case 4:
			   
			   starttime = System.nanoTime();
			   
			   Merge_Sort ss1 = new Merge_Sort();
			   
			   ss1.sort(array,0,size-1);
			   
			   System.out.println("After sorting using Merge Sort:");
			   
			   for(int i=0;i<size;i++)
			   {
				   System.out.print(" ");
				   System.out.print(array[i]);
			   }
			   
			   endtime = System.nanoTime();
			   
			   time_taken = endtime - starttime;
			   
			   time_taken = time_taken / 1000000000;
			   
			   System.out.println();
			   System.out.println();
			   
			   System.out.println("Time taken by Merge Sort" + df.format(time_taken)
			    + " seconds for array with size " + size);
			   
			   System.out.println();
			   System.out.println();
			   
			   break;
			   
		   case 5:
			   
			   starttime = System.nanoTime();
			   
			   Heap_Sort h1 = new Heap_Sort();
			   
			   h1.sort(array);
			   
			   System.out.println("After sorting using Heap Sort:");
			   
			   for(int i=0;i<size;i++)
			   {
				   System.out.print(" ");
				   System.out.print(array[i]);
			   }
			   
			   endtime = System.nanoTime();
			   
			   time_taken = endtime - starttime;
			   
			   time_taken = time_taken / 1000000000;
			   
			   System.out.println();
			   System.out.println();
			   
			   System.out.println("Time taken by Heap Sort" + df.format(time_taken)
			    + " seconds for array with size " + size);
			   
			   System.out.println();
			   System.out.println();
			   
			   break;
			   
		   case 6:
			   
			   starttime = System.nanoTime();
			   
			   Quick_Sort q1 = new Quick_Sort();
			   
			   q1.quickSort(array, 0, size-1);
			   
               System.out.println("After sorting using Quick Sort:");
			   
			   for(int i=0;i<size;i++)
			   {
				   System.out.print(" ");
				   System.out.print(array[i]);
			   }
			   
			   endtime = System.nanoTime();
			   
			   time_taken = endtime - starttime;
			   
			   time_taken = time_taken / 1000000000;
			   
			   System.out.println();
			   System.out.println();
			   
			   System.out.println("Time taken by Quick Sort" + df.format(time_taken)
			    + " seconds for array with size " + size);
			   
			   System.out.println();
			   System.out.println();
			   
			   break;
			   
		   case 7:
			   starttime = System.nanoTime();
			   
			   Quick_Sort_3_Median qm = new Quick_Sort_3_Median();
			   
			   qm.sort(array, 0, size-1);
			   
			   System.out.println("After sorting using Quick Sort 3 Median:");
			   
			   for(int i=0;i<size;i++)
			   {
				   System.out.print(" ");
				   System.out.print(array[i]);
			   }
			   
			   endtime = System.nanoTime();
			   
			   time_taken = endtime - starttime;
			   
			   time_taken = time_taken / 1000000000;
			   
			   System.out.println();
			   System.out.println();
			   
			   System.out.println("Time taken by Quick Sort using 3 Median" + df.format(time_taken)
			    + " seconds for array with size " + size);
			   
			   System.out.println();
			   System.out.println();
			   
			   break;
			   
		   case 8:
			   
			   System.out.println();
			   
			    // Bubble Sort
				Bubble_Sort bs1 = new Bubble_Sort();
				starttime = System.nanoTime();
				bs1.sort(array);
				endtime = System.nanoTime();
				time_taken = endtime - starttime;
				time_taken = time_taken / 1000000000;
				System.out.println("Time taken by Bubble Sort :" + df.format(time_taken) + " seconds");
				 System.out.println();
				

				// Selection Sort
				Selection_Sort ss2 = new Selection_Sort();
				starttime = System.nanoTime();
				ss2.sort(array);
				endtime = System.nanoTime();
				time_taken = endtime - starttime;
				time_taken = time_taken / 1000000000;
				System.out.println("Time taken by Selection Sort :" + df.format(time_taken) + " seconds");
				 System.out.println();
				 

				// Insertion Sort
				Insertion_Sort is1 = new Insertion_Sort();
				starttime = System.nanoTime();
				is1.sort(array);
				endtime = System.nanoTime();
				time_taken = endtime - starttime;
				time_taken = time_taken / 1000000000;
                System.out.println("Time taken by Insertion Sort :" + df.format(time_taken) + " seconds");
				 System.out.println();
				 
				
				// Merge Sort
				Merge_Sort ms1 = new Merge_Sort();
				starttime = System.nanoTime();
				ms1.sort(array, 0, array.length - 1);
				endtime = System.nanoTime();
				time_taken = endtime - starttime;
				time_taken = time_taken / 1000000000;
				System.out.println("Time taken by Merge Sort :" + df.format(time_taken) + " seconds");
				 System.out.println();
				
				 
				// Heap Sort
				Heap_Sort hs1 = new Heap_Sort();
				starttime = System.nanoTime();
				hs1.sort(array);
				endtime = System.nanoTime();
				time_taken = endtime - starttime;
				time_taken = time_taken / 1000000000;
				System.out.println("Time taken by Heap Sort :" + df.format(time_taken) + " seconds");
				System.out.println();
				

				// Quick Sort
				Quick_Sort qs1 = new Quick_Sort();
				starttime = System.nanoTime();
				qs1.quickSort(array, 0, array.length - 1);
				endtime = System.nanoTime();
				time_taken = endtime - starttime;
				time_taken = time_taken / 1000000000;
				System.out.println("Time taken by Quick Sort :" + df.format(time_taken) + " seconds");
				 System.out.println();

				 
				// Quick Sort using 3 median
				Quick_Sort_3_Median qs3 = new Quick_Sort_3_Median();
				starttime = System.nanoTime();
				qs3.sort(array, 0, array.length - 1);
				endtime = System.nanoTime();
				time_taken = endtime - starttime;
				time_taken = time_taken / 1000000000;
				System.out.println("Time taken by Quick Sort using 3 median :" + df.format(time_taken) + " seconds");
				 System.out.println();

				break;

			   
		   default:
				   System.out.println("Wrong Choice !!!");
				   break;
		   }

		}while(true);
	}

}
