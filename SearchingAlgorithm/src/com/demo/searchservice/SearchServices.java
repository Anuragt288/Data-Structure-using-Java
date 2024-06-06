package com.demo.searchservice;

import java.util.Scanner;

public class SearchServices {

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

	public static int seqSearch(int[] arr, int value) {
		int index=0;
		System.out.println("Enter the value you want to search");
		value=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(value==arr[i]) {
				index=i;
				break;
			}
		
		}
		
		return index;
	}

	public static int binarySearch(int[] arr, int num, int low, int high) {
		int mid = (low+high)/2;
		if(arr[mid]==num) {
			return mid;
			
		}else {
			if(arr[mid]<num) {
				return binarySearch(arr,num,mid+1,high);
			}else {
				return binarySearch(arr,num,low,mid-1);
			}
				
			
			
			
		}
	
		
		
		
	}
	
	

}
