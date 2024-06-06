package com.demo.service;

import java.util.Scanner;

import com.demo.LinkedList.LinkedList;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	LinkedList lst;
   public EmployeeServiceImpl() {
		
		 lst = new LinkedList();
	}
  
	Scanner sc=new Scanner(System.in);
	
	public void dataInput() {
		lst.addEmployeeByPos(new Employee(101,"Aryman",250000),1);
		lst.addEmployeeByPos(new Employee(102,"Anurag",200000),2);
		lst.addEmployeeByPos(new Employee(103,"Dhruv",250000),3);
		lst.addEmployeeByPos(new Employee(104,"Ankit",250000),4);
		lst.addEmployeeByPos(new Employee(105,"Bob",250000),5);
	}

	
	@Override
	public void addnewEmp() {
		//dataInput();
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String nm=sc.next();
		System.out.println("Enter Salary");
		double sal=sc.nextDouble();
		System.out.println("Enter Position");
		int pos=sc.nextInt();
		
		lst.addEmployeeByPos(new Employee(id,nm,sal),pos);
		
	
	}
	@Override
	public void displayAll() {
		//dataInput();
		lst.displayall();
	}
	
	@Override
	public void deleteById(int id) {
		lst.deleteById(id);
		
	}


	@Override
	public void searchById(int value) {
		lst.findId(value);
		
	}

	@Override
	public void displayByName(String nm) {
		lst.findByName(nm);
	}
	
	

}
