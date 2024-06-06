package com.demo.service;

import java.util.Scanner;

public class SortService {

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

		public static void insertionSort(int[] arr) {
			
			//int key,k,j;
			
//			for(int i=1;i<arr.length;i++) {
//				int key = arr[i];
//				int j=i-1;
//				while(arr[j]>key && j>=0) {
//					arr[j+1]=arr[j];
//					j--;
//
//				}
//				arr[j+1]=key;
//			}
			
			for(int i=1;i<arr.length;i++) {
				int key = arr[i];
				int j=i-1;
				while(j>=0 && arr[j]>key  ) {
					arr[j+1]=arr[j];
					j--;

				}
				arr[j+1]=key;
			}
			
			for(int i=0;i<arr.length;i++) {
				System.out.print(i+"---------> "+arr[i]+" | ");
			}
			
		}

		
		
		public static void bubbleSort(int[] arr) {
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j]= arr[j+1];
						arr[j+1]=temp;
					}
					
				}
			}
			
			displayData(arr);
			
			
			
		}

		public static void selectionSort(int[] arr) {
			int min,j;
			for(int i=0;i<arr.length-1;i++) {
				min=i;
				for( j =i+1;j<arr.length;j++) {
					if(arr[j]<arr[min]) {
						min=j;
						
					}
				}
				int temp = arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
				
				
			}
			
			
			displayData(arr);
			
			
		}

		private static int findMax(int [] arr) {
			int max=0;
			for(int i=0;i<arr.length;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			
			return max;
		}
		public static void countSort(int[] arr) {
			
			int max=findMax(arr);
			int [] countArr = new int[max+1];
			for(int num : arr) {
				countArr[num]++;
			}
			int index=0;
			for(int i=0;i<countArr.length;i++) {
				while(countArr[i]>0) {
					arr[index]=i;
					index++;
					countArr[i]--;
				}
			}
			System.out.println("After Sorting : ");
			System.out.println("-------------------------------");
			displayData(arr);
			
		}
		
		
		
		
		
}
