package com.demo.service;

import java.util.Scanner;

public class Array2DService {

	static Scanner sc = new Scanner(System.in);
	
	public static void acceptData(int[][] arr) {
		for (int i = 0 ; i<arr.length;i++) {
			for(int j= 0 ; j<arr.length;j++) {
				System.out.println("Enter the "+(i+1)+""+(j+1)+" into array");
				
				arr[i][j]=sc.nextInt();
			}
		}
	  
	}

	public static void displayData(int[][] arr) {
		
		for (int i =0 ;i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				System.out.print(arr[i][j]+"  	 ");
			}
			System.out.println("");
		}
	
	}

	public static int maxElement(int[][] arr) {
		
		int max=0;
		
		for(int i=0 ; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
				
				
			}
		}
		
		return max;
	}

	public static int maxOdd(int[][] arr) {
		
		int maxOdd=0;
		
		for(int i=0 ; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i][j]>maxOdd && arr[i][j]%2 !=0 ) {
					maxOdd=arr[i][j];
				}
				
			}
		}
		
		return maxOdd;
	}

	public static int sumArray(int[][] arr) {
		
		int sum=0;
		for(int i=0 ; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				sum = sum+arr[i][j];			
				
				
			}
		}
		
		return sum;
	}

	private static int valueSum(int value) {
		
		int temp = value;
		int sum=0;
		while (temp!=0) {
			
			int x = temp%10;
			sum=sum+x;
			temp=temp/10;
			
		}
		return sum;
		
	}
	public static int sumIndiArray(int[][] arr) {
		int value;
		int sumArray=0;
		for(int i=0 ; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				value=arr[i][j];
				
				System.out.println("Individual value Sum of Array is"+(i+1)+""+(j+1)+"---->"+valueSum(value));
				
				sumArray=sumArray+valueSum(value);
				
			}
		}
		System.out.println("**********************************");
		return sumArray;
	}

	
	public static void findDuplicate(int[][] arr) {
		int count =0;
		int[] flatArray= new int[9];
		for(int i=0 ; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				flatArray[count] = arr[i][j];// n^2
				count++;
			}
		}
		
		int[] dupValue = checkDuplicate(flatArray);
		
		for(int i=0;i<dupValue.length;i++) {
			System.out.println("Duplicate values are : "+dupValue[i]);
		}
		
	}

	private static int[] checkDuplicate(int[] flatArray) {
		
		int [] arr = new int[flatArray.length/2];
		int count=0;
				
		for(int i =0;i<flatArray.length-1;i++) {
			
			int num = flatArray[i];
			boolean flag = checkExists(num,arr);
			if(!flag) {
				
				System.out.println("check :" +num);
				for(int j=i+1 ;j<flatArray.length;j++) {//n^2
					
					if(num==flatArray[j]) {
						arr[count]=num;
						count++;
						break;
					}
					
				}
				
			}
		
		}
		if(count>0) {
			return arr;
		}else {
			return null;
		}
	}

	private static boolean checkExists(int num , int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				return true;
			}
		}
		return false;
	}


	
}
