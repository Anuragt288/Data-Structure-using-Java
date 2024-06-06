package com.demo.test;

import com.demo.service.Array2DService;

public class Array_2D {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		Array2DService.acceptData(arr);
		Array2DService.displayData(arr);
		int maxElement = Array2DService.maxElement(arr);
		System.out.println("Max element in the array is "+maxElement);
	}

}
