package com.demo.test;

import com.demo.service.SortService;

public class InsertionSortTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		SortService.acceptData(arr);
		SortService.displayData(arr);
		SortService.insertionSort(arr);
	}

}
