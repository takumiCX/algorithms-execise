package com.takumicx.niukewang;

import java.util.Scanner;

public class TreeHeight {
	
	
	
	static int[] nodes=new int[1001];
	
	static int[] children=new int[1001];
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		for(int i=0;i<nodes.length;i++){
			
			nodes[i]=-1;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		int total = scanner.nextInt();
		
		for(int i=1;i<total;i++){
			
			int father=scanner.nextInt();
			
			int son=scanner.nextInt();
			
			nodes[son]=father;
			
			children[father]+=1;
			
		}
		
		int max=0;
		
		for(int i=0;i<nodes.length;i++){
			
			if(nodes[i]!=-1&&children[nodes[i]]<3){
				
				int height=getHeight(i);
				
				max=height>max?height:max;
			}
			
		}
		
		System.out.println(max);
		
	}

	private static int getHeight(int i) {
		
		int count=1;
		
		while(nodes[i]!=-1){
			
			count++;
			
			if(children[nodes[i]]>2){
				return 0;
			}
			
			i=nodes[i];
		}
		return count;
	}

}

