package com.demo.test;

import com.demo.Stack.StackImpl;

public class StackTest {

	public static void main(String[] args) {
		
		StackImpl stack=new StackImpl();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.display();
		stack.pop();
		stack.pop();
		stack.display();
		stack.push(80);
		stack.push(90);
		stack.display();
		
	}

}
