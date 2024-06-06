package com.demo.test;

import com.demo.service.AssignmentService;

public class Ques2_5_Test {

	public static void main(String[] args) {
		int[] arr = new int[5];
		AssignmentService.acceptData(arr);
		AssignmentService.displayData(arr);
		AssignmentService.countOcc(arr);
	}

}
