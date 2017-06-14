import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sorting {
	public static void main(String []args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("src/sortData.txt"));
		
		int[] slowArr = new int[100];
		int[] fastArr = new int[100];
		int i = 0;
		int size = 0;
		
		//initialize the 2 arrays from data in textfile
		while (in.hasNextInt()) {
			int read = in.nextInt();
			slowArr[i] = read;
			fastArr[i] = read;
			i++;
			size++;
		}

		System.out.println("Before Bubble Sort: ");
		print(slowArr, size);
		System.out.println("After Bubble Sort: ");
		bubbleSort(slowArr, size);
		print(slowArr, size);
		
		System.out.println("\nBefore Quick Sort: ");
		print(fastArr, size);
		System.out.println("After Quick Sort: ");
		quickSort(fastArr, size);
		print(fastArr, size);
		
		in.close();
	}
	
	public static void print(int[] a, int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(int[] x, int size) {
		for(int i = size - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(x[j] > x[j+1]) {
					int temp = x[j+1];
					x[j+1] = x[j];
					x[j] = temp;
				}
			}
		}
	}
	
	public static void quickSort(int[] x, int size) {
		qsort(x, 0, size - 1);
	}
	
	public static void exchange(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	public static void qsort(int[] x, int lower, int higher) {
		int p = (lower + higher) / 2;
		int pivot = x[p];
		exchange(x, p, higher);
		
		int l = lower;
		int r = higher;
		while(l < r) {
			while(x[l] < pivot)
				l++;
			while(x[r] > pivot) 
				r--;
			if (l <= r) {
				exchange(x, l, r);
				l++;
				r--;
			}
		}

		if (lower < r)
			qsort(x, lower, r);
		if (l < higher)
			qsort(x, l, higher);	
	}
}
