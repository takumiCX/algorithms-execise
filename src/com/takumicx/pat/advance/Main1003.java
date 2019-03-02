package com.takumicx.pat.advance;


public class Main1003 {

	static int cityNum;

	static int roadNum;

	static int start;

	static int end;

	static int[] vertextWeight;
	
	static int[] weight;

	static int[][] graph;

	static boolean[] collected;

	static int[] dist;

	static int[] solutionNum;

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		cityNum = Reader.nextInt();

		roadNum = Reader.nextInt();

		start = Reader.nextInt();

		end = Reader.nextInt();

		init();
		
		weight[start]=vertextWeight[start];
		
		for(int i=0;i<cityNum;i++){
			if(graph[start][i]!=Integer.MAX_VALUE&&!collected[i]){
				dist[i]=graph[start][i];
				solutionNum[i]=solutionNum[start];
				weight[i]=weight[start]+vertextWeight[i];
			}
		}
		
		while(true){
			
			int small=Integer.MAX_VALUE;
			
			int index=-1;
			
			for(int i=0;i<cityNum;i++){
				
				if(dist[i]<small&&!collected[i]){
					small=dist[i];
					index=i;
				}
				
			}
			
			if(index==end) break;
			
			collected[index]=true;
			
			for(int i=0;i<cityNum;i++){
				
				if(graph[index][i]!=Integer.MAX_VALUE&&!collected[i]){
					
					if(dist[i]>dist[index]+graph[index][i]){
						
						dist[i]=dist[index]+graph[index][i];
						
						solutionNum[i]=solutionNum[index];
						
						weight[i]=weight[index]+vertextWeight[i];
						
					}else if(dist[i]==dist[index]+graph[index][i]){
						
						solutionNum[i]+=solutionNum[index];
						
						if(weight[i]<weight[index]+vertextWeight[i]){
							weight[i]=weight[index]+vertextWeight[i];
						}
						
					}
					
				}
			}
			
			
		}
		
		System.out.format("%d %d",solutionNum[end],weight[end]);
		
	}

	private static void init() throws Exception {
		// TODO Auto-generated method stub

		vertextWeight = new int[cityNum];

		for (int i = 0; i < cityNum; i++) {

			vertextWeight[i] = Reader.nextInt();
		}
		
		weight=new int[cityNum];
		
		graph = new int[cityNum][cityNum];

		for (int i = 0; i < cityNum; i++) {

			for (int j = 0; j < cityNum; j++) {
				graph[i][j] = Integer.MAX_VALUE;
			}

		}

		for (int i = 0; i < roadNum; i++) {

			int from = Reader.nextInt();

			int to = Reader.nextInt();

			int legth = Reader.nextInt();

			graph[from][to] = legth;

			graph[to][from] = legth;

		}

		collected = new boolean[cityNum];
		
		collected[start]=true;

		dist = new int[cityNum];
		
		for(int i=0;i<cityNum;i++){
			dist[i]=Integer.MAX_VALUE;
		}

		solutionNum = new int[cityNum];
		
		solutionNum[start]=1;

	}
}
