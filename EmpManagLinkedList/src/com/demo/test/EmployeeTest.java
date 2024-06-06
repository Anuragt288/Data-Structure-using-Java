package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService es=new EmployeeServiceImpl();
		es.dataInput();
		int choice;
		do {
			System.out.println("1. add new employee by position\n2. display All");
			System.out.println("3. display by id\n4. display by name\n5. delete by id");
			System.out.println("6. exit\n choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1: 
				es.addnewEmp();
				break;
			case 2:
				es.displayAll();
				break;
			case 3:
				System.out.println("Enter Id for Search");
				int value=sc.nextInt();
				es.searchById(value);
				break;
			case 4:
				System.out.println("Enter name to search");
				String nm=sc.next();
				es.displayByName(nm);
				break;
			case 5:
				System.out.println("Enter id");
				int id=sc.nextInt();
				es.deleteById(id);
				break;
			case 6:
				sc.close();
				System.out.println("Thank you for visiting.... ");
				break;
			}
		}while(choice!=6);

	}

}
