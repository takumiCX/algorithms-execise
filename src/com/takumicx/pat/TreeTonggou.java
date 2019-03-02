package com.takumicx.pat;

import java.util.ArrayList;
import java.util.List;

/**
 * 树的同构
 * @author root
 *
 */
public class TreeTonggou {

	static Node[] nodes1 = new Node[11];

	static Node[] nodes2 = new Node[11];

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int root1 = getRoot(nodes1);

		int root2 = getRoot(nodes2);
		
		String res=isTrue(root1,root2)?"Yes":"No";
		
		System.out.println(res);

	}

	private static boolean isTrue(int root1, int root2) {
		
		if(root1==-1&&root2==-1) return true;
		
		if((root1==-1&&root2!=-1)||(root2==-1&&root1!=-1)){
			
			return false;
		}
		
		
		if(!nodes1[root1].data.equals(nodes2[root2].data)){
			
			return false;
			
		}
		
		return (isTrue(nodes1[root1].left,nodes2[root2].left)&&
				isTrue(nodes1[root1].right,nodes2[root2].right))||
				(isTrue(nodes1[root1].left,nodes2[root2].right)&&
				isTrue(nodes1[root1].right, nodes2[root2].left));
		
		
	}

	private static int getRoot(Node[] nodes) throws Exception {
		// TODO Auto-generated method stub

		int num = Reader.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < num; i++) {

			Node node = new Node();

			node.data = Reader.next();

			String left = Reader.next();

			if ("-".equals(left)) {

				node.left = -1;

			} else {

				node.left = Integer.valueOf(left);

				list.add(Integer.valueOf(left));

			}

			String right = Reader.next();

			if ("-".equals(right)) {

				node.right = -1;

			} else {

				node.right = Integer.valueOf(right);

				list.add(Integer.valueOf(right));

			}
			
			nodes[i]=node;

		}
		
		int root=-1;
		
		for(int i=0;i<num;i++){
			
			if(!list.contains(i)){
				root=i;
				break;
			}
			
		}
		return root;

	}

	static class Node {

		String data;

		int left;

		int right;

	}

}
