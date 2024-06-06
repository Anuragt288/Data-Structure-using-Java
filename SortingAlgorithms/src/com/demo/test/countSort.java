package com.demo.test;

import com.demo.service.SortService;

public class countSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		SortService.acceptData(arr);
		SortService.displayData(arr);
		SortService.countSort(arr);
		
	}

}
