package com.takumicx.pat.advance;

public class Main1003_3 {

	static int[][] graph = new int[500][500];
	static boolean[] visited = new boolean[500];
	static int[] pathNum = new int[500];
	static int[] dist = new int[500];
	static int[] weight = new int[500];
	static int[] weightSum = new int[500];

	static int start;
	static int end;
	static int cNum;

	private static void init() {
		// TODO Auto-generated method stub
		pathNum[start]=1;
		for(int i=0;i<cNum;i++){
			dist[i]=Integer.MAX_VALUE;
		}
		dist[start]=0;
		weightSum[start]=weight[start];
		
	}

	public static void main(String[] args) throws Exception {
		MyReader.init();

		cNum = MyReader.nextInt();
		int rNum = MyReader.nextInt();
		start = MyReader.nextInt();
		end = MyReader.nextInt();
		for (int i = 0; i < cNum; i++) {
			weight[i] = MyReader.nextInt();
		}

		for (int i = 0; i < rNum; i++) {
			int from = MyReader.nextInt();
			int end = MyReader.nextInt();
			int lenth = MyReader.nextInt();
			graph[from][end] = lenth;
			graph[end][from] = lenth;
		}

		init();
		
		while(true){
			int minDist=Integer.MAX_VALUE;
			int minDistIndex=-1;
			for(int i=0;i<cNum;i++){
				if(!visited[i]&&dist[i]<minDist){
					minDistIndex=i;
					minDist=dist[i];
				}
			}
			if(minDistIndex==end){
				break;
			}
			visited[minDistIndex]=true;
			for(int i=0;i<cNum;i++){
				
				if(graph[minDistIndex][i]!=0&&!visited[i]){
					if(dist[minDistIndex]+graph[minDistIndex][i]<dist[i]){
						dist[i]=dist[minDistIndex]+graph[minDistIndex][i];
						pathNum[i]=pathNum[minDistIndex];
						weightSum[i]=weightSum[minDistIndex]+weight[i];
					}else if(dist[minDistIndex]+graph[minDistIndex][i]==dist[i]){
						pathNum[i]+=pathNum[minDistIndex];
						if(weightSum[minDistIndex]+weight[i]>weightSum[i]){
							weightSum[i]=weightSum[minDistIndex]+weight[i];
						}
					}
				}
				
			}
			
		}
		System.out.println(pathNum[end]+" "+weightSum[end]);
		
	}

}
