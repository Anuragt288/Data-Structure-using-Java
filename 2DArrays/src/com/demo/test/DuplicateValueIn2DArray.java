package com.demo.test;

import com.demo.service.Array2DService;

public class DuplicateValueIn2DArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Array2DService.acceptData(arr);
		Array2DService.displayData(arr);
		Array2DService.findDuplicate(arr);
		System.out.println("Duplicate Value In Array : "  );
		}

}
