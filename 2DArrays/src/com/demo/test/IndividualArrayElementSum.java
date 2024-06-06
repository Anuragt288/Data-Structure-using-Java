package com.demo.test;

import com.demo.service.Array2DService;

public class IndividualArrayElementSum {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Array2DService.acceptData(arr);
		System.out.println("**********************************");
		Array2DService.displayData(arr);
		System.out.println("**********************************");
		int sumArray = Array2DService.sumArray(arr);
		System.out.println("Sum of the Array : "+sumArray);
		System.out.println("**********************************");
		int sumIndiArray = Array2DService.sumIndiArray(arr);
		System.out.println("Sum of individual value of the array is : "+ sumIndiArray);
		System.out.println("**********************************");
	}

}
