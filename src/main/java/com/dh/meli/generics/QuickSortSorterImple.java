package com.dh.meli.generics;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSortSorterImple<T extends Comparable<T>> implements Sorter<T>{

	private Comparator<T> comparator;

	@Override
	public void sort(T[] array, Comparator<T> comparator) {
        this.comparator = comparator;
		//Arrays.sort(array, comparator);
		quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
	}

	public void quickSort(T arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);

	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
	}
	
	private int partition(T arr[], int begin, int end) { //
	    T pivot = arr[end]; //
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	    	int result = comparator.compare(arr[j], pivot); //
	        if (result<=0) { //
	            i++;

	            T swapTemp = arr[i]; //
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    T swapTemp = arr[i+1]; //
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;

	    return i+1;
	}

}
