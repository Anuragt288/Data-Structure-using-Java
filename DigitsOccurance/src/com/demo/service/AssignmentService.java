package com.demo.service;

import java.util.Scanner;

public class AssignmentService {
	static Scanner sc = new Scanner(System.in);

	public static void acceptData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" elememnt in the array");
			arr[i]=sc.nextInt();
		}
		
	}

	public static void displayData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+" Index Value"+"---->"+arr[i]+"  |  ");
		}
		System.out.println("");
		System.out.println("----------------------------------------");
	}
	private static void showOcc(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" Value Occured "+"---->"+arr[i]+" time in the array ");
		}	
	}
	public static void countOcc(int[] arr) {
		int max=findMax(arr);
		int [] countArr = new int[max+1];
		for(int num : arr) {
			countArr[num]++;
		}		
		showOcc(countArr);
	}
	private static int findMax(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		 return max;	 
	}	
}
