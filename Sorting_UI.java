package Sorting;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Sorting.Bubble_Sort;
import Sorting.Selection_Sort;
import Sorting.Insertion_Sort;
import Sorting.Merge_Sort;
import Sorting.Heap_Sort;
import Sorting.Quick_Sort;
import Sorting.Quick_Sort_3_Median;

public class Sorting_UI implements ActionListener {
	
	int[] array;
	
	JFrame frame;
	
	JTextField array_input;
	
	JPanel array_panel, button_panel, sort_panel, comparison_panel, text_panel;
	
	JButton Insertion_Sort_Button, Selection_Sort_Button, Bubble_Sort_Button, Merge_Sort_Button, Heap_Sort_Button, 
	        Quick_Sort_Button, Quick_3_Sort, Exit_Button, Compare_Button;
	
	JLabel array_label, arraysize_label, sort_label, display_label, unsort_label, displayy_label,
	InsertionSort_label, SelectionSort_label, BubbleSort_label, MergeSort_label, QuickSort3_label,
	QuickSort_label, HeapSort_label, timeTaken_label, text_label;
	
	long startTime, endTime;
	double timeTaken;
	final DecimalFormat df = new DecimalFormat("0.0000000000");
	String text;
	int size;
	
	public static void main(String args[]) {
		Sorting_UI su = new Sorting_UI();
	}
	
