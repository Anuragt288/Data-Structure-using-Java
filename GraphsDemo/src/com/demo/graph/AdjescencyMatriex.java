package com.demo.graph;

import java.util.Scanner;

public class AdjescencyMatriex {

	int [][] graph;
	
	public AdjescencyMatriex(int num) {
		graph=new int[num][num];
	}

	Scanner sc = new Scanner(System.in);
	
	public void addGraph() {
		for (int i = 0 ; i<graph.length;i++) {
			for(int j= 0 ; j<graph.length;j++) {
				System.out.println("Edges the "+i+":"+j);
				
				graph[i][j]=sc.nextInt();
			}
		}
	  
	}
	
	public void displayGraph() {
		
		for (int i =0 ;i<graph.length;i++) {
			for(int j=0; j<graph.length;j++) {
				System.out.print(graph[i][j]+"  	 ");
			}
			System.out.println("");
		}
	
	}

	
	
}
