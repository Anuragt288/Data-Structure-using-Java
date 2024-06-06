package com.demo.test;

import com.demo.service.Array2DService;

public class Array2DMaxOdd {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Array2DService.acceptData(arr);
		Array2DService.displayData(arr);
		int maxOdd = Array2DService.maxOdd(arr);
		System.out.println("Max Odd No is : " + maxOdd );

	}

}