	public Sorting_UI()
	{
		      
		
		// Button for bubble sort
				Bubble_Sort_Button = new JButton();
				Bubble_Sort_Button.setBounds(110, 240, 210, 60);
				Bubble_Sort_Button.addActionListener(this);
				Bubble_Sort_Button.setText("Bubble Sort");
				Bubble_Sort_Button.setFocusable(false);
				Bubble_Sort_Button.setHorizontalTextPosition(JButton.CENTER);

		// Button for selection sort
				Selection_Sort_Button = new JButton();
				Selection_Sort_Button.setBounds(110, 240, 210, 60);
				Selection_Sort_Button.addActionListener(this);
				Selection_Sort_Button.setText("Selection Sort");
				Selection_Sort_Button.setFocusable(false);
				Selection_Sort_Button.setHorizontalTextPosition(JButton.CENTER);
				
		// Button for insertion sort
				Insertion_Sort_Button = new JButton();
				Insertion_Sort_Button.setBounds(110, 240, 210, 60);
				Insertion_Sort_Button.addActionListener(this);
				Insertion_Sort_Button.setText("Insertion Sort");
				Insertion_Sort_Button.setFocusable(false);
				Insertion_Sort_Button.setHorizontalTextPosition(JButton.CENTER);
				
	  // Button for merge sort
				Merge_Sort_Button = new JButton();
				Merge_Sort_Button.setBounds(110, 240, 210, 60);
				Merge_Sort_Button.addActionListener(this);
				Merge_Sort_Button.setText("Merge Sort");
				Merge_Sort_Button.setFocusable(false);
				Merge_Sort_Button.setHorizontalTextPosition(JButton.CENTER);
				
	 // Button for heap sort
				Heap_Sort_Button = new JButton();
				Heap_Sort_Button.setBounds(110, 240, 210, 60);
				Heap_Sort_Button.addActionListener(this);
				Heap_Sort_Button.setText("Heap Sort");
				Heap_Sort_Button.setFocusable(false);
				Heap_Sort_Button.setHorizontalTextPosition(JButton.CENTER);
				
	// Button for quick sort
				Quick_Sort_Button = new JButton();
				Quick_Sort_Button.setBounds(110, 240, 210, 60);
				Quick_Sort_Button.addActionListener(this);
				Quick_Sort_Button.setText("Quick Sort");
				Quick_Sort_Button.setFocusable(false);
				Quick_Sort_Button.setHorizontalTextPosition(JButton.CENTER);

	// Button for quick sort using 3 median
				Quick_3_Sort = new JButton();
				Quick_3_Sort.setBounds(110, 240, 210, 60);
				Quick_3_Sort.addActionListener(this);
				Quick_3_Sort.setText("Quick Sort using 3 median");
				Quick_3_Sort.setFocusable(false);
				Quick_3_Sort.setHorizontalTextPosition(JButton.CENTER);
				
	// Button for comparison
				Compare_Button = new JButton();
				Compare_Button.setBounds(110, 240, 210, 60);
				Compare_Button.addActionListener(this);
				Compare_Button.setText("Compare");
				Compare_Button.setFocusable(false);
				Compare_Button.setHorizontalTextPosition(JButton.CENTER);

	// Button for exit
				Exit_Button = new JButton();
				Exit_Button.setBounds(110, 240, 210, 60);
				Exit_Button.addActionListener(this);
				Exit_Button.setText("EXIT");
				Exit_Button.setFocusable(false);
				Exit_Button.setHorizontalTextPosition(JButton.CENTER);
				
                text_label = new JLabel("DAA SORTING ALGORITHMS !!!",JLabel.LEFT);
                //text_label.setText("DAA SORTING ALGORITHMS !!!");
                text_panel = new JPanel();
                text_panel.setBackground(Color.white);
                
				
	// Getting input for array elements
				array_label = new JLabel();
				array_label.setText("Enter the size of the array: ");
				array_panel = new JPanel();
				array_panel.setBackground(Color.WHITE);

	// Text field for getting array elements 
				array_input = new JTextField();
				array_input.setPreferredSize(new Dimension(630, 50));
				
	// Displaying the unsorted array, sorted array, time taken 
				sort_label = new JLabel();
				display_label = new JLabel();
				unsort_label = new JLabel();
				displayy_label = new JLabel();
				timeTaken_label = new JLabel();
								
				sort_panel = new JPanel();
				sort_panel.setLayout(new GridLayout(10, 3));
				sort_panel.setBackground(Color.white);
				
				
				button_panel = new JPanel();
				button_panel.setBackground(Color.white);
				button_panel.setPreferredSize(new Dimension(910, 60));
				button_panel.setLayout(new FlowLayout());
				
	// Panel for comparison of all sorts
				comparison_panel = new JPanel();
				comparison_panel.setPreferredSize(new Dimension(910, 110));
				comparison_panel.setLayout(new GridLayout(8, 2));
				MergeSort_label = new JLabel();
				HeapSort_label = new JLabel();
				QuickSort_label = new JLabel();
				InsertionSort_label = new JLabel();
				QuickSort3_label = new JLabel();
				SelectionSort_label = new JLabel();
				BubbleSort_label = new JLabel();
				
				frame = new JFrame();
				frame.setTitle("Sorting Algorithms");
				frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(1000, 800);
				
				frame.add(text_panel);
				text_panel.add(text_label);
				text_panel.setVisible(true);
				
				frame.add(array_panel);
				array_panel.add(array_label);
				array_panel.add(array_input);
				array_panel.setVisible(true);

				frame.add(button_panel);
				button_panel.add(Bubble_Sort_Button);
				button_panel.add(Selection_Sort_Button);
				button_panel.add(Insertion_Sort_Button);
				button_panel.add(Merge_Sort_Button);
				button_panel.add(Heap_Sort_Button);
				button_panel.add(Quick_Sort_Button);
				button_panel.add(Quick_3_Sort);
				button_panel.setVisible(true);
				
				frame.add(sort_panel);
				sort_panel.add(display_label);
				sort_panel.add(unsort_label);
				sort_panel.add(display_label);
				sort_panel.add(sort_label);
				sort_panel.add(timeTaken_label);

				frame.add(Compare_Button);
				frame.add(comparison_panel);
				comparison_panel.add(BubbleSort_label);
				comparison_panel.add(SelectionSort_label);
				comparison_panel.add(InsertionSort_label);
				comparison_panel.add(MergeSort_label);
				comparison_panel.add(HeapSort_label);
				comparison_panel.add(QuickSort_label);
				comparison_panel.add(QuickSort3_label);

				comparison_panel.setVisible(true);
				comparison_panel.setBackground(Color.white);
				
				frame.add(Exit_Button);
				

				frame.getContentPane().setBackground(Color.darkGray);
				frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
		// Button for Bubble sort
				if (e.getSource() == Bubble_Sort_Button) {
					Bubble_Sort bs = new Bubble_Sort();
					System.out.println("Bubble Sort");
					inputArray();
					
					System.out.println("Before sorting the elements:");
					display_label.setText("Before sorting the elements:");
					display(array);
					
					text = Arrays.toString(array);
					unsort_label.setText(text);
					startTime = System.nanoTime();
					bs.sort(array);
					endTime = System.nanoTime();
					timeTaken = endTime - startTime;
					timeTaken = timeTaken / 1000000000;
					System.out.println("Elements after sorting using Bubble Sort: ");
					display_label.setText("Elements after Sorting using Bubble Sort: ");
					display(array);
										
					text = Arrays.toString(array);
					sort_label.setText(text);
					
					System.out.println("Time taken by bubble sort " + df.format(timeTaken) + " seconds for input of size " + size);
					timeTaken_label.setText("Time taken by bubble sort " + df.format(timeTaken) + " seconds for input of size " + size);
				}
				
		// Button for selection sort
					if (e.getSource() == Selection_Sort_Button) {
						Selection_Sort ss = new Selection_Sort();
						System.out.println("Selection Sort");
						inputArray();
						
						System.out.println("Before Sorting");
						display_label.setText("Before Sorting");
						display(array);
						text = Arrays.toString(array);
						unsort_label.setText(text);
						startTime = System.nanoTime();
						ss.sort(array);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("After Sorting using Selection Sort");
						display_label.setText("After Sorting using Selection Sort");
						display(array);
						text = Arrays.toString(array);
						sort_label.setText(text);

						System.out.println("Time taken by selection sort " + df.format(timeTaken) + " seconds for input of size " + size);
						timeTaken_label.setText("Time taken by selection sort " + df.format(timeTaken) + " seconds for input of size " + size);
					}
					
		// Button for insertion sort
					if (e.getSource() == Insertion_Sort_Button) {
						Insertion_Sort is = new Insertion_Sort();
						System.out.println("Insertion Sort");
						inputArray();

						System.out.println("Before Sorting");
						display_label.setText("Before Sorting");
						display(array);
						text = Arrays.toString(array);
						unsort_label.setText(text);
						startTime = System.nanoTime();
						is.sort(array);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("After Sorting using Insertion Sort");
						display_label.setText("After Sorting using Insertion Sort");
						display(array);
						text = Arrays.toString(array);
						sort_label.setText(text);

						System.out.println("Time taken by insertion sort " + df.format(timeTaken) + " seconds for input of size " + size);
						timeTaken_label.setText("Insertion sort took " + df.format(timeTaken) + " seconds for input with array length " + size);
					}
				
		// Button for merge sort
					if (e.getSource() == Merge_Sort_Button) {
						Merge_Sort ms = new Merge_Sort();
						System.out.println("Merge Sort");
						inputArray();

						System.out.println("Before Sorting");
						display_label.setText("Before Sorting");
						display(array);
						text = Arrays.toString(array);
						unsort_label.setText(text);
						startTime = System.nanoTime();
						ms.sort(array, 0, array.length - 1);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("After Sorting using Merge Sort");
						display_label.setText("After Sorting using Merge Sort");
						display(array);
						text = Arrays.toString(array);
						sort_label.setText(text);

						System.out.println("Time taken by merge sort " + df.format(timeTaken) + " seconds for input of siez " + size);
						timeTaken_label.setText("Merge sort took " + df.format(timeTaken) + " seconds for input with array length " + size);
					}
					
		// Button for heap sort
					if (e.getSource() == Heap_Sort_Button) {
						
						Heap_Sort hs = new Heap_Sort();
						System.out.println("Heap Sort");
						inputArray();

						System.out.println("Before Sorting");
						display_label.setText("Before Sorting");
						display(array);
						text = Arrays.toString(array);
						unsort_label.setText(text);
						startTime = System.nanoTime();
						hs.sort(array);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("After Sorting using Heap Sort");
						display_label.setText("After Sorting using Heap Sort");
						display(array);
						text = Arrays.toString(array);
						sort_label.setText(text);

						System.out.println("Time taken by heap sort " + df.format(timeTaken) + " seconds for input of size " + size);
						timeTaken_label.setText("Time taken by heap sort " + df.format(timeTaken) + " seconds for input of size " + size);
					}
					
	 // Button for quick sort
					if (e.getSource() == Quick_Sort_Button) {
						Quick_Sort qs = new Quick_Sort();
						System.out.println("Quick Sort");
						inputArray();

						System.out.println("Before Sorting");
						display_label.setText("Before Sorting");
						display(array);
						text = Arrays.toString(array);
						unsort_label.setText(text);
						startTime = System.nanoTime();

						qs.quickSort(array, 0, array.length - 1);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("After Sorting using Quick Sort");
						display_label.setText("After Sorting using Quick Sort");
						display(array);
						text = Arrays.toString(array);
						sort_label.setText(text);

						System.out.println("Quick sort took " + df.format(timeTaken) + " seconds for input of size " + size);
						timeTaken_label.setText("Quick sort took " + df.format(timeTaken) + " seconds for input of size " + size);
					}

	// Button for Quick Sort using 3 median 
					if (e.getSource() == Quick_3_Sort) {
						 Quick_Sort_3_Median qm = new Quick_Sort_3_Median();
						System.out.println("Quick SORT using 3 median ");
						inputArray();

						System.out.println("Before Sorting");
						display_label.setText("Before Sorting");
						display(array);
						text = Arrays.toString(array);
						unsort_label.setText(text);
						startTime = System.nanoTime();
						qm.sort(array, 0, array.length-1);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("After Sorting using Quick Sort 3 median ");
						display_label.setText("After Sorting using Quick Sort 3 median ");
						display(array);
						text = Arrays.toString(array);
						sort_label.setText(text);

						System.out.println("Time taken by Quick Sort using 3 median " + df.format(timeTaken)	+ " seconds for input of size " + size);
						timeTaken_label.setText("Quick Sort using 3 median  took " + df.format(timeTaken)	+ " seconds for input of size " + size);
					}
					
		// Button for comparison 
					if (e.getSource() == Compare_Button) {

						// Bubble Sort
						startTime = System.nanoTime();
						Bubble_Sort bs1 = new Bubble_Sort();
						bs1.sort(array);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("BubbleSort :" + df.format(timeTaken));
						BubbleSort_label.setText("Bubble Sort :" + df.format(timeTaken));
						System.out.println();

						// Selection Sort
						startTime = System.nanoTime();
						Selection_Sort ss1 = new Selection_Sort();
						ss1.sort(array);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("Selection Sort :" + df.format(timeTaken));
						SelectionSort_label.setText("SelectionSort :" + df.format(timeTaken));
						
						// Insertion Sort
						startTime = System.nanoTime();
						Insertion_Sort is1 = new Insertion_Sort();
						is1.sort(array);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("Insertion Sort :" + df.format(timeTaken));
						InsertionSort_label.setText("InsertionSort		 :" + df.format(timeTaken));

						// Merge Sort
						startTime = System.nanoTime();
						Merge_Sort ms1 = new Merge_Sort();
						ms1.sort(array, 0, array.length - 1);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("MergeSort :" + df.format(timeTaken));
						MergeSort_label.setText("Merge Sort :" + df.format(timeTaken));
						
						// Heap Sort
						startTime = System.nanoTime();
						Heap_Sort hs1 = new Heap_Sort();
						hs1.sort(array);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("Heap Sort :" + df.format(timeTaken));
						HeapSort_label.setText("Heap Sort :" + df.format(timeTaken));

						// Quick Sort
						startTime = System.nanoTime();
						Quick_Sort qs1 = new Quick_Sort();
						qs1.quickSort(array, 0, array.length - 1);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("Quick Sort :" + df.format(timeTaken));
						QuickSort_label.setText("Quick Sort :" + df.format(timeTaken));

						// Quick Sort using 3 median
						startTime = System.nanoTime();
						Quick_Sort_3_Median qm = new Quick_Sort_3_Median();
						qm.sort(array, 0, size-1);
						endTime = System.nanoTime();
						timeTaken = endTime - startTime;
						timeTaken = timeTaken / 1000000000;
						System.out.println("Quick Sort using 3 median :" + df.format(timeTaken));
						QuickSort3_label.setText("Quick Sort using 3 median :" + df.format(timeTaken));

					}								
					
					if(e.getSource() == Exit_Button)
					{
						System.exit(0);
					}
		
	}
	
	public void inputArray() {

		Random rand = new Random();
		
		String InputArray = array_input.getText();
		
		 size = Integer.parseInt(InputArray);
		
		IntStream ints = rand.ints(size, 0, 1000).distinct();
		
		 array = ints.toArray();
	
		display(array);

	}

	public void display(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}