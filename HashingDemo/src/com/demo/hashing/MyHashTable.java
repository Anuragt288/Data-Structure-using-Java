package com.demo.hashing;



public class MyHashTable {

	Node[] heads;
	
	public MyHashTable(int size) {
		heads=new Node[size];
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
				
	}
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	public void insertData(int num) {
		
		Node newNode = new Node(num);
		int pos = num%heads.length;
	
		if(heads[pos]==null) {
			heads[pos]=newNode;
			
		}else {
			newNode.next=heads[pos];
			heads[pos]=newNode;
		}
		
		
	}
	
	public void displayData() {
		for(int i=0;i<heads.length;i++) {
			System.out.print(i+"----->");
			for(Node temp=heads[i];temp!=null;temp=temp.next) {
				System.out.print(temp.data+"--->");
			}
			System.out.print("null \n");
		}
	}
	


}
