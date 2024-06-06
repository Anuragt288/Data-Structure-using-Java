package com.demo.LinkedList;

import com.demo.model.Employee;

public class LinkedList {
	public Node head=null;
	class Node{
		Employee data;
		Node next;
		
		public Node(Employee ob)
		{
			data=ob;
			next=null;
		}
	}
	public void addEmployeeByPos(Employee ob,int pos)
	{
		if(head==null)
		{
			Node newNode=new Node(ob);
//			System.out.println("List is Empty");
			newNode.next=head;
			head=newNode;
			System.out.println("Data Added succesfully");
		}
		else {
			Node newNode=new Node(ob);
			if(pos==1)
			{
				newNode.next=head;
				head=newNode;
				System.out.println("Data Added succesfully");
			}
			else {
				Node temp=head;
				for(int i=0;temp!=null && i<pos-2;i++)
				{
					temp=temp.next;
				}
				if(temp!=null)
				{
					newNode.next=temp.next;
					temp.next=newNode;
					System.out.println("Data Added succesfully");
				}
			}
		}
	}
	
	
	public void displayall()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}else {
			for(Node temp = head;temp!=null;temp=temp.next) {
				System.out.println(temp.data);
			}
		}
	}


	


	public void deleteById(int id) {
		if(head==null) {
			System.out.println("List is empty");
			
		}else {
			Node temp=head;
			Node prev=null;
			
			if(head.data.getEid()==id) {
				head=head.next;
				temp.next=null;
				temp=null;
			}else {
				while(temp!=null && temp.data.getEid()!=id) {
					prev=temp;
					temp=temp.next;
					
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
					temp=null;
				}
			}
		}
		
	}


	public void findId(int value) {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			
			for(Node temp=head;temp!=null;temp=temp.next) {
				if(temp.data.getEid()==value) {
					System.out.println(temp.data);
				}
			}
			
		}
	}


	public void findByName(String nm) {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			for(Node temp=head;temp!=null;temp=temp.next) {
				if(temp.data.getEname().equals(nm)) {
					System.out.println(temp.data);
				}
			}
			
			
		}
		
	}
	

}
