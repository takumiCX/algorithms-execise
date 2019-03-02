package com.takumicx.pat.advance;

public class Main1013_ {

	static int[][] graph = new int[1000][1000];

	static boolean[] visited;

	static int cNum = 0;
	static int rNum = 0;

	public static void main(String[] args) throws Exception {

		MyReader.init();

		cNum = MyReader.nextInt();

		rNum = MyReader.nextInt();

		int checkNum = MyReader.nextInt();

		for (int i = 0; i < rNum; i++) {

			int m = MyReader.nextInt();
			int n = MyReader.nextInt();
			graph[m][n] = 1;
			graph[n][m] = 1;
		}

		for (int i = 0; i < checkNum; i++) {
			check(MyReader.nextInt());
		}

	}

	private static void check(int m) {
		// TODO Auto-generated method stub
		visited = new boolean[1000];
		int count = 0;
		for (int i = 1; i <= cNum; i++) {
			if (!visited[i] && i != m) {
				count++;
				dfs(i,m);
			}
		}
		
		System.out.println(count-1);

	}

	private static void dfs(int i,int m) {
		// TODO Auto-generated method stub
		visited[i] = true;
		for(int j=1;j<=cNum;j++){
			if(!visited[j]&&j!=m&&graph[i][j]==1){
				dfs(j,m);
			}
		}

	}
}
