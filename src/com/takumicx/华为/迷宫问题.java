package com.takumicx.华为;


import java.util.*;

public class 迷宫问题 {


    static int[][] arr;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            arr = new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=scanner.nextInt();
                }
            }
            boolean[][] visited = new boolean[m][n];
            List<Node> list = new ArrayList<>();
            dfs(0,0,list,visited,m,n);
        }

    }

    private static void dfs(int i, int j, List<Node> list, boolean[][] visited,int m,int n) {
        if(i==m-1&&j==n-1){
            list.add(new Node(i,j));
            for(int k=0;k<list.size();k++){
                Node node = list.get(k);
                System.out.println("("+node.x+","+node.y+")");
            }
        } else {

            visited[i][j]=true;
            list.add(new Node(i,j));
            int[] dx={0,0,-1,1};
            int[] dy={-1,1,0,0};
            for(int k=0;k<4;k++){
                int x=i+dx[k];
                int y=j+dy[k];
                if(x>=0&&x<m&&y>=0&&y<n&&!visited[x][y]&&arr[x][y]!=1){
                    dfs(x,y,list,visited,m,n);
                    list.remove(list.size()-1);
                }

            }
        }
    }

    private static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}