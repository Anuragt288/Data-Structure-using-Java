package com.demo.Stack;

public class StackImpl {

	Node top=null;
	class Node{
		
		int data;
		Node next;
		public Node(int val) {
			data=val;
			next=null;
		}
		
	}

	public void push(int val) {
		
		Node newNode=new Node(val);
		
		if(top==null) {
			top= newNode;
			System.out.println(val+ ": Pushed");
		}else {
			
			newNode.next=top;
			top=newNode;
			System.out.println(val+ ": Pushed");
			
		}
		
	}
	
	
	public void pop() {
		
		if(top==null) {
			System.out.println("Stack is Empty ");
			
		}else {
			Node temp=top;
			System.out.println(temp.data+": Poped Data");
			top = top.next;
			temp.next=null;
			temp=null;
			
		}
		
	}
	
	public void display() {
		for(Node temp=top;temp!=null;temp=temp.next) {
			System.out.println("| "+temp.data+" |");
		}
		System.out.println(" ----");
		
	}
	
}
