package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Main1034 {
	
	static int[][] graph=new int[2000][2000];
	
	static int edgeNum=0;
	
	static int threshold =0;
	
	static boolean[] visited=new boolean[26];
	
	static int vertextNum=0;
	
	static Map<String,Integer> map=new HashMap<String,Integer>();
	
	static Map<Integer,String> map2=new HashMap<Integer, String>();
	
	static class Node{
		
		int index;
		
		int weight;
		
		String name;
		
		int num;
	}
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		edgeNum=Reader.nextInt();
		
		threshold=Reader.nextInt();
		
		for(int k=0;k<edgeNum;k++){
			
			String from=Reader.next();
			
			Integer i = map.get(from);
			
			if(i==null){
				
				i=vertextNum;
				
				map.put(from, i);
				map2.put(i, from);
				vertextNum++;
				
			}
			
			String to=Reader.next();
			
			Integer j = map.get(to);
			
			if(j==null){
				
				j=vertextNum;
				map.put(to,j);
				map2.put(j,to);
				vertextNum++;
			}
			
			int weight=Reader.nextInt();
			
			graph[i][j]+=weight;
			graph[j][i]+=weight;
			
			
		}
		
		List<Node> list2 = new ArrayList<Node>();
		
		for(int i=0;i<vertextNum;i++){
			
			if(!visited[i]){
				
				List<Node> list = new ArrayList<Node>();
				
				dfs(i,list);
				
				if(list.size()>2){
					
					int sum=0;
					
					for(Node node:list){
						sum+=node.weight;
					}
					
					if(sum>threshold*2){
					
						Collections.sort(list,new Comparator<Node>() {

							@Override
							public int compare(Node o1, Node o2) {
								// TODO Auto-generated method stub
								return o2.weight-o1.weight;
							}
						});
						
						Node node = list.get(0);
						node.num=list.size();
						
						list2.add(node);
					}
				}
				
			}
			
		}
		
		System.out.println(list2.size());
		
		if(list2.size()>0){
			
			Collections.sort(list2,new Comparator<Node>() {

				@Override
				public int compare(Node o1, Node o2) {
					// TODO Auto-generated method stub
					return o1.name.compareTo(o2.name);
				}
			});
			for(int i=0;i<list2.size();i++){
				
				Node node = list2.get(i);
				
				System.out.format("%s %d",node.name,node.num);
				System.out.println();
			}
		}
		
		
	}

	private static void dfs(int i, List<Node> list) {
		// TODO Auto-generated method stub
		
		visited[i]=true;
		
		int sum=0;
		
		for(int j=0;j<vertextNum;j++){
			sum+=graph[i][j];
		}
		
		if(sum>0){
			Node node = new Node();
			
			node.index=i;
			
			node.name=map2.get(i);
			
			node.weight=sum;
			list.add(node);
		}
		
		for(int j=0;j<vertextNum;j++){
			
			if(graph[i][j]!=0&&!visited[j]){
				dfs(j,list);
			}
		}
		
	}

}
