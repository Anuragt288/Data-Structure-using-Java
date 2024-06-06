package com.demo.searchTest;

import com.demo.searchservice.SearchServices;

public class SearchSeqTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int value=0;
		SearchServices.acceptData(arr);
		SearchServices.displayData(arr);
		int index = SearchServices.seqSearch(arr,value);
		System.out.println("your serach value is at : "+ index + " Index" );
	}

}
