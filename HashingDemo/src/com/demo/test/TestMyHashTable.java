package com.demo.test;

import com.demo.hashing.MyHashTable;

public class TestMyHashTable {

	public static void main(String[] args) {
		
		MyHashTable table=new MyHashTable(5);
		table.insertData(50);
		table.insertData(60);
		table.insertData(70);
		table.insertData(45);
		table.insertData(24);
		table.insertData(21);
		table.displayData();
	}

}
