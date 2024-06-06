package com.demo.searchTest;

import java.util.Scanner;

import com.demo.searchservice.SearchServices;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		SearchServices.acceptData(arr);
		SearchServices.displayData(arr);
		System.out.println("Enter the element you want to serach: ");
		int num = sc.nextInt();
		int pos = SearchServices.binarySearch(arr,num,0,arr.length-1);

		System.out.println("Your Value "+ num +" is at "+pos+ " index value ");
		sc.close();
	}

}
