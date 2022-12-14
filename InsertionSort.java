package com.blz.day16_17problems;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort();	
	}

	  public static void sort() {
	    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(634, 235, 7, 25, 134, 21, 54, 241, 4));
	    System.out.println("start " + numbers);
	    insertionSort(numbers);
	    System.out.println("end " + numbers);
	  }

	  private static void insertionSort(ArrayList<Integer> numbers) {
	    for (int i = 1; i < numbers.size(); i++) {
	      int current = numbers.get(i);
	      int j = i - 1;
	      while (j >= 0 && current < numbers.get(j)) {
	        numbers.set(j + 1, numbers.get(j));
	        j--;
	      }
	      numbers.set(j + 1, current);
	    }
	}
}
