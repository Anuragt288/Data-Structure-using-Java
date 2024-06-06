package com.demo.test;

import com.demo.service.SortService;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[5];
		SortService.acceptData(arr);
		SortService.displayData(arr);
		SortService.bubbleSort(arr);

	}

}
